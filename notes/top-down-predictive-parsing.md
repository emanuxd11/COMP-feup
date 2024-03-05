# Parsing Using The Recursive Descent Parsing Method
> Is a top down parsing technique where parser starts from the root of a grammar (from the left) and recursively tries to match the input string against the production rules of the grammar.
### Grammars suitable for this kind of parsing include:
- LL(1) Grammars, in which the parser decides which production rule to use babsed on the current input symbol and one symbol lookahead.
- Grammars with **No Left Recursion**, as this can cause infinite loops, and grammars have to be rewritten to remove left recursion before being able to use recursive descent parsing.
- Grammars **without ambiguity**, which is when the same string of symbols can be derived in more than one parse tree. Ambiguities should be removed before attempting this type of parsing.
- The grammar should be such that LL parsing tables can be constructed efficiently and unambiguously.
