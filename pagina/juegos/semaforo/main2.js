//Error: al pulsar ambos botones no se cambia correctamente

var canvas
var ctx
//rojo=1 amarillo=2 verde=3
var color = 1
var precaucion = true;


//sEMAFORO
window.onload = function () {
    canvas = document.getElementById('canvas1');

    if (canvas && canvas.getContext) {
        ctx = canvas.getContext('2d');
        if (ctx) {

baseSemaforo();
apagado();



        }
    }
}
function baseSemaforo(){
    ctx.fillStyle = "black";
    ctx.strokeStyle = "black";
    ctx.lineWidth = 1;
    ctx.fillRect(250, 75, 150, 400);
    ctx.strokeRect(250, 75, 150, 400);



    ctx.fillStyle = "gray";
    ctx.strokeStyle = "gray";
    ctx.lineWidth = 1;
    ctx.fillRect(315, 475, 20, 50);
    ctx.strokeRect(315, 475, 20, 50);
    
}

function apagado() {
    ctx.lineWidth = 2;
    ctx.strokeStyle = "darkred";
    ctx.fillStyle = "darkred";
    ctx.beginPath();
    ctx.arc(325, 150, 50, 0, 2 * Math.PI, true);
    ctx.fill();
    ctx.stroke();



    ctx.lineWidth = 2;
    ctx.strokeStyle = "darkgoldenrod";
    ctx.fillStyle = "darkgoldenrod";
    ctx.beginPath();
    ctx.arc(325, 275, 50, 0, 2 * Math.PI, true);
    ctx.fill();
    ctx.stroke();

    ctx.lineWidth = 2;
    ctx.strokeStyle = "darkgreen";
    ctx.fillStyle = "darkgreen";
    ctx.beginPath();
    ctx.arc(325, 400, 50, 0, 2 * Math.PI, true);
    ctx.fill();
    ctx.stroke();
    color = 0


}


function Rojo() {
    ctx.lineWidth = 2;
    ctx.strokeStyle = "#FF0000";
    ctx.fillStyle = "#FF0000";
    ctx.beginPath();
    ctx.arc(325, 150, 50, 0, 2 * Math.PI, true);
    ctx.fill();
    ctx.stroke();



    ctx.lineWidth = 2;
    ctx.strokeStyle = "darkgoldenrod";
    ctx.fillStyle = "darkgoldenrod";
    ctx.beginPath();
    ctx.arc(325, 275, 50, 0, 2 * Math.PI, true);
    ctx.fill();
    ctx.stroke();

    ctx.lineWidth = 2;
    ctx.strokeStyle = "darkgreen";
    ctx.fillStyle = "darkgreen";
    ctx.beginPath();
    ctx.arc(325, 400, 50, 0, 2 * Math.PI, true);
    ctx.fill();
    ctx.stroke();
    color = 1

}

function Amarillo() {
    ctx.lineWidth = 2;
    ctx.strokeStyle = "darkred";
    ctx.fillStyle = "darkred";
    ctx.beginPath();
    ctx.arc(325, 150, 50, 0, 2 * Math.PI, true);
    ctx.fill();
    ctx.stroke();



    ctx.lineWidth = 2;
    ctx.strokeStyle = "yellow";
    ctx.fillStyle = "yellow";
    ctx.beginPath();
    ctx.arc(325, 275, 50, 0, 2 * Math.PI, true);
    ctx.fill();
    ctx.stroke();

    ctx.lineWidth = 2;
    ctx.strokeStyle = "darkgreen";
    ctx.fillStyle = "darkgreen";
    ctx.beginPath();
    ctx.arc(325, 400, 50, 0, 2 * Math.PI, true);
    ctx.fill();
    ctx.stroke();
    color = 2

}

function Verde() {


    ctx.lineWidth = 2;
    ctx.strokeStyle = "darkred";
    ctx.fillStyle = "darkred";
    ctx.beginPath();
    ctx.arc(325, 150, 50, 0, 2 * Math.PI, true);
    ctx.fill();
    ctx.stroke();



    ctx.lineWidth = 2;
    ctx.strokeStyle = "darkgoldenrod";
    ctx.fillStyle = "darkgoldenrod";
    ctx.beginPath();
    ctx.arc(325, 275, 50, 0, 2 * Math.PI, true);
    ctx.fill();
    ctx.stroke();

    ctx.lineWidth = 2;
    ctx.strokeStyle = "greenyellow";
    ctx.fillStyle = "greenyellow";
    ctx.beginPath();
    ctx.arc(325, 400, 50, 0, 2 * Math.PI, true);
    ctx.fill();
    ctx.stroke();
    color = 3
}

function funcionamientoNormal(){
    Rojo();
    setInterval(function () {
        
        if (color == 1) {
            Amarillo();
            setTimeout(function () {
                Verde();
            }, 2000);
        } else if (color == 2) {
            Verde();
        } else if (color == 3) {
            Rojo();
        }
        else if (color==0){
            Rojo();
        }
    }, 5000);



}

function parpadeo(){
    setInterval(function () {
        if (color == 0) {
            Amarillo()
        }
        else if (color == 2) {
            apagado();
        }
    }, 500);
}




var botonPrecaucionApagar = document.getElementById("apagarprecaucion");
botonPrecaucionApagar.addEventListener('click', function () {
   funcionamientoNormal();
   
});


var botonPrecaucionEncender = document.getElementById("encenderprecaucion");
botonPrecaucionEncender.addEventListener('click', function () {
   parpadeo();
   
});