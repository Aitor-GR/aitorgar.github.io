var color = 1;

window.onload = () => {
  canvas = document.getElementById("canvas1");
  if (canvas && canvas.getContext) {
    ctx = canvas.getContext("2d");
    if (ctx) {
      dibujarSemaforo()
      funcionamientoNormal()
    }
  }
}

function dibujarSemaforo() {
  //poste
  ctx.lineWidth = '20'
  ctx.strokeStyle = 'black'
  ctx.fillStyle = 'black'
  ctx.beginPath()
  ctx.moveTo(400, 800)
  ctx.lineTo(400, 400)
  ctx.stroke()
  ctx.fill()
  //caja
  ctx.lineWidth = '5'
  ctx.fillStyle = 'rgba(0, 0, 0, 0.9)'
  ctx.beginPath()
  ctx.rect(340, 100, 120, 300)
  ctx.stroke()
  ctx.fill()
  //luz roja
  ctx.fillStyle = 'rgba(255, 0, 0, 0.5)'
  ctx.beginPath()
  ctx.arc(400, 150, 40, 0, Math.PI * 2)
  ctx.stroke()
  ctx.fill()
  //luz amarilla
  ctx.fillStyle = 'rgba(255, 255, 0, 0.5)'
  ctx.beginPath()
  ctx.arc(400, 250, 40, 0, Math.PI * 2)
  ctx.stroke()
  ctx.fill()
  //luz verde
  ctx.fillStyle = 'rgba(0, 128, 0, 0.5)'
  ctx.beginPath()
  ctx.arc(400, 350, 40, 0, Math.PI * 2)
  ctx.stroke()
  ctx.fill()
}

function cambiarVerde() {
  dibujarSemaforo();
  ctx.lineWidth = '5'
  ctx.strokeStyle = 'black'
  ctx.fillStyle = 'green'
  ctx.beginPath()
  ctx.arc(400, 350, 40, 0, Math.PI * 2)
  ctx.stroke()
  ctx.fill()
  color = 3;
}

function cambiarAmbar() {
  dibujarSemaforo();
  ctx.lineWidth = '5'
  ctx.strokeStyle = 'black'
  ctx.fillStyle = 'yellow'
  ctx.beginPath()
  ctx.arc(400, 250, 40, 0, Math.PI * 2)
  ctx.stroke()
  ctx.fill()
  color = 2;
}

function cambiarRojo() {
  dibujarSemaforo();
  ctx.lineWidth = '5'
  ctx.strokeStyle = 'black'
  ctx.fillStyle = 'red'
  ctx.beginPath()
  ctx.arc(400, 150, 40, 0, Math.PI * 2)
  ctx.stroke()
  ctx.fill()
  color = 1;
}

function funcionamientoNormal() {
  cambiarVerde();
  setInterval(function () {

    if (color == 1) {
      setTimeout(function () {
        cambiarVerde();
      }, 2000);
    } else if (color == 2) {
      cambiarRojo();
    } else if (color == 3) {
      cambiarAmbar();
    } 
  }, 5000);
}