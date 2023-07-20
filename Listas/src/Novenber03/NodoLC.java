package Novenber03;
public class NodoLC {
    int dato;
    NodoLC enlace;

    public NodoLC(int d) {
        dato = d;
        enlace = this;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoLC getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoLC enlace) {
        this.enlace = enlace;
    }

    public void NodoLC() {
        dato = 0;
        enlace = this;
    }
    
}
