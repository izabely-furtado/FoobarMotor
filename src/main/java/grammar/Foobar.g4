grammar Foobar;

prog returns [Mapa result]:
      m=mapa PONTO{$result = $m.result;};

mapa returns [Mapa result]:
       LPAR cAtual=cidade RPAR {$result = $cAtual.result;}
      (ESPACE direcao EQUAL LPAR c2=cidade RPAR 
      {$result.setCidade($direcao.result, $c2.result);})*;
      
cidade returns [Mapa result]: 
       c1=nomeCidade {$result = new Cidade($c1.result);};

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
