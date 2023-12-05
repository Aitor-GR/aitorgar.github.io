var ctx;
var bicho = new Image();
var canvas;
var x, y;
var puntos = 0;
var tiempo = 60;

window.onload = function () {
    canvas = document.getElementById('canvas1');
    bicho.src = 'media/bicho.png';
    if (canvas && canvas.getContext) {
        ctx = canvas.getContext('2d');
        if (ctx) {
            dibujapuntos();
            timer();
            x = getRandomNumber(0, canvas.width - 50);
            y = getRandomNumber(20, canvas.height - 50);
            dibujarBicho(x,y);
            console.log(x);
            canvas.addEventListener('click', function(e){
                var rx = e.offsetX;
                var ry = e.offsetY;
                if (rx > x && rx < x + bicho.width && ry > y && ry < y + bicho.height){
                    ctx.clearRect(0, 0, 200, 20);
                    puntos++;
                    ctx.clearRect(0, 20, canvas.width, canvas.height);
                    x = getRandomNumber(0, canvas.width - 50);
                    y = getRandomNumber(0, canvas.height - 50);
                    dibujarBicho(x,y);
                    dibujapuntos();
                }
            })         
        }
    } else {
        alert('Error en el código o en ctx');
    }
}


function getRandomNumber(min, max){
    return Math.random() * (max - min) + min;
}

function dibujarBicho(x,y){
    ctx.drawImage(bicho, x,y);
}

function dibujapuntos(){
    ctx.font = "bold 15px serif";
    ctx.fillText("Puntuación: " + puntos , 10, 15);
}

function timer(){
    ctx.clearRect(900, 0, 100, 20)
    ctx.fillText("Tiempo: " + tiempo, 900, 15);
    if(tiempo == 0)
    {
        
    }else {
        tiempo -= 1;
        setTimeout("timer()", 1000);
    }
}
/*function borrarTimer(){
    ctx.clearRect(900, 0, 100, 20)
}*/