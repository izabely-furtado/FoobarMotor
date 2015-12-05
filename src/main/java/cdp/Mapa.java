/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author 20121bsi0040
 */
public abstract class Mapa implements IMapa{
    private IMapa elementoNorte;
    private IMapa elementoSul;
    private IMapa elementoLeste;
    private IMapa elementoOeste;
    private final String cidade;
    
    public Mapa(String cidade){
        this.cidade = cidade;
    }
    
    @Override
    public String getNomeCidade(){
        return this.cidade;
    }
    
    @Override
    public void setCidade(int direcao, IMapa elemento) {
        if(direcao==DirecaoEnum.NORTE.valorDirecao){
            this.setNorte(elemento);
        }
        else if(direcao==DirecaoEnum.SUL.valorDirecao){
            this.setSul(elemento);
        }
        else if(direcao==DirecaoEnum.LESTE.valorDirecao){
            this.setLeste(elemento);
        }
        else if(direcao==DirecaoEnum.OESTE.valorDirecao){
            this.setOeste(elemento);
        }
        else{
            throw new RuntimeException("Quando o dedo aponta para o céu, o idiota olha para o dedo!");
        }
    }
    
    @Override
    public void setNorte(IMapa elemento) {
        if(this.elementoNorte==null){
            this.elementoNorte = elemento;
        }
        else{
            this.elementoNorte.setNorte(elemento);
        }
    }
    
    @Override
    public void setSul(IMapa elemento) {
        if(this.elementoNorte==null){
            this.elementoSul = elemento;
        }
        else{
            this.elementoNorte.setNorte(elemento);
        }
    }
    
    @Override
    public void setLeste(IMapa elemento) {
        if(this.elementoNorte==null){
            this.elementoLeste = elemento;
        }
        else{
            this.elementoNorte.setNorte(elemento);
        }
    }
    
    @Override
    public void setOeste(IMapa elemento) {
        if(this.elementoNorte==null){
            this.elementoOeste = elemento;
        }
        else{
            this.elementoNorte.setNorte(elemento);
        }
    }
    
    @Override
    public IMapa getCidade(int direcao){
        if(direcao==DirecaoEnum.NORTE.valorDirecao){
            return this.getNorte();
        }
        else if(direcao==DirecaoEnum.SUL.valorDirecao){
            return this.getSul();
        }
        else if(direcao==DirecaoEnum.LESTE.valorDirecao){
            return this.getLeste();
        }
        else if(direcao==DirecaoEnum.OESTE.valorDirecao){
            return this.getOeste();
        }
        else{
            throw new RuntimeException("Não tem nenhuma compaixão pelos meus nervos?");
        }
    }
    
    @Override
    public IMapa getNorte(){
        return this.elementoNorte;
    }

    @Override
    public IMapa getSul(){
        return this.elementoSul;
    }
    
    @Override
    public IMapa getLeste(){
        return this.elementoLeste;
    }
    
    @Override
    public IMapa getOeste(){
        return this.elementoOeste;
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
            
            if(this.strCorrespondentes().contains()){
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
    
    public abstract java.util.Map<int, String> strCorrespondentes();
    protected abstract void processaAqui(String conteudo);
    
}
