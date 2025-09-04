const btn = document.querySelector(`form`);
const telefoneMask = document.querySelector(`#telefone`);
const cepMask = document.querySelector(`#cep`);
const pesquisacep =document.querySelector('#cep');



//arrow function

const limpar_formulario_cep = () =>{
    //limpa valores do furmalrio
document.querySelector('#estado').value=("");
document.querySelector('#cidade').value=("");
document.querySelector('#bairro').value =("");
document.querySelector('#logradouro').value =("");
}

const meu_callback = (conteudo) =>{
    if(!("erro" in conteudo)){
        document.querySelector('#estado').value= conteudo.uf;
        document.querySelector('#cidade').value=conteudo.localidade;
        document.querySelector('#bairro').value=conteudo.bairro;
        document.querySelector('#logradouro').value=conteudo.logradouro;
    }
else{
    limpa_formulario_cep();
    alert("CEP não encontrado.");
}
}


// eventos

pesquisacep.addEventListener('blur', function(){
// cep somente com digitos
     let cep = document.querySelector('#cep').value.replace(/\D/g, '');

    //cep tem valor informado
    if (cep !=="") {
        //variavel para validar cep
        let validarCep = /^[0-9]{8}$/;


        //validar cep
        if(validarCep.test(cep)){
document.querySelector('#estado').value = ".........";
document.querySelector('#cidade').value = ".........";
document.querySelector('#bairro').value = ".........";        
document.querySelector('#logradouro').value = ".........";


//cria um elemento js

let script = document.createElement('script');


//sincronia 
script.src = 'https://viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';

//Insere script no documento e carrega o conteúdo.
     document.body.appendChild(script);




}else{
             limpa_formulário_cep();
            alert("Formato de CEP inválido.");
        }

        //limpa formulario
        limpar_formulario_cep();
    }
});

telefoneMask.addEventListener(`input`, function() { 
    this.value = this.value
    .replace(/\D/g, '')
    .replace(/(\d{2})(\d)/, '($1) $2')
    .replace(/(\d{4,5})(\d)/, '$1-$2')
    .replace(/(-\d{4})\d+?$/, '$1')
});

cepMask.addEventListener(`input`, function() { 
    this.value = this.value
    .replace(/\D/g, '')
    .replace(/(\d{5})(\d)/, '$1-$2')
    .replace(/(-\d{5})\d+?$/, '$1')
})


btn.addEventListener('submit', function(event) {

event.preventDefault();
let nome = document.querySelector(`#nome`).value;
let telefone = document.querySelector(`#telefone`).value;
let cep = document.querySelector(`#cep`).value;
let estado = document.querySelector(`#estado`).value;
let cidade = document.querySelector(`#cidade`).value;
let bairro = document.querySelector(`#bairro`).value;
let logradouro = document.querySelector(`#logradouro`).value;
let complemento = document.querySelector(`#complemento`).value;
let numero = document.querySelector(`#numero`).value;

let dados = `Dados do usuário: <br> <br>
                Nome: ${nome}.<br>
                Telefone: ${telefone}<br>
                Cep: ${cep} <br>
                Estado: ${estado} <br>
                Cidade: ${cidade} <br>
                Bairro: ${bairro} <br>
                Logradouro: ${logradouro} <br>

                Complemento: ${complemento} <br>
                Número: ${numero} <br>.`
                

document.querySelector('#dados').innerHTML = dados;

});
