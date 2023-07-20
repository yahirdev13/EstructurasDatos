package October21;

public class listaEnlazada {
    nodo cabecera;
    int T;

    public listaEnlazada(){
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
        int i = 0;
        while(indice != null){
            if (i < ListaSize()-1) {
                cadena += indice.getDato() + ", ";
                indice = indice.getEnlace();
            }else {
                cadena += indice.getDato();
                indice = indice.getEnlace();
            }
            i++;
        }
        return cadena + "]";
    }

    public String aString(listaEnlazada lista){
        String cadena = "[";
        nodo indice = lista.cabecera;
        int i = 0;
        while(indice != null){
            if (i < lista.ListaSize()-1) {
                cadena += indice.getDato() + ", ";
                indice = indice.getEnlace();
            }else {
                cadena += indice.getDato();
                indice = indice.getEnlace();
            }
            i++;
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

    public listaEnlazada pares(){
        listaEnlazada pares = new listaEnlazada();
        nodo indice = cabecera;
        while(indice != null) {
            if (indice.getDato() % 2 == 0) {
                pares.insertar(indice.getDato());
            }
            indice = indice.getEnlace();
        }
        return pares;
    }

    public listaEnlazada impares(){
        listaEnlazada impares = new listaEnlazada();
        nodo indice = cabecera;
        while(indice != null) {
            if (indice.getDato() % 2 != 0) {
                impares.insertar(indice.getDato());
            }
            indice = indice.getEnlace();
        }
        return impares;
    }


    public void ordenar(){
        nodo actual = cabecera;
        nodo sig = cabecera.getEnlace();
        int temp = 0;
        nodo aux;
        int t=1, c=1;

        while(actual.getEnlace() != null){
            actual = actual.getEnlace();
            c++;
        }

        do {
            if (actual.getDato() > sig.getDato()){
                temp = actual.getDato();
            }
        }while(t<=c);
    }
}

