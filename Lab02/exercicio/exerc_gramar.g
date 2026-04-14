grammar exerc_gramar;

// Definir a regra inicial
begin: (statement)+;

// Definir a regra para statements
statement:
	PROGRAM ID SEMI					# Declaração_de_programa
	| BEGIN (expr SEMI)* END DOT	# Bloco_de_instruções
	| expr SEMI						# Expressão_comum;

// Definir a regra para expressões
expr:
	L_PAREN expr R_PAREN			# Agrupamento
	| expr OP = (MULT | DIV) expr	# Multiplicação_e_Divisão
	| expr OP = (PLUS | MINUS) expr	# Adição_e_Subtração
	| INT_VAL						# Valor_inteiro
	| STRING						# Valor_string
	| ID							# Identificador;
// TOKENS
PROGRAM: 'program';
BEGIN: 'begin';
END: 'end';
SEMI: ';';
L_PAREN: '(';
R_PAREN: ')';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
DOT: '.';
OP: PLUS | MINUS | MULT | DIV;

// Definir o token para números inteiros
INT_VAL: [0-9]+;
STRING: '"' .*? '"';
ID: [a-zA-Z_][a-zA-Z0-9_]*;

// Ignorar espaços em branco
WS: [ \t\n]+ -> skip;