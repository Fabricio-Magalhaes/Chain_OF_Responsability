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
public class SenhasCadastradas extends SistemaSenhas{
    public String senha1 = "asdfg";
    
    public String getSenha1() {
        return senha1;
    }

    public void setSenha1(String senha1) {
        this.senha1 = senha1;
    }
    
    public SenhasCadastradas() {
        super(IDSenhas.senhasCadastradas);
    }
    
    @Override
    protected void logar() {
        if (senha1.equals(this.senha1)){
            System.out.println("Senha ja cadastrada");
        }else{
            System.out.println("Senha cadstrada");
        }
    }
}
