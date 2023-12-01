var ctx;
var canvas;
var cañonX = 550;
var cañonY = 455;
var centerX = 450;
var centerY = 455;
var longCañon = 100;
var angle = 0;

window.onload = () => {
  canvas = document.getElementById("canvas1");
  if (canvas && canvas.getContext) {
    ctx = canvas.getContext("2d");
    if (ctx) {
      dibujarTanque();
      document.addEventListener('keydown', function (e) {
        if (e.key == 'ArrowLeft') {
          console.log('pulsa izq')
          angle -= 0.1;
          dibujarTanque();
        }
      });
      document.addEventListener('keydown', function (e) {
        if (e.key == 'ArrowRight') {
          console.log('pulsa der')
          angle += 0.1;
          dibujarTanque();
        }
      });
    }
  }
}

function dibujarTanque() {
  ctx.clearRect(0, 0, canvas.width, canvas.height)
  var moveX = centerX + longCañon * Math.cos(angle);
  var moveY = centerY + longCañon * Math.sin(angle);
  //rueda izquierda
  ctx.lineWidth = '2'
  ctx.strokeStyle = 'black'
  ctx.fillStyle = 'rgb(51, 49, 49)'
  ctx.beginPath()
  ctx.rect(400, 400, 100, 30)
  ctx.fill()
  ctx.stroke()
  //cuerpo
  ctx.fillStyle = 'green'
  ctx.beginPath()
  ctx.rect(410, 430, 80, 50)
  ctx.fill()
  ctx.stroke()
  //rueda derecha
  ctx.fillStyle = 'rgb(51, 49, 49)'
  ctx.beginPath()
  ctx.rect(400, 480, 100, 30)
  ctx.fill()
  ctx.stroke()
  //cabina
  ctx.fillStyle = 'rgb(19, 94, 12)'
  ctx.beginPath()
  ctx.arc(450, 455, 20, 0, Math.PI * 2)
  ctx.fill()
  ctx.stroke()
  //cañon
  ctx.lineWidth = '15'
  ctx.strokeStyle = 'rgb(19, 94, 12)'
  ctx.beginPath()
  ctx.moveTo(centerX, centerY)
  ctx.lineTo(moveX, moveY)
  ctx.stroke()
}