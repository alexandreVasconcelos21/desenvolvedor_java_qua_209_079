programa {
  funcao inicio() {
    //declaração de variaveis

    real x, y, result
    inteiro opcao 

   

    //loop
    faca{
        //menu
        
        escreva("\n\n1- Soma.\n")
        escreva("2- Subtração.\n")
        escreva("3- Multiplicação.\n")
        escreva("4- Divisão. \n")
        escreva("5- Sair do programa\n")
        leia(opcao)

        //verifica se o usuario deseja sair ou nao 

        se(opcao>=1 e opcao <=4)
          {
      escreva("Informe o valor de x: ")
           leia(x)
      escreva("Infome o valor de y: ")
          leia(y)

          }        

        // verifica a opção escolhida
        escolha(opcao)
        {
          caso 1:
        result = x+y
        escreva("O reseutado é ", result)
        pare
      
      caso 2:
        result = x-y
        escreva("O reseutado é ", result)
        pare

      caso 3:
        result = x*y
        escreva("O reseutado é ", result)
        pare

      caso 4:
        result = x/y
        escreva("O resultado é ", result)
        pare
      caso 5:
        escreva("Encerrado")

      caso contrario:
        escreva("Opção inválida")


        }
    } enquanto(opcao != 5 )


    }
  }

