package October21;

public class nodo {
    int dato;
    nodo enlace;

    public nodo(int dato, nodo enlace){
        this.dato = dato;
        this.enlace = enlace;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(nodo enlace) {
        this.enlace = enlace;
    }
}

