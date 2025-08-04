programa {
  funcao inicio() {
    // declaração de dados 
    cadeia nome 
    inteiro idade
    real altura 



    // entrada de dados

    escreva (" Infome seu nome:")
    leia (nome)
    escreva(" Informe dua idade: ")
    leia( idade)
    escreva(" Informe sua altura em metros: ")
    leia( altura)

    //estrutura de dados

    se( idade>=12  e altura>=1.12) 
    {
      escreva( nome, " Está autorizado a entrar no trem fantasma.")
    }
    senao
    {
      escreva(nome, " Não está autorizado a entrar no trem fantasma.")
    }

  }
}
