var ctx;


window.onload = function () {
    canvas = document.getElementById('canvas1');
    if (canvas && canvas.getContext) {
        ctx = canvas.getContext('2d');
        
        dibujarFaro();
    } else {
        alert('Error en el código o en ctx');
    }
}

function dibujarFaro(){
    //base
    ctx.lineWidth = 5
    ctx.fillStyle = 'blue'
    ctx.strokeStyle = 'black'
    ctx.beginPath()
    ctx.rect(250, 550, 200, 20)
    ctx.stroke()
    ctx.fill()
    //cono1
    ctx.fillStyle = 'red'
    ctx.beginPath()
    ctx.moveTo(270, 548)
    ctx.lineTo(275, 450)
    ctx.lineTo(425, 450)
    ctx.lineTo(430, 548)
    ctx.stroke()
    ctx.fill()
    //cono2
    ctx.fillStyle = 'white'
    ctx.beginPath()
    ctx.moveTo(275, 448)
    ctx.lineTo(280, 350)
    ctx.lineTo(420, 350)
    ctx.lineTo(425, 448)
    ctx.lineTo(275, 448)
    ctx.stroke()
    ctx.fill()
    //cono3
    ctx.fillStyle = 'red'
    ctx.beginPath()
    ctx.moveTo(280, 348)
    ctx.lineTo(285, 250)
    ctx.lineTo(415, 250)
    ctx.lineTo(420, 348)
    ctx.lineTo(280, 348)
    ctx.stroke()
    ctx.fill()
    //cono4
    ctx.fillStyle = 'white'
    ctx.beginPath()
    ctx.moveTo(285, 248)
    ctx.lineTo(290, 150)
    ctx.lineTo(410, 150)
    ctx.lineTo(415, 248)
    ctx.lineTo(285, 248)
    ctx.stroke()
    ctx.fill()
    //tope
    ctx.fillStyle = 'blue'
    ctx.beginPath()
    ctx.rect(280, 140, 140, 10)
    ctx.stroke()
    ctx.fill()
    //luz
    ctx.fillStyle = 'yellow'
    ctx.beginPath()
    ctx.rect(290, 90, 120, 47)
    ctx.stroke()
    ctx.fill()
    //pico
    ctx.fillStyle = 'blue'
    ctx.beginPath()
    ctx.moveTo(290, 87)
    ctx.lineTo(350, 40)
    ctx.lineTo(410, 87)
    ctx.lineTo(290, 87)
    ctx.lineTo(350, 40)
    ctx.stroke()
    ctx.fill()
}