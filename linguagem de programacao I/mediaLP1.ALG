algoritmo "MediaLP1"
var

   P1, E1, E2, X, SUB, API, EXF: real
   nota_base, nota_reg, parcial_api, parte1, media_final: real
   
inicio
   escreval("    CALCULADORA DE M�DIA - LINGUAGEM DE PROGRAMA��O I      ")
   escreva("Digite a nota da Prova 1 (P1): ")
   leia(P1)

   escreva("Digite a nota da Entrega 1 (E1): ")
   leia(E1)

   escreva("Digite a nota da Entrega 2 (E2): ")
   leia(E2)

   escreva("Digite as Atividades Extras (X): ")
   leia(X)

   escreva("Digite a Prova Substitutiva (SUB): ")
   leia(SUB)

   escreva("Digite a nota da API: ")
   leia(API)

   escreva("Digite a nota do Exame Final (EXF): ")
   leia(EXF)

   se (SUB > P1) entao
      nota_base <- SUB
   senao
      nota_base <- P1
   fimse

   nota_reg <- (nota_base * 0.5) + (E1 * 0.2) + (E2 * 0.3) + X

   se (nota_reg >= 5.9) entao
      parcial_api <- API * 0.5
   senao
      parcial_api <- 0
   fimse

   parte1 <- (nota_reg * 0.5) + parcial_api

   se (parte1 > EXF) entao
      media_final <- parte1
   senao
      media_final <- EXF
   fimse

   escreval("----------------------------------------")
   escreval(" Nota Regular Calculada: ", nota_reg:4:2)
   escreval(" M�dia Parcial:          ", parte1:4:2)
   escreval("----------------------------------------")
   escreval(" M�DIA FINAL:            ", media_final:4:2)
   escreval("========================================")
   
fimalgoritmo

