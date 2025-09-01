// Seleciona elementos
const botao = document.querySelector('button[type="button"]');
const inputAltura = document.querySelector('.altura');
const inputPeso = document.querySelector('.peso');
const resultado = document.getElementById('result');

botao.addEventListener('click', () => {
  // Pega os valores e converte para número
  const altura = parseFloat(inputAltura.value.replace(',', '.')); // aceita vírgula ou ponto
  const peso = parseFloat(inputPeso.value.replace(',', '.'));

  // Validação simples
  if (!altura || altura <= 0) {
    alert('Por favor, insira uma altura válida (ex: 1.70)');
    return;
  }
  if (!peso || peso <= 0) {
    alert('Por favor, insira um peso válido (ex: 70)');
    return;
  }

  // Calcula o IMC: peso / (altura * altura)
  const imc = peso / (altura * altura);

  // Limita para 2 casas decimais
  const imcFixed = imc.toFixed(2);

  // Exibe resultado
  resultado.textContent = imcFixed;

  // Opcional: mostrar a classificação do IMC
  let classificacao = '';

  if (imc < 18.5) classificacao = 'Abaixo do peso';
  else if (imc < 24.9) classificacao = 'Peso normal';
  else if (imc < 29.9) classificacao = 'Sobrepeso';
  else if (imc < 34.9) classificacao = 'Obesidade grau I';
  else if (imc < 39.9) classificacao = 'Obesidade grau II';
  else classificacao = 'Obesidade grau III';

  // Atualiza o texto logo acima do resultado (h4 com texto "????")
  const classificacaoElemento = document.querySelector('h4');
  classificacaoElemento.textContent = classificacao;
});
