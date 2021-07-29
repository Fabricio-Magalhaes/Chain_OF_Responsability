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
public abstract class SistemaSenhas {
    protected SistemaSenhas proximo;
    protected IDSenhas idSenhas;
    
    public SistemaSenhas(IDSenhas id){
        proximo = null;
        idSenhas = id;
    }
    
    public void setProximo(SistemaSenhas proximos){
        if(proximo == null){
            proximo = proximos;
        }else{
            proximo.setProximo(proximos);
        }
    }
    
    public void logarSenha(IDSenhas id) throws Exception{
        if(podeLogar(id)){
            logar();
        }else{
            if(proximo == null){
                throw new Exception("Senha não cadastrada");
            }
            proximo.logarSenha(id);
        }
    }
    
    private boolean podeLogar(IDSenhas id){
        if(idSenhas == id){
            return true;
        }
        return false;
    }
    protected abstract void logar();
}
