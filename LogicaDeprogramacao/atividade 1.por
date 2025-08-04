programa {
  funcao inicio() {
        // declaração de dados 
    cadeia nome 
    caracter genero
    inteiro idade

    // entrada de dados

    escreva(" Qual seu nome ")
    leia(nome)
    escreva(" Qual sua idade ")
    leia(idade)
    escreva(" Qual seu genero, para masculino coloque M, para feminino Coloque F ")
    leia (genero)


    // verificar tudo 

    se( genero == 'M' e idade>= 65 )
    {
      escreva(nome, " Já pode se aposentar")
    } senao se (genero =="F" e idade >=62 )
    escreva(nome, "pode se sposentar")
    senao
    {
      escreva(nome," Não pode se aposentar")
    }
    
  }
}
