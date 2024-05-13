package com.example.proyectfinal.flex;

import java.util.ArrayList;
import java_cup.runtime;import kotlinx.coroutines.internal.Symbol;

%%

%class Lexer
%unicode
%line
%column
%caseless
%cup
%public

WORD            = (\"([^\"]|[a-zA-Z]|(\s)|[0-9])+\")
NUMBER          = ([0-9][0-9]*)
COLORWORD       = ("\"#"[0-9a-fA-F]{6}"\"")
SIZEPX          = [0-9] +"px"
WHITESPACE      = ([\s\t\r\n]+)


%{
    ArrayList<String> errors = new ArrayList<>();
    private void addErrors(String error){
        error = yytext() +yyline, yycolumn();
        errors.add(error);
    }
%}}


%eofval{
    return new Symbol(ParserSym.EOF);
%eofval}

%%

//Head
"\"title\"" {return new Symbol(ParserSym.TITLE, yycolumn, yyline, yytext());}
"\"description\"" {return new Symbol(ParserSym.DESCRIPTION, yycolumn, yyline, yytext());}
"\"keywords\"" {return new Symbol(ParserSym.KEYWORDS, yycolumn, yyline, yytext());}
"\"header\"" {return new Symhol(ParserSym.HEADER, yycolumn, yyline, yytext());}
"\"footer\"" {return new Symbol(ParserSym.FOOTER, yycolumn, yyline, yytext());}
"\"backgroundColor\"" {return new Symbol(ParserSym.BACKGROUNDCOLOR, yycolumn, yyline, yytext());}
"\"fontFamily\"" {return new Symbol(ParserSym.FONTFAMILY, yycolumn, yyline, yytext());}
"\"fontSize\"" {return new Symbol(ParserSym.FONTSIZE, yycolumn, yyline, yytext());}
"\"legendPosition\"" {return new Symbol(ParserSym.LEGENDPOSITION, yycolumn, yyline, yytext());}
{SIZEPX} {return new Symbol(ParserSym.SIZEPX, yycolumn, yyline, yytext());}

"\"data\"" {return new Symbol(ParserSym.DATA, yycolumn, yyline, yytext());}
"\"category\"" {return new Symbol(ParserSym.CATEGORY, yycolumn, yyline, yytext());}
"\"value\"" {return new Symbol(ParserSym.VALUE, yycolumn, yyline, yytext());}
"\"color\"" {return new Symbol(ParserSym.COLOR, yycolumn, yyline, yytext());}
"\"label\"" {return new Symbol(ParserSym.LABEL, yycolumn, yyline, yytext());}
"\"size\"" {return new Symbol(ParserSym.SIZE, yycolumn, yyline, yytext());}
"\"data\"" {return new Symbol(ParserSym.DATA, yycolumn, yyline, yytext());}
"\"category\"" {return new Symbol(ParserSym.CATEGORY, yycolumn, yyline, yytext());}

"if" {return new Symbol(ParserSym.IF, yycolumn, yyline, yytext());}
"else" {return new Symbol(ParserSym.ELSE, yycolumn, yyline, yytext());}
"for" {return new Symbol(ParserSym.FOR, yycolumn, yyline, yytext());}
"while" {return new Symbol(ParserSym.WHILE, yycolumn, yyline, yytext());}
"DO" {return new Symbol(ParserSym.DO, yycolumn, yyline, yytext());}
"true" {return new Symbol(ParserSym.TRUE, yycolumn, yyline, yytext());}
"false" {return new Symbol(ParserSym.FALSE, yycolumn, yyline, yytext());}
{COLORWORD} {return new Symbol(ParserSym.COLORWORD, yycolumn, yyline, yytext());}
{NUMBER} {return new Symbol(ParserSym.NUMBER, yycolumn, yyline, yytext());}
{WORD} {return new Symbol(ParserSym.WORD, yycolumn, yyline, yytext());}

"{" {return new Symbol(ParserSym.LLAVECORCHETEA, yycolumn, yyline, yytext());}
"}" {return new Symbol(ParserSym.LLAVECORCHETEC, yycolumn, yyline, yytext());}
"[" {return new Symbol(ParserSym.CORCHETEA, yycolumn, yyline, yytext());}
"]" {return new Symbol(ParserSym.CORCHETEC, yycolumn, yyline, yytext());}
":" {return new Symbol(ParserSym.DOSPUNTOS, yycolumn, yyline, yytext());}
"," {return new Symbol(ParserSym.COMMA, yycolumn, yyline, yytext());}

//Operators
"==" {return new Symbol(ParserSym.EQUALS, yycolumn, yyline, yytext());}
"!=" {return new Symbol(ParserSym.DIFFERENT, yycolumn, yyline, yytext());}
">" {return new Symbol(ParserSym.GREATER, yycolumn, yyline, yytext());}
"<" {return new Symbol(ParserSym.LESS, yycolumn, yyline, yytext());}

{WHITESPACE} {/*  */}
[^] {addErrors(yytext());}