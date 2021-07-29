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
public class CaracterMaiusculo extends SistemaSenhas{
    public String senha1 = "zxd";
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
    
    
    public CaracterMaiusculo() {
        super(IDSenhas.caracterMaiusculo);
    }
    
    @Override
    protected void logar() {
        if ("zxC".equals(this.senha1)){
            System.out.println("Senha Possui pelo um caracter maisculo");
        }else if("zxc".equals(this.senha2)){
            System.out.println("Por favor inseir ao menos um caraceter maisuculo");
        }
    }
    
}
