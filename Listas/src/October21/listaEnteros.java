package October21;

public class listaEnteros {
    public static void main(String[] args) {
        listaEnlazada lista = new listaEnlazada();
        lista.insertar(6);
        lista.insertar(7);
        lista.insertar(8);
        lista.insertar(9);
        lista.insertar(10);
        System.out.println(lista.aString());
    }
}
