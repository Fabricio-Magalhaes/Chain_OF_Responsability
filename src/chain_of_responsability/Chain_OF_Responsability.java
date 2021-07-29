
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain_of_responsability;

/**
 *
 * @author Usuario
 */
public class Chain_OF_Responsability {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemaSenhas logar1 = new SenhasCadastradas();
        logar1.setProximo(new CaracterMaiusculo());
        logar1.setProximo(new CaracterMinusculo());
        logar1.setProximo(new CaracterEspecial());
        logar1.setProximo(new MenorDezesseis());
        logar1.setProximo(new SenhaConsecutivas());
        logar1.setProximo(new SenhaNumero());
        logar1.setProximo(new SenhaOitoCaracteres());
        
        try{
            logar1.logarSenha(IDSenhas.senhasCadastradas);
            logar1.logarSenha(IDSenhas.SenhaNumero);
            logar1.logarSenha(IDSenhas.MenorDezesseis);
            logar1.logarSenha(IDSenhas.SenhaConsecutivas);
            logar1.logarSenha(IDSenhas.SenhaOitoCaracteres);
            logar1.logarSenha(IDSenhas.caracterEspecial);
            logar1.logarSenha(IDSenhas.caracterMaiusculo);
            logar1.logarSenha(IDSenhas.caracterMinusculo);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
