// variaveis do formulario
const form = document.querySelector('form');
// arrow function
const msg = () =>{
let nome = document.querySelector('#nome').value;
let idade = document.querySelector('#idade').value;
const result = (idade >= 18 ) ? `é maior de idade` : `é menor de idade`; 

document.querySelector(`#result`).innerHTML = `${nome} ${result}`;



}

//evento

form.addEventListener('submit', function(event) {
    //desativa o submit
event.preventDefault()

//executa a função
msg();
});