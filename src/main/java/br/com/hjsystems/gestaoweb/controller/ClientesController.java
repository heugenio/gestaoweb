package br.com.hjsystems.gestaoweb.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.hjsystems.gestaoweb.dto.GeradorDto;
import br.com.hjsystems.gestaoweb.entity.BairrosMunicipios;
import br.com.hjsystems.gestaoweb.entity.Cargos;
import br.com.hjsystems.gestaoweb.entity.DocumentosFiscais;
import br.com.hjsystems.gestaoweb.entity.Estados;
import br.com.hjsystems.gestaoweb.entity.Municipios;
import br.com.hjsystems.gestaoweb.entity.Nacionalidades;
import br.com.hjsystems.gestaoweb.entity.OrcamentosVendas;
import br.com.hjsystems.gestaoweb.entity.OrdemServico;
import br.com.hjsystems.gestaoweb.entity.Pedidos;
import br.com.hjsystems.gestaoweb.entity.Pessoas;
import br.com.hjsystems.gestaoweb.entity.Profissoes;
import br.com.hjsystems.gestaoweb.entity.TiposEndereco;
import br.com.hjsystems.gestaoweb.propertyeditors.CargosPropertyEditor;
import br.com.hjsystems.gestaoweb.propertyeditors.NacionalidadesPropertyEditor;
import br.com.hjsystems.gestaoweb.propertyeditors.ProfissoesPropertyEditor;
import br.com.hjsystems.gestaoweb.repository.BairrosMunicipiosRepository;
import br.com.hjsystems.gestaoweb.repository.CargosRepository;
import br.com.hjsystems.gestaoweb.repository.DocumentosFiscaisRepository;
import br.com.hjsystems.gestaoweb.repository.EnderecosRepository;
import br.com.hjsystems.gestaoweb.repository.EstadosRepository;
import br.com.hjsystems.gestaoweb.repository.MunicipiosRepository;
import br.com.hjsystems.gestaoweb.repository.NacionalidadesRepository;
import br.com.hjsystems.gestaoweb.repository.OrcamentoVendasRepository;
import br.com.hjsystems.gestaoweb.repository.OrdemServicoRepository;
import br.com.hjsystems.gestaoweb.repository.PedidosRepository;
import br.com.hjsystems.gestaoweb.repository.PessoasRepository;
import br.com.hjsystems.gestaoweb.repository.ProfissoesRepository;
import br.com.hjsystems.gestaoweb.repository.TelefonesRepository;
import br.com.hjsystems.gestaoweb.repository.TiposEnderecoRepository;
import br.com.hjsystems.gestaoweb.utilitarios.Utilitarios;

@Controller
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    CargosPropertyEditor cargoPropertyEditor;
    @Autowired
    NacionalidadesPropertyEditor nacionalidadePropertyEditor;
    @Autowired
    ProfissoesPropertyEditor profissoesPropertyEditor;

    @Autowired
    PessoasRepository pessRepo;
    @Autowired
    CargosRepository cargoRepo;
    @Autowired
    ProfissoesRepository profissaoRepo;
    @Autowired
    NacionalidadesRepository NacionalidadeRepo;
    @Autowired
    EnderecosRepository enderecosRepo;
    @Autowired
    TelefonesRepository telefoneRepo;
    @Autowired
    OrdemServicoRepository ordemServRepo;
    @Autowired
    PedidosRepository pedidosRepo;
    @Autowired
    DocumentosFiscaisRepository documentosFiscaisRepo;
    @Autowired
    OrcamentoVendasRepository orcamentoVendasRepo;
    @Autowired
    MunicipiosRepository municipioRepo;
    @Autowired
    EstadosRepository estadoRepo;
    @Autowired
    BairrosMunicipiosRepository bairroMunicipioRepo;
    @Autowired
    TiposEnderecoRepository tiposEnderecoRepo;

    @Autowired
    GeradorDto geraDto;

    @GetMapping("/manutencao")
    public String indexTemplate(Model model) {
        return "clientes/manutencao_clientes";

    }

    @GetMapping(value = {"/pesquisa/{tipoPesquisa}/{paramPesquisa}", "/pesquisa/{tipoPesquisa}"})
    public ResponseEntity<List<Pessoas>> buscaClientes(Model model, @PathVariable String tipoPesquisa,
            @PathVariable Optional<String> paramPesquisa) {
        List<Pessoas> listaPessoas = new ArrayList<>();
        String pesquisa = "";
        if (paramPesquisa.isPresent()) {
            pesquisa = paramPesquisa.get();
        }

        if (tipoPesquisa.equals("cpf")) {
            listaPessoas = pessRepo.findByCPF(pesquisa);
        } else {
            listaPessoas = pessRepo.findByNome(pesquisa);
        }

        return new ResponseEntity<>(listaPessoas, HttpStatus.OK);
    }

    @GetMapping("/buscamunicipios/{estaId}")
    public ResponseEntity<List<Municipios>> buscaMunicipios(Model model, @PathVariable String estaId) {
        List<Municipios> listaMunicipio = new ArrayList<>();
        listaMunicipio = municipioRepo.findByEstadoId(estaId);
        return new ResponseEntity<>(listaMunicipio, HttpStatus.OK);
    }

    @GetMapping("/buscabairros/{muniId}")
    public ResponseEntity<List<BairrosMunicipios>> buscaBairros(Model model, @PathVariable String muniId) {
        List<BairrosMunicipios> listaBairrosMunicipios = new ArrayList<>();
        listaBairrosMunicipios = bairroMunicipioRepo.findByMuniId(muniId);
        return new ResponseEntity<>(listaBairrosMunicipios, HttpStatus.OK);
    }

    @GetMapping("/buscapagina/{ref}")
    public String gereciaPaginas(Model model, @PathVariable String ref) {
        String retorno = "";
        switch (ref) {
            case "alterar":
                retorno = "clientes/form_cliente";
                break;
            case "cadastrar":
                retorno = "clientes/form_cliente";
                break;
        }
        List<String> listaEscolaridade = pessRepo.findEscolaridade();
        List<String> listaEstadoCivil = pessRepo.findEstadoCivil();
        List<Cargos> listaCargos = cargoRepo.findAll();
        List<Profissoes> listaProfissoes = profissaoRepo.findAll();
        List<Nacionalidades> listaNacionalidades = NacionalidadeRepo.findAll();
        List<Estados> listaEstados = estadoRepo.findAll();
        List<String> listaTiposLogradouro = enderecosRepo.findAllTipoLogradouro();
        List<TiposEndereco> listaTiposEndereco = tiposEnderecoRepo.findAll();
        model.addAttribute("listaEscolaridade", listaEscolaridade);
        model.addAttribute("listaEstadoCivil", listaEstadoCivil);
        model.addAttribute("listaCargos", listaCargos);
        model.addAttribute("listaProfissoes", listaProfissoes);
        model.addAttribute("listaNacionalidades", listaNacionalidades);
        model.addAttribute("listaEstados", listaEstados);
        model.addAttribute("listaTiposLogradouro", listaTiposLogradouro);
        model.addAttribute("listaTiposEndereco", listaTiposEndereco);
        return retorno;
    }

    @PostMapping("/salvar")
    public ResponseEntity<Pessoas> salvar(@Valid @ModelAttribute Pessoas pess, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            FieldError error = bindingResult.getFieldErrors().get(0);
            System.out.println(error.getField() + " - " + error.getDefaultMessage());
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        } else {
            String cpf = Utilitarios.removeCaracteres(pess.getPessCpfcnpj());
            List<Pessoas> listaVerifica = pessRepo.findByCPF(cpf);
            if (listaVerifica.isEmpty()) {
                String id = geraDto.geraId("000640010001", "PESSOAS");
                String codigo = geraDto.geraCodigo("000640010001", "PESSOAS");
                pess.setPessId(id);
                pess.setPessDataAtualizacao(new Date(System.currentTimeMillis()));
                pess.setPessLASTUPDATE(new Date(System.currentTimeMillis()));
                pess.setPessCpfcnpj(Utilitarios.removeCaracteres(pess.getPessCpfcnpj()));
                // pess.setPessCodigo(codigo);
                try {
                    pessRepo.save(pess);
                    return new ResponseEntity<>(pess, HttpStatus.OK);
                } catch (Exception e) {
                    return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
                }
            } else {
                return new ResponseEntity<>(null, HttpStatus.CONFLICT);
            }
        }
    }

    @PostMapping("/deletar/{pessId}")
    public ResponseEntity<String> deletar(@PathVariable String pessId) {
        try {
            List<OrdemServico> listaOs = ordemServRepo.findByPessoa(pessRepo.findById(pessId).get());
            List<Pedidos> listaPedidos = pedidosRepo.findByPessoa(pessRepo.findById(pessId).get());
            List<DocumentosFiscais> listaDocumentosFiscais = documentosFiscaisRepo.findByPessoa(pessRepo.findById(pessId).get());
            List<OrcamentosVendas> listaOrcamentoVendas = orcamentoVendasRepo.findByPessoa(pessRepo.findById(pessId).get());

            if (!listaOs.isEmpty()) {
                return new ResponseEntity<>("Não e Possível excluir uma pessoa que possua ordem de serviço.", HttpStatus.OK);
            } else if (!listaPedidos.isEmpty()) {
                return new ResponseEntity<>("Não e Possível excluir uma pessoa que possua pedidos.", HttpStatus.OK);
            } else if (!listaDocumentosFiscais.isEmpty()) {
                return new ResponseEntity<>("Não e Possível excluir uma pessoa que possua notas fiscais.", HttpStatus.OK);
            } else if (!listaOrcamentoVendas.isEmpty()) {
                return new ResponseEntity<>("Não e Possível excluir uma pessoa que possua orçamentos.", HttpStatus.OK);
            } else {
                enderecosRepo.deleteByPessoa(pessRepo.findById(pessId).get());
                telefoneRepo.deleteByPessoa(pessRepo.findById(pessId).get());
                pessRepo.deleteById(pessId);
                return new ResponseEntity<>("", HttpStatus.OK);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            return new ResponseEntity<>(e.getMessage().toString(), HttpStatus.BAD_REQUEST);
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(Cargos.class, cargoPropertyEditor);
        webDataBinder.registerCustomEditor(Profissoes.class, profissoesPropertyEditor);
        webDataBinder.registerCustomEditor(Nacionalidades.class, nacionalidadePropertyEditor);

    }

}
