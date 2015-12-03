/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

/**
 *
 * @author 20121bsi0040
 */
public interface IMapa {
    public void setNorte(IMapa elemento);
    public void setSul(IMapa elemento);
    public void setLeste(IMapa elemento);
    public void setOeste(IMapa elemento);
    
    public void processaConteudo(int conteudo);
}
