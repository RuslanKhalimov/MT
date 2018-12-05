# Хороший язык

Придумайте хороший императивный язык программирования, на
котором приятно писать программы. Транслируйте с него в Си.

Пример:
```
a, b = readint(), readint()
a, b = b, a
print(a + b)
```

Вывод:
```
int main() {
    int a, b;
    scanf("%d%d", a, b);
    int ta = a;
    int tb = b;
    a = tb;
    b = ta;
    printf("%d", a + b);
}
```

## Токены

Строка | Токен | Строка | Токен 
--- | --- | --- | ---
\[a-zA-Z\]\[a-zA-Z0-9\]* | VAR | + | ADD 
-?\[1-9\]\[0-9\]* &#124; 0 | NUM | - | SUB 
if | IF | * | MUL 
else | ELSE | / | DIV 
( | LPAR  | == | EQ 
) | RPAR | != | NEQ
{ | LCPAR | < | LESS
} | RCPAR | \> | GR 
= | ASSIGN | <= | LESSEQ 
, | COMMA | \>= | GREQ 
! | NOT | print | PRINT 
&& | AND | readint | READINT
&#124;&#124; | OR | while | WHILE
do | DO | | 

## Грамматика
    start -> expressions
    
    expressions -> expr (expr)*
    
    expr -> PRINT LPAR ar_expressions RPAR
          | IF or LCPAR expressions RCPAR
          | IF or LCPAR expressions RCPAR ELSE LCPAR expressions RCPAR
          | WHILE or LCPAR expressions RCPAR
          | DO LCPAR expressions RCPAR WHILE or
          | vars ASSIGN ar_expressions
    
    vars -> VAR (COMMA VAR)*
    
    ar_expressions -> add_sub (COMMA add_sub)*
    
    add_sub -> add_sub ADD mul_div
             | add_sub SUB mul_div
             | mul_div
             
    mul_div -> mul_div MUL unary_ar
             | mul_div DIV unary_ar
             | unary_ar
    
    unary_ar -> VAR
              | NUM
              | READINT LPAR RPAR
              | LPAR add_sub RPAR
              
    or -> or OR and
        | and
        
    and -> and AND unary_logic
         | unary_logic
         
    unary_logic -> NOT unary_logic
                 | cmp
                 | LPAR or RPAR
                 
    cmp -> add_sub cmp_op add_sub
    
    cmp_op -> EQ
            | NEQ
            | LESS
            | GR
            | LESSEQ
            | GREQ
