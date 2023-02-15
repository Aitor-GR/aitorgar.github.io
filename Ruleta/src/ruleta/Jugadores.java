/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ruleta;

/**
 *
 * @author sebas
 */
class Jugadores {
    private int numero;
    private int pactual;
    private int ptotal;

    public Jugadores(int numero, int pactual, int ptotal) {
        this.numero = numero;
        this.pactual = pactual;
        this.ptotal = ptotal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPactual() {
        return pactual;
    }

    public void setPactual(int pactual) {
        this.pactual = pactual;
    }

    public int getPtotal() {
        return ptotal;
    }

    public void setPtotal(int ptotal) {
        this.ptotal = ptotal;
    }
}
