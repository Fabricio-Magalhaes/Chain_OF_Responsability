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
public class CaracterEspecial extends SistemaSenhas{
    public String senha1 = "zx@";
    public String senha2 = "zxc";
    
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
    
    
    public CaracterEspecial() {
        super(IDSenhas.caracterEspecial);
    }
    
    @Override
    protected void logar() {
        if (senha1.equals(this.senha1)){
            System.out.println("Senha Possui pelo um caracter especial");
        }else if(senha2.equals(this.senha2)){
            System.out.println("Por favor inseir ao menos um caraceter especial");
        }
    }
}
