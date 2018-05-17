/*

Descri��o: Transmiss�o / Autoriza��o da Manifesta��o de NFe

*/
package br.com.hjsystems.gestaoweb.nfeweb.eventos;


public class ManifestacaoNFe {
/*
try{
        //Inicia As Configura��es
        ConfiguracoesIniciaisNfe config = iniciaConfigura��es();

        //Substituua os X Pela Chave da Nota que deseja Manifestar
        String chave = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
        String id = "ID210210"+chave+"01";

        br.inf.portalfiscal.nfe.schema.envConfRecebto.TEnvEvento envEvento = new br.inf.portalfiscal.nfe.schema.envConfRecebto.TEnvEvento();
        envEvento.setVersao("1.00");
        envEvento.setIdLote("1");

        br.inf.portalfiscal.nfe.schema.envConfRecebto.TEvento evento = new br.inf.portalfiscal.nfe.schema.envConfRecebto.TEvento();
        evento.setVersao("1.00");

        br.inf.portalfiscal.nfe.schema.envConfRecebto.TEvento.InfEvento infEvento = new br.inf.portalfiscal.nfe.schema.envConfRecebto.TEvento.InfEvento();
        infEvento.setId(id);
        infEvento.setCOrgao("91");
        infEvento.setTpAmb(config.getAmbiente());

        //Substituua os X Pelo CNPJ
        infEvento.setCNPJ("XXXXXXXXXXXXXX");
        infEvento.setChNFe(chave);

        //Altere a Data
        infEvento.setDhEvento("2016-08-15T10:20:03-03:00");
        infEvento.setTpEvento("210210");
        infEvento.setNSeqEvento("1");
        infEvento.setVerEvento("1.00");

        br.inf.portalfiscal.nfe.schema.envConfRecebto.TEvento.InfEvento.DetEvento detEvento = new br.inf.portalfiscal.nfe.schema.envConfRecebto.TEvento.InfEvento.DetEvento();
        detEvento.setVersao("1.00");
        detEvento.setDescEvento("Ciencia da Operacao");
        infEvento.setDetEvento(detEvento);
        evento.setInfEvento(infEvento);
        envEvento.getEvento().add(evento);

        //Informe false para n�o fazer a valida��o do XML - Ganho De tempo.
        br.inf.portalfiscal.nfe.schema.retEnvConfRecebto.TRetEnvEvento retorno =  Nfe.manifestacao(envEvento,false);
        System.out.println("Status:" + retorno.getRetEvento().get(0).getInfEvento().getCStat());
        System.out.println("Motivo:" + retorno.getRetEvento().get(0).getInfEvento().getXMotivo());
        System.out.println("Data:" + retorno.getRetEvento().get(0).getInfEvento().getDhRegEvento());

    } catch (NfeException e) {
        System.out.println("Erro:" + e.getMessage());
    }
*/
}