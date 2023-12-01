var ctx;
var canvas;

window.onload = () => {
  canvas = document.getElementById("canvas1");
  if (canvas && canvas.getContext) {
    ctx = canvas.getContext("2d");
    if (ctx) {
      dibujarPalo();
      dibujarTriangulo(400, 400, 500, 400);
      dibujarTriangulo(500, 300, 500, 200);
      dibujarTriangulo(400, 200, 300, 200);
      dibujarTriangulo(300, 300, 300, 400);
      setInterval(cambiarColorTriangulos, 1000); // Llama a la función cada segundo
    }
  }
};

function dibujarPalo() {
  ctx.lineWidth = 3;
  ctx.strokeStyle = 'brown';
  ctx.beginPath();
  ctx.moveTo(400, 600);
  ctx.lineTo(400, 300);
  ctx.stroke();
}

function dibujarTriangulo(v1x, v1y, v2x, v2y) {
  ctx.fillStyle = colorAleatorio();
  ctx.beginPath();
  ctx.moveTo(400, 300);
  ctx.lineTo(v1x, v1y);
  ctx.lineTo(v2x, v2y);
  ctx.lineTo(400, 300);
  ctx.fill();
  ctx.closePath();
}

function colorAleatorio() {
  var r = Math.floor(Math.random() * 255);
  var g = Math.floor(Math.random() * 255);
  var b = Math.floor(Math.random() * 255);
  return `rgba(${r},${g},${b})`;
}

function cambiarColorTriangulos() {
  dibujarTriangulo(400, 400, 500, 400);
  dibujarTriangulo(500, 300, 500, 200);
  dibujarTriangulo(400, 200, 300, 200);
  dibujarTriangulo(300, 300, 300, 400);
}
