/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

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
        this.elementoLeste = null;
        this.elementoSul = null;
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
        if(this.elementoSul==null){
            this.elementoSul = elemento;
        }
        else{
            this.elementoSul.setSul(elemento);
        }
    }
    
    @Override
    public void setLeste(IMapa elemento) {
        if(this.elementoLeste==null){
            this.elementoLeste = elemento;
        }
        else{
            this.elementoLeste.setLeste(elemento);
        }
    }
    
    @Override
    public void setOeste(IMapa elemento) {
        if(this.elementoOeste==null){
            this.elementoOeste = elemento;
        }
        else{
            this.elementoOeste.setOeste(elemento);
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
    public IMapa processaConteudo(List<String> cidades, Integer direcao) {
        boolean cidadeEncontrada =  false;
        //se o conteudo estiver vazio
        if (this.cidadesCorrespondentes().isEmpty()){
            cidadeEncontrada = false;
        }
        //verifica se o conteudo pode estar dentre as cidades diretamente mais proximas 
        else{
            if(cidades.contains(this.cidadesCorrespondentes().get(direcao))){
                cidadeEncontrada = true;
            }
        }
        //se proximo ao objeto
        if (cidadeEncontrada){
            return this.getCidade(direcao);
        }
        //procura se esta mais longe, mas na mesma direção
        else{
            if (this.getCidade(direcao) != null){
                return this.getCidade(direcao).processaConteudo(cidades, direcao);
            }
            else{
                throw new RuntimeException("Nenhuma das cidades indicadas fica nessa direção");
            }
        }
        
    }
    
    public abstract Map<Integer, String> cidadesCorrespondentes();
    protected abstract void processaAqui(String conteudo);
    
}
