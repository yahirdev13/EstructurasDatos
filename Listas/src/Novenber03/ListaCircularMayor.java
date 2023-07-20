package Novenber03;
public class ListaCircularMayor {
    public static void main(String[] args) {
        System.out.println("LISTA CIRCULAR");
        ListaCircular listaC = new ListaCircular();
        listaC.insertarFinal(4);
        listaC.insertarInicio(2);
        listaC.insertarInicio(3);
        listaC.insertarInicio(1);
        listaC.insertarInicio(10);
        System.out.println(listaC.mostrarLista());
        System.out.println("El numero mayor es: "+listaC.NumMayor());
    }
}
