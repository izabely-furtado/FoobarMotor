/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cdp.interpreter;

import cdp.cadeia.IMapa;
import grammar.FoobarLexer;
import grammar.FoobarParser;
import java.util.Scanner;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author IzabelyFurtado
 */
public class Contexto {
    String input;
    IMapa output;
    
    public Contexto(String entra){
        this.input = entra;
        CharStream entrada = new ANTLRInputStream(this.input);
        
        //ANTLRInputStream input = new ANTLRInputStream(System.in);
        FoobarLexer lexer = new FoobarLexer(entrada);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FoobarParser parser = new FoobarParser(tokens);
        
        if (parser.prog().result != null) {
            this.output = parser.prog2().result;
        }
        else {
            throw new RuntimeException("!!! Error");
        }

    }
}
