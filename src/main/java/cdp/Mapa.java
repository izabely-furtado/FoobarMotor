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
public abstract class Mapa implements IMapa{
    private IMapa elementoNorte;
    private IMapa elementoSul;
    private IMapa elementoLeste;
    private IMapa elementoOeste;
    private String cidade;
    
    public Mapa(String cidade){
        this.cidade = cidade;
    }
    
    public void setDiracao(int direcao, IMapa elemento) {
        this.elementoNorte = elemento;
    }
    
    
    @Override
    public void setNorte(IMapa elemento) {
        this.elementoNorte = elemento;
    }
    
    @Override
    public void setSul(IMapa elemento) {
        this.elementoSul = elemento;
    }
    
    @Override
    public void setLeste(IMapa elemento) {
        this.elementoLeste = elemento;
    }
    
    @Override
    public void setOeste(IMapa elemento) {
        this.elementoOeste = elemento;
    }
    

    @Override
    public void processaConteudo(int direcao) {
        boolean wordFound = false;
        //se o conteudo estiver vazio
        if (strCorrespondentes().length == 0){
            wordFound = true;
        }
        //se o conteudo n estiver vazio 
        else{
            
            for(String str: this.strCorrespondentes()){
                if(direcao.contains(str)){
                    wordFound = true;
                    break;
                }
            }
        }
        //se esta no objeto
        if (wordFound){
            this.processaConteudo(direcao);
        }
        else{
            this.elementoNorte.processaConteudo(direcao);
        }
    }
    
    protected abstract String[] strCorrespondentes();
    protected abstract void processaAqui(String conteudo);
    
}
