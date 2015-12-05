/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

import java.util.List;

/**
 *
 * @author 20121bsi0040
 */
public interface IMapa {
    
    public void setNorte(IMapa elemento);
    public void setSul(IMapa elemento);
    public void setLeste(IMapa elemento);
    public void setOeste(IMapa elemento);
    public void setCidade(int direcao, IMapa elemento);
    
    public IMapa getNorte();
    public IMapa getSul();
    public IMapa getLeste();
    public IMapa getOeste();
    public IMapa getCidade(int direcao);
    
    public String getNomeCidade();
    
    public void processaConteudo(List<String> cidades, Integer direcao);
}
