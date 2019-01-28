grammar Grammar;

@header{
import grammar.*;
}

start returns [Grammar v]
        : NTERM              { $v = new Grammar($NTERM.text); }
          (choose_roole[$v] ';')+
        ;

choose_roole[Grammar gr]
        : TERM '=' STRING    { $gr.addTermRule(new TermRule(false, $TERM.text, $STRING.text)); }
        | TERM ':' STRING    { $gr.addTermRule(new TermRule(true, $TERM.text, $STRING.text)); }
        | my_rule              { $gr.addNonTermRule($my_rule.v); }
        ;

my_rule returns [NonTermRule v]
        : NTERM args my_returns '=' { $v = new NonTermRule($NTERM.text, $args.v, $my_returns.v); }
          rightPart               { $v.addRule($rightPart.v); }
          ('|' rightPart          { $v.addRule($rightPart.v); })*
        ;

args returns [List<Argument> v]
        : '(' arg           { $v = new ArrayList<>(); }
                            { $v.add($arg.v); }
          (',' arg          { $v.add($arg.v); })*
          ')'
        |                   { $v = new ArrayList<>(); }
        ;

my_returns returns [List<Argument> v]
        : '[returns' arg    { $v = new ArrayList<>(); }
                            { $v.add($arg.v); }
          (',' arg          { $v.add($arg.v); })*
          ']'
        |                   { $v = new ArrayList<>(); }
        ;

arg returns [Argument v]
        : NTERM ':' type    { $v = new Argument($NTERM.text, $type.v); }
        ;

type returns [String v]
        : NTERM { $v = $NTERM.text; }
        | TERM  { $v = $TERM.text; }
        ;

rightPart returns [List<RuleToken> v]
        :               { $v = new ArrayList<>(); }
        (ruleToken        { $v.add($ruleToken.v); })+
        ;

ruleToken returns [RuleToken v]
        : TERM          { $v = new Term($TERM.text); }
        | NTERM         { NonTerm t = new NonTerm($NTERM.text); }
          ('(' param    { t.addParameter($param.v); }
          (',' param    { t.addParameter($param.v); })*
          ')')?         { $v = t; }
        | CODE          { $v = new Code($CODE.text); }
        ;

param returns [String v]
        : NTERM { $v = $NTERM.text; }
        | TERM  { $v = $TERM.text; }
        | CODE  { $v = $CODE.text.substring(1, $CODE.text.length() - 1); }
        ;

TERM   : [A-Z][a-zA-Z0-9_]*;
NTERM  : [a-z][a-zA-Z0-9_]*;

STRING : '"' (~('"'))* '"';
CODE   : '{' (~[{}]+ CODE?)* '}';

WS : [ \t\r\n] -> skip;