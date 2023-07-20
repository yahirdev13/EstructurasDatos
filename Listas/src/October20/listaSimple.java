package October20;

import October20.nodo;

public class listaSimple {
    nodo cabecera;
    int T;

    public listaSimple(){
        cabecera = null;
        T = 0;
    }

    public boolean esVacia(){
        return cabecera == null;
    }

    public void insertar(int d){
        nodo nuevo = new nodo(d, cabecera);
        cabecera = nuevo;
        T++;
    }

    public int ListaSize(){
        return T;
    }

    public String aString(){
        String cadena = "[";
        nodo indice = cabecera;
        while(indice != null){
            cadena += indice.getDato() + ", ";
            indice = indice.getEnlace();
        }
        return cadena + "]";
    }

    public boolean buscar(int valor){
        nodo aux = cabecera;
        boolean encontrado = false;

        while(aux != null && !encontrado){
            if (valor == aux.getDato()){
                encontrado = true;
            } else {
                aux = aux.getEnlace();
            }
        }
        return encontrado;
    }
}

