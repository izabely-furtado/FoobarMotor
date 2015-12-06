package testes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cdp.cadeia.Cidade;
import cdp.cadeia.DirecaoEnum;
import cdp.cadeia.IMapa;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author IzabelyFurtado
 */
public class testMapa {
    IMapa mapa;
    public testMapa() {
        this.mapa = new Cidade();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    
    @Test
    public void getNome() {
        assertEquals("Serra", this.mapa.getNomeCidade());
    }
    
    @Test
    public void getNorte(){
        assertEquals("Aracruz", this.mapa.getNorte().getNomeCidade());
    }
    
    @Test
    public void getLeste(){
        assertEquals(null, this.mapa.getLeste());
    }

    @Test
    public void getCidade(){
        assertEquals("Vitória", this.mapa.getCidade(DirecaoEnum.SUL.valorDirecao).getNomeCidade());
    }

    @Test
    public void getSul(){
        assertEquals("Vitória", this.mapa.getSul().getNomeCidade());
    }

    @Test
    public void setLeste(){
        IMapa mapa2 = new Cidade("Serra");
        mapa2.setLeste(new Cidade("Atlantida"));
        assertEquals("Atlantida", mapa2.getLeste().getNomeCidade());
    }
    
    @Test
    public void setCidadeNorte(){
        IMapa mapa2 = new Cidade("Serra");
        mapa2.setNorte(new Cidade("Aracruz"));
        mapa2.setCidade(DirecaoEnum.NORTE.valorDirecao, new Cidade("Polo Norte"));
        assertEquals("Polo Norte", mapa2.getNorte().getNorte().getNomeCidade());
    }
    
    @Test
    public void setCidadeSul(){
        IMapa mapa2 = new Cidade("Serra");
        mapa2.setCidade(DirecaoEnum.SUL.valorDirecao, new Cidade("Polo Sul"));
        assertEquals("Polo Sul", mapa2.getSul().getNomeCidade());
    }
    
    @Test
    public void setCidadeLeste(){
        IMapa mapa2 = new Cidade("Serra");
        mapa2.setCidade(DirecaoEnum.LESTE.valorDirecao, new Cidade("Atlantida"));
        assertEquals("Atlantida", mapa2.getLeste().getNomeCidade());
    }
    
    @Test
    public void setCidadeOeste(){
        IMapa mapa2 = new Cidade("Serra");
        mapa2.setCidade(DirecaoEnum.OESTE.valorDirecao, new Cidade("Ilha da Pascoa"));
        assertEquals("Ilha da Pascoa", mapa2.getOeste().getNomeCidade());
    }
    /*
    @Test
    public void setCidadeERRO(){
        IMapa mapa2 = new Cidade("Serra");
        mapa2.setCidade(9, new Cidade("Atlantida"));
        assertEquals(null, mapa2.getLeste().getNomeCidade());
    }
    */
    
    @Test
    public void processaConteudoNORTE(){
        List<String> cidades = new ArrayList<>();
        cidades.add("Serra");
        cidades.add("Aracruz");
        cidades.add("São Mateus");
        cidades.add("Teixeira de Freitas");
        cidades.add("Vitória");
        cidades.add("Guarapari");
        cidades.add("Piuma");
        cidades.add("Venda Nova do Imigrante");
        cidades.add("Santa Maria de Jetibá");
        cidades.add("Iúna");
   
        assertEquals("Aracruz", this.mapa.processaConteudo(cidades, DirecaoEnum.NORTE.valorDirecao).getNomeCidade());
    }
    
    @Test
    public void processaConteudoNORTE2(){
        List<String> cidades = new ArrayList<>();
        cidades.add("São Mateus");
        cidades.add("Teixeira de Freitas");
        cidades.add("Vitória");
        cidades.add("Guarapari");
        cidades.add("Piuma");
        cidades.add("Venda Nova do Imigrante");
        cidades.add("Santa Maria de Jetibá");
        cidades.add("Iúna");
   
        assertEquals("São Mateus", this.mapa.processaConteudo(cidades, DirecaoEnum.NORTE.valorDirecao).getNomeCidade());
    }
    
    @Test
    public void processaConteudoNORTE3(){
        List<String> cidades = new ArrayList<>();
        cidades.add("Teixeira de Freitas");
        cidades.add("Vitória");
        cidades.add("Guarapari");
        cidades.add("Piuma");
        cidades.add("Venda Nova do Imigrante");
        cidades.add("Santa Maria de Jetibá");
        cidades.add("Iúna");
   
        assertEquals("Teixeira de Freitas", this.mapa.processaConteudo(cidades, DirecaoEnum.NORTE.valorDirecao).getNomeCidade());
    }
   
    /*
    @Test
    public void processaConteudoNorteERRO(){
        List<String> cidades = new ArrayList<>();
        cidades.add("Vitória");
        cidades.add("Guarapari");
        cidades.add("Piuma");
        cidades.add("Venda Nova do Imigrante");
        cidades.add("Santa Maria de Jetibá");
        cidades.add("Iúna");
   
        assertEquals("Vitória", this.mapa.processaConteudo(cidades, DirecaoEnum.NORTE.valorDirecao).getNomeCidade());
    }
    */
    
    @Test
    public void processaConteudoSul(){
        List<String> cidades = new ArrayList<>();
        cidades.add("Vitória");
        cidades.add("Guarapari");
        cidades.add("Piuma");
        cidades.add("Venda Nova do Imigrante");
        cidades.add("Santa Maria de Jetibá");
        cidades.add("Iúna");
   
        assertEquals("Vitória", this.mapa.processaConteudo(cidades, DirecaoEnum.SUL.valorDirecao).getNomeCidade());
    }
    
    @Test
    public void processaConteudoSul2(){
        List<String> cidades = new ArrayList<>();
        cidades.add("Guarapari");
        cidades.add("Piuma");
        cidades.add("Venda Nova do Imigrante");
        cidades.add("Santa Maria de Jetibá");
        cidades.add("Iúna");
   
        assertEquals("Guarapari", this.mapa.processaConteudo(cidades, DirecaoEnum.SUL.valorDirecao).getNomeCidade());
    }
    
    @Test
    public void processaConteudoSul3(){
        List<String> cidades = new ArrayList<>();
        cidades.add("Piuma");
        cidades.add("Venda Nova do Imigrante");
        cidades.add("Santa Maria de Jetibá");
        cidades.add("Iúna");
   
        assertEquals("Piuma", this.mapa.processaConteudo(cidades, DirecaoEnum.SUL.valorDirecao).getNomeCidade());
    }
    
    /*
    @Test
    public void processaConteudoSulERRO(){
        List<String> cidades = new ArrayList<>();
        cidades.add("Venda Nova do Imigrante");
        cidades.add("Santa Maria de Jetibá");
        cidades.add("Iúna");
   
        assertEquals("Venda Nova do Imigrante", this.mapa.processaConteudo(cidades, DirecaoEnum.SUL.valorDirecao).getNomeCidade());
    }
    */
    
    @Test
    public void processaConteudoOeste(){
        List<String> cidades = new ArrayList<>();
        cidades.add("Venda Nova do Imigrante");
        cidades.add("Santa Maria de Jetibá");
        cidades.add("Iúna");
   
        assertEquals("Venda Nova do Imigrante", this.mapa.processaConteudo(cidades, DirecaoEnum.OESTE.valorDirecao).getNomeCidade());
    }
    
    @Test
    public void processaConteudoOeste2(){
        List<String> cidades = new ArrayList<>();
        cidades.add("Santa Maria de Jetibá");
        cidades.add("Iúna");
   
        assertEquals("Santa Maria de Jetibá", this.mapa.processaConteudo(cidades, DirecaoEnum.OESTE.valorDirecao).getNomeCidade());
    }
    
    @Test
    public void processaConteudoOeste3(){
        List<String> cidades = new ArrayList<>();
        cidades.add("Iúna");
   
        assertEquals("Iúna", this.mapa.processaConteudo(cidades, DirecaoEnum.OESTE.valorDirecao).getNomeCidade());
    }
    
    /*
    @Test
    public void processaConteudoOesteERRO(){
        List<String> cidades = new ArrayList<>();
        cidades.add("Vitória");
   
        assertEquals("Vitória", this.mapa.processaConteudo(cidades, DirecaoEnum.OESTE.valorDirecao).getNomeCidade());
    }
    */
    
    
    
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
}
