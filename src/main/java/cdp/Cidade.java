/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        System.out.println("Processa ai budega");
    }

    @Override
    protected Map<int, String> strCorrespondentes() {
        Map<int, String> str= new HashMap<int, String>();
        
        if(this.getNorte()!=null){
            str.put(1, this.getNorte().getNomeCidade());
        }
        if(this.getSul()!=null){
            str.put(2, this.getSul().getNomeCidade());
        }
        if(this.getLeste()!=null){
            str.put(3, this.getLeste().getNomeCidade());
        }
        if(this.getOeste()!=null){
            str.put(4, this.getOeste().getNomeCidade());
        }
        return str;
    }
    
}
