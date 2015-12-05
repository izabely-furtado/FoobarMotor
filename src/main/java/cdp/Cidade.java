/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 20121bsi0040
 */
public class Cidade extends Mapa{

    public Cidade(String cidade) {
        super(cidade);
    }

    @Override
    protected void processaAqui(String conteudo) {
        System.out.println("Cidade: " + this.getNomeCidade());
    }

    @Override
    public Map<Integer, String> cidadesCorrespondentes() {
        Map<Integer, String> cidades= new HashMap<>();
        
        if(this.getNorte()!=null){
            cidades.put(DirecaoEnum.NORTE.valorDirecao, this.getNorte().getNomeCidade());
        }
        if(this.getSul()!=null){
            cidades.put(DirecaoEnum.SUL.valorDirecao, this.getSul().getNomeCidade());
        }
        if(this.getLeste()!=null){
            cidades.put(DirecaoEnum.LESTE.valorDirecao, this.getLeste().getNomeCidade());
        }
        if(this.getOeste()!=null){
            cidades.put(DirecaoEnum.OESTE.valorDirecao, this.getOeste().getNomeCidade());
        }
        return cidades;
    }
    
    
}
