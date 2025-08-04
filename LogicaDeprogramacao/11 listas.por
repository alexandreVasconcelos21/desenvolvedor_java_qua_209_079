programa {
  funcao inicio() {
    // declaração de vetor
    cadeia nomes[10]
    inteiro idades[10]


    //entrada de dados
    para(inteiro i = 0; i < 10; i++){

      escreva("Informe seu nome: ", i + 1, " : ")
      leia(nomes[i])
      escreva("Informe sua idade: ", i + 1, " : ")
      leia(idades[i])
    }

    escreva("\nListas de pessoas\n")
    para(inteiro i = 0; i < 10; i++){

    escreva("\npessoas ", i + 1, ":", nomes[i], " - idades: ", idades[i],"\n")
   }

  
  }
}
