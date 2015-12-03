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
public enum DirecaoEnum {
    NORTE(1), SUL(2), LESTE(3), OESTE(4);
    
    public int valorDirecao;
    DirecaoEnum(int valor){
        this.valorDirecao = valor;
    }
    
    public int retornaDirecao(String direcao){
        if("NORTE".equals(direcao)){
            return DirecaoEnum.NORTE.valorDirecao;
        }
        else if("SUL".equals(direcao)){
            return DirecaoEnum.SUL.valorDirecao;
        }
        else if("LESTE".equals(direcao)){
            return DirecaoEnum.LESTE.valorDirecao;
        }
        else if("OESTE".equals(direcao)){
            return DirecaoEnum.NORTE.valorDirecao;
        }
        else{
            throw new RuntimeException("São tempos difíceis para os sonhadores...");
        }
    }
}
