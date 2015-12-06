grammar Foobar;

@header {
import cdp.cadeia.*;
}


prog returns [IMapa result]:
      m=mapa PONTO{$result = $m.result;};

prog2 returns [IMapa result]:
      nCs=nomeCidades  PVIRG ESPACE d=direcao 
      {IMapa mapaExemplo = new Cidade();
       $result = mapaExemplo.processaConteudo($nCs.result, $d.result);};


mapa returns [IMapa result]:
       LPAR cAtual=cidade RPAR {$result = $cAtual.result;}
      (ESPACE direcao EQUAL LPAR c2=cidade RPAR 
      {$result.setCidade($direcao.result, $c2.result);})*;
      
cidade returns [IMapa result]: 
       c1=nomeCidade {$result = new Cidade($c1.result);};

nomeCidades returns [List<String> result]
 @init{List<String> retorno = new ArrayList<>();}
    :  p1=nomeCidade {retorno.add($p1.result);} 
      (VIRG ESPACE pn=palavra {retorno.add($pn.result);})* 
      {$result = retorno;};


nomeCidade returns [String result]
 @init{String retorno = "";}
    :  p1=palavra {retorno += $p1.result;} 
      (ESPACE pn=palavra {retorno += " " + $pn.result;})* 
      (ESPACE n=number {retorno += " " + $n.result;})?
      {$result = retorno;};

palavra returns [String result]:
      (LETRA)+    {$result = $LETRA.text;};
                                  
direcao returns [int result]: 
     NORTE {$result = 1;}
   | SUL   {$result = 2;}
   | LESTE {$result = 3;}
   | OESTE {$result = 4;};

number returns [Integer result]: 
      INT       {$result = Integer.parseInt($INT.text);  };

INT     : DIGIT+ ;
fragment DIGIT  : [0-9] ;

LETRA : [a-zA-Z_];

NORTE: [Nn][Oo][Rr][Tt][Ee];
SUL  : [Ss][Uu][Ll];
LESTE: [Ll]?[Ee][Ss][Tt][Ee];
OESTE: [Oo][Ee][Ss][Tt][Ee];

PONTO :'.';
LPAR  :'(';
RPAR  :')';
ESPACE:' ';
EQUAL :'='; 
VIRG  :','; 
PVIRG :';'; 


WS : [\t\r\n]+ -> skip;