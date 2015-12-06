package app;

import cdp.cadeia.IMapa;
import cdp.interpreter.Contexto;
import grammar.FoobarLexer;
import grammar.FoobarParser;
import java.io.IOException;
import java.util.Scanner;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 20121bsi0040
 */
public class Aplication {
    public static void main(String[] args) throws IOException {
        String entrada ="Serra, Cariacica, Iuna, Aracruz; Norte";
        Contexto c= new Contexto(entrada);
        
        /*Scanner le = new Scanner(System.in);
        String lendo = le.next();
        String entrada = "(Serra) "
                + "Norte=(Aracruz) Norte=(Linhares) Norte=(Sao Mateus) Norte=(Teixeira de Freitas) "
                + "Sul=(Vitoria) Sul=(Guarapari) Sul=(Piuma) "
                + "Oeste=(Venda Nova do Imigrante) Oeste=(Santa Maria de Jetiba) Oeste=(Iuna).";
        CharStream input = new ANTLRInputStream(lendo);
        
        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        FoobarLexer lexer = new FoobarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FoobarParser parser = new FoobarParser(tokens);
        
        IMapa mapa = parser.prog().result;
        if (mapa != null) {
            System.out.printf("::> %s\n", mapa.getNomeCidade());
            System.out.printf(">>> %s\n", mapa.getNorte().getNomeCidade());
        }
        else {
            System.out.println("!!! Error");
        }
                */
    }
}
