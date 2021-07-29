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
public class SenhaConsecutivas extends SistemaSenhas{
    public String senha1 = "zx1";
    public String senha2 = "aaaaaaaaaaaaa";
    
    public String getSenha1() {
        return senha1;
    }

    public void setSenha1(String senha1) {
        this.senha1 = senha1;
    }

    public String getSenha2() {
        return senha2;
    }

    public void setSenha2(String senha2) {
        this.senha2 = senha2;
    }
    
    public SenhaConsecutivas() {
        super(IDSenhas.SenhaConsecutivas);
    }
    
    @Override
    protected void logar() {
        if (senha1.equals(this.senha1)){
            System.out.println("Senha não Possui formas concecutiva");
        }else if(senha2.equals(this.senha2)){
            System.out.println("Erro senha consecutiva");
        }
    }
}
