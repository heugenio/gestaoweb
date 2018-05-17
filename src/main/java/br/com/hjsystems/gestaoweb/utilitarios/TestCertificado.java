/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.videoaulasneri.adelcio.utilitarios;

import br.com.samuelweb.certificado.Certificado;
import br.com.samuelweb.certificado.CertificadoService;
import br.com.samuelweb.certificado.TipoCertificadoA3;
import br.com.samuelweb.certificado.exception.CertificadoException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Porto
 */
public class TestCertificado {

    public void exibeCertificados() {
        String alias = "a3";  //"E B LOMBARDI E CIA LTDA EPP:02062415000115";  
        Certificado certificado = null;
        try {  
            JOptionPane.showMessageDialog(null, "TestCertificado - passou 1 . . .");
//            certificado = CertificadoService.listaCertificadosWindows().stream().filter( cert ->  
//                    alias.equalsIgnoreCase(cert.getNome())).findFirst().get();
//            certificado = CertificadoService.listaCertificadosWindows().stream().filter( cert ->  
//                    alias.indexOf(cert.getNome()) != -1).findFirst().get();
//            List<Certificado> listCert = CertificadoService.listaCertificadosWindows();
//            int idx = 0;
//            for (Certificado cert : listCert) {
//                idx++;
//                JOptionPane.showMessageDialog(null, "TestCertificado - certificado: " + idx);
//            }
//  certificado A1
          certificado = CertificadoService.certificadoPfx("C:\\nfe\\\\dados\\empr0001\\certificado.pfx", "serasa");  

// certificado A3
//            certificado = CertificadoService.certificadoA3(TipoCertificadoA3.OBERTHUR.getMarca() , TipoCertificadoA3.OBERTHUR.getDll(), "1234");  
            JOptionPane.showMessageDialog(null, "TestCertificado - passou 2 . . .");
            InputStream inputStreamCacert;  
            inputStreamCacert = new FileInputStream(new File("C:\\nfe\\NFeCacerts\\NFeCacerts"));
            JOptionPane.showMessageDialog(null, "TestCertificado - passou 3 . . .");
            CertificadoService.inicializaCertificado(certificado, inputStreamCacert);  
            JOptionPane.showMessageDialog(null, "Encontrou o certificado!");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(TestCertificado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não encontrou o certificado! Erro(1): " + ex);
        } catch (CertificadoException ex) {
            //Logger.getLogger(TestCertificado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não encontrou o certificado! Erro(2): " + ex);
        } catch (Exception ex) {
            //Logger.getLogger(TestCertificado.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não encontrou o certificado! Erro(3): " + ex);
        }
            JOptionPane.showMessageDialog(null, "Fim do Método para encontrar o certificado!");
        
    }
}
