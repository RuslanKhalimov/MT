grammar Program;

@header {
import expression.*;
}

start returns [Program v]
    :   expressions { $v = new Program($expressions.v); }
    ;

expressions returns [List<Expression> v]
    :   expr       { List<Expression> res = new ArrayList<>(); }
                   { res.add($expr.v); }
        (expr      { res.add($expr.v); }
        )*
                   { $v = res; }
    ;

expr returns [Expression v]
    : PRINT LPAR ar_expressions RPAR
            { $v = new Print($ar_expressions.v); }
    | IF or LCPAR expressions RCPAR
            { $v = new If($or.v, $expressions.v); }
    | IF or LCPAR first = expressions RCPAR ELSE LCPAR second = expressions RCPAR
            { $v = new IfElse($or.v, $first.v, $second.v); }
    | WHILE or LCPAR expressions RCPAR
            { $v = new While($or.v, $expressions.v); }
    | DO LCPAR expressions RCPAR WHILE or
            { $v = new DoWhile($or.v, $expressions.v); }
    | vars ASSIGN ar_expressions
            { $v = new Assignment($vars.v, $ar_expressions.v); }
    ;

vars returns [List<Variable> v]
    :   VAR         { List<Variable> res = new ArrayList<>(); }
                    { res.add(new Variable($VAR.text)); }
        (COMMA VAR  { res.add(new Variable($VAR.text)); }
        )*
                    { $v = res; }
    ;

ar_expressions returns [List<ArithmeticExpression> v]
    :   add_sub         { List<ArithmeticExpression> res = new ArrayList<>(); }
                        { res.add($add_sub.v); }
        (COMMA add_sub  { res.add($add_sub.v); }
        )*
                        { $v = res; }
    ;

add_sub returns [ArithmeticExpression v]
    :   l = add_sub ADD r = mul_div   { $v = new BinaryArithmeticExpression("+", $l.v, $r.v); }
    |   l = add_sub SUB r = mul_div   { $v = new BinaryArithmeticExpression("-", $l.v, $r.v); }
    |   mul_div                       { $v = $mul_div.v; }
    ;

mul_div returns [ArithmeticExpression v]
    :   l = mul_div MUL unary_ar   { $v = new BinaryArithmeticExpression("*", $l.v, $unary_ar.v); }
    |   l = mul_div DIV unary_ar   { $v = new BinaryArithmeticExpression("/", $l.v, $unary_ar.v); }
    |   unary_ar                   { $v = $unary_ar.v; }
    ;

unary_ar returns [ArithmeticExpression v]
    :   READINT LPAR RPAR          { $v = new Read(); }
    |   LPAR add_sub RPAR          { $v = $add_sub.v; }
    |   VAR                        { $v = new Variable($VAR.text); }
    |   NUM                        { $v = new Num($NUM.text); }
    ;

or returns [LogicExpression v]
    :   l = or OR and       { $v = new BinaryLogicExpression("||", $l.v, $and.v); }
    |   and                 { $v = $and.v; }
    ;

and returns [LogicExpression v]
    :   l = and AND unary_logic     { $v = new BinaryLogicExpression("&&", $l.v, $unary_logic.v); }
    |   unary_logic                 { $v = $unary_logic.v; }
    ;

unary_logic returns [LogicExpression v]
    :   NOT unary_logic         { $v = new Negation($unary_logic.v); }
    |   cmp                     { $v = $cmp.v; }
    |   LPAR or RPAR            { $v = $or.v; }
    ;

cmp returns [LogicExpression v]
    :   l = add_sub cmp_op r = add_sub {$v = new CmpExpression($cmp_op.v, $l.v, $r.v); }
    ;

cmp_op returns [String v]
    :   EQ      { $v = "=="; }
    |   NEQ     { $v = "!="; }
    |   LESS    { $v = "<"; }
    |   GR      { $v = ">"; }
    |   LESSEQ  { $v = "<="; }
    |   GREQ    { $v = ">="; }
    ;

IF : 'if';
ELSE : 'else';
PRINT : 'print';
READINT : 'readint';
WHILE : 'while';
DO : 'do';

ASSIGN : '=';
COMMA : ',';
LPAR : '(';
RPAR : ')';
LCPAR : '{';
RCPAR : '}';

ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';

EQ : '==';
NEQ : '!=';
LESS : '<';
GR : '>';
LESSEQ : '<=';
GREQ : '>=';

NOT : '!';
AND : '&&';
OR : '||';

VAR : ('a'..'z' | 'A'..'Z') ('a'..'z' | 'A'..'Z' | '0'..'9')*;
NUM : ('-'? ('1'..'9')('0'..'9')*) | '0';

SPACE : [ \t\r\n] -> skip;