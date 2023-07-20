package October20;

public class Lista {
    public static void main(String[] args) {

        listaSimple lista = new listaSimple();

        lista.insertar(100);
        lista.insertar(200);
        lista.insertar(300);
        lista.insertar(500);
        lista.insertar(800);
        lista.insertar(900);
        lista.insertar(970);

        System.out.println(lista.aString());

    }
}
