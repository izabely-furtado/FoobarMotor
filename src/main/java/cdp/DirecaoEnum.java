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
    
    public static int retornaDirecao(String direcao){
        if(null != direcao)switch (direcao) {
            case "NORTE":
                return DirecaoEnum.NORTE.valorDirecao;
            case "SUL":
                return DirecaoEnum.SUL.valorDirecao;
            case "LESTE":
                return DirecaoEnum.LESTE.valorDirecao;
            case "OESTE":
                return DirecaoEnum.NORTE.valorDirecao;
            default:
                throw new RuntimeException("São tempos difíceis para os sonhadores...");
        }
        throw new RuntimeException("São tempos difíceis para os sonhadores...");
    }
}
