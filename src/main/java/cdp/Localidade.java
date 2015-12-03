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
public class Localidade extends Mapa{

    
    @Override
    protected void processaAqui(String conteudo) {
        System.out.println("Processa ai budega");
    }

    @Override
    protected String[] strCorrespondentes() {
        return new String[]{"blabla", "hahaha"};
    }
    
}
