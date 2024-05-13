parser grammar ReactParser;

options {
  tokenVocab=ReactLexer;
}

prog: ( imp
       | decl
       | assign
       | ifState
       | fun
       | SEMICOLON
       )* export? SEMICOLON?
        EOF;

useStateDecl: (CONST|VAR|LET) OPEN_SQUAREBRACKET
               ID COMMA ID CLOSE_SQUAREBRACKET EQUAL ;
useStateVal: USESTATE   val CLOSE_PARENTHESIS;

assign: ID EQUAL val
 ;

exp : exp MULT exp
    | exp DIV exp
    | exp ADD exp
    | exp SUB exp
    | num
    | ID
    ;

num:SUB? NUMBER
 ;
decl: CONST ID EQUAL val
    | (VAR|LET) ID (EQUAL val)?
    | useStateDecl  useStateVal
    ;

val:STRING
   |ID
   |BOOLEAN
   |exp
   |jsx
   |list
   |obj
   |valObjList
   |pureReact
 ;
pureReact:React OPEN_PARENTHESIS reactElelment* CLOSE_SQUAREBRACKET
 ;
reactElelment:STRING COMMA  OPEN_CURLYBRACES attributeR* CLOSE_CURLYBRACES
 ;
 attributeR:attribute
 |SRC EQUAL (OPEN_CURLYBRACES val CLOSE_CURLYBRACES|val)
 |IMG EQUAL (OPEN_CURLYBRACES val CLOSE_CURLYBRACES|val)
  ;
valObjList:  ID DOT ID
            |ID OPEN_SQUAREBRACKET exp CLOSE_SQUAREBRACKET
            ;
ifState: IF OPEN_PARENTHESIS condition CLOSE_PARENTHESIS (OPEN_CURLYBRACES )
 ;
else: ELSE (OPEN_CURLYBRACES)
 ;

condition:val ISEQUAL val
         |val SOE    val
         |val GOE    val
         |BOOLEAN
         ;

obj:OPEN_CURLYBRACES varObj? CLOSE_CURLYBRACES
 ;
varObj:(ID COLON val|ID)  (COMMA ID COLON val|COMMA ID)*
 ;

list:OPEN_SQUAREBRACKET varlist? CLOSE_SQUAREBRACKET
 ;
varlist:(val)((COMMA val)*)(COMMA)?
 ;
jsx:element
 ;
 element: imgElement
        | normalElement
        | component
        | emptyElement
        ;

emptyElement:SMALLERTHAN  attribute* GREATERTHAN content*  CLOSETAG  GREATERTHAN;
normalElement:SMALLERTHAN NORMALELEMENT attribute* GREATERTHAN content*  CLOSETAG NORMALELEMENT  GREATERTHAN
 ;
content:(CONTENT|jsxExp|element)
 ;

attribute:(
            ONCLICK EQUAL OPEN_CURLYBRACES (val|ID OPEN_PARENTHESIS val CLOSE_PARENTHESIS) CLOSE_CURLYBRACES
           |CLASSNAME EQUAL val
           |STYLE EQUAL OPEN_CURLYBRACES OPEN_CURLYBRACES css? CLOSE_CURLYBRACES CLOSE_CURLYBRACES
           |KEY EQUAL OPEN_CURLYBRACES val CLOSE_CURLYBRACES
           )
           ;

css: ID COLON val (COMMA ID COLON val)*
 ;
jsxExp: OPEN_CURLYBRACES (map|val)? CLOSE_CURLYBRACES
 ;
map:ID DOT MAP OPEN_PARENTHESIS ID ARROW jsx  CLOSE_PARENTHESIS
 ;
//varElement:imgElement|anchorElement
 //;

imgElement:SMALLERTHAN IMG (attribute|(SRC|ALT) EQUAL (OPEN_CURLYBRACES val CLOSE_CURLYBRACES|val))* SELFCLOSETAG
 ;

//anchorElement:SMALLERTHAN ANCHOR (attribute|HREF EQUAL (OPEN_CURLYBRACES val CLOSE_CURLYBRACES|val))*
  //            GREATERTHAN cntent*  CLOSETAG ANCHOR  GREATERTHAN
    //          ;

component:SMALLERTHAN ID comAttribute* SELFCLOSETAG
 ;
comAttribute: ID EQUAL OPEN_CURLYBRACES val CLOSE_CURLYBRACES
 ;
imp : IMPORT varimp  FROM (STRING)
    | IMPORT (STRING)
 ;
varimp:(OPEN_CURLYBRACES  ID CLOSE_CURLYBRACES|ID)
       (COMMA OPEN_CURLYBRACES  ID CLOSE_CURLYBRACES|COMMA ID)*
       ;
fun: FUNCTION ID param STARTFUN funBody CLOSE_CURLYBRACES
   | CONST ID EQUAL param ARROW OPEN_CURLYBRACES funBody CLOSE_CURLYBRACES
 ;

param : OPEN_PARENTHESIS ID? (COMMA ID)*
 ;

funBody : (decl
          |assign
          |return
          |ifState funBody CLOSE_CURLYBRACES (else funBody CLOSE_CURLYBRACES)?
          |SEMICOLON
          )*
 ;

return:RETURN (OPEN_PARENTHESIS val CLOSE_PARENTHESIS |val)?
 ;
export:EXPORT DEFAULT ID
 ;
