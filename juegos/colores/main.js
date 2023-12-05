var ctx;
var canvas;
var sizeX = 228.5;
var sizeY = 171.4;
var x = 0;
var y = 0;
var rectangulos = 6;
var tiempoIntervalo = 1000; // Intervalo de 1 segundo por defecto
var rectangulosList = [];

window.onload = () => {
  canvas = document.getElementById("canvas1");
  if (canvas && canvas.getContext) {
    ctx = canvas.getContext("2d");
    if (ctx) {
      intervaloSlider.addEventListener('input', function () {
        tiempoIntervalo = this.value * 1000;
        reiniciarIntervalo(); 
      });
      crearRectangulos();
      bucle();
    }
  }
};

function dibujarCuadrado(posX, posY) {
  var color = colorAleatorio();
  ctx.fillStyle = color;
  ctx.beginPath();
  ctx.rect(posX, posY, sizeX, sizeY);
  ctx.fill();
}

function colorAleatorio() {
  var r = Math.floor(Math.random() * 255);
  var g = Math.floor(Math.random() * 255);
  var b = Math.floor(Math.random() * 255);
  var transparencia = 0.5;
  return `rgba(${r},${g},${b},${transparencia})`;
}

function crearRectangulos() {
  for (let i = 0; i < rectangulos; i++) {
    rectangulosList.push({ x: x, y: y });
    x += sizeX / 2;
    y += sizeY / 2;
  }
}

function cambiarColorRectangulos() {
  for (let i = 0; i < rectangulosList.length; i++) {
    var rect = rectangulosList[i];
    dibujarCuadrado(rect.x, rect.y);
  }
}

var intervalo;

function bucle() {
  intervalo = setInterval(cambiarColorRectangulos, tiempoIntervalo);
}

function reiniciarIntervalo() {
  clearInterval(intervalo);
  bucle();
}