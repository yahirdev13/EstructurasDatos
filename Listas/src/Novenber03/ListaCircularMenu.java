package Novenber03;

import java.util.Scanner;

public class ListaCircularMenu {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("LISTA CIRCULAR");
        ListaCircular listaC = new ListaCircular();

        
        System.out.println("Menu principal "
                + "\n1. Ingresar elemento"
                + "\n2. Buscar elemento y eliminarlo"
                + "\n3. Mostrar numero de elementos de la lista"
                + "\n4. Mostrar todos los elementos de la lista");
        switch (read.nextInt()) {
            case 1:
                System.out.println("Ingresa el nuevo elemento:");
                listaC.insertarInicio(read.nextInt());
                System.out.println("Elemento ingresado con exito");
                break;
            case 2:
                System.out.println("Ingresa el elemento:");
                int buscar = listaC.Buscar(read.nextInt());
                if (buscar!=-1) {
                    System.out.println("Elemento encontrado en la lista circular, deseas eliminarlo? 1= SI, cualquier otro num=NO");
                    int confirmacion = read.nextInt();
                    if (confirmacion==1) {
                        System.out.println("Elemento eliminado con exito");
                    }else{
                        System.out.println("Eliminacion cancelada");
                    }
                }else{
                    System.out.println("Numero no encontrado");
                }
                
                break;         
            case 3:
                System.out.println("La lista circular tiene "+listaC.NumElementos());
                break;
            case 4:
                System.out.println("MOSTRAR ELEMENTOS");
                System.out.println(listaC.mostrarLista());
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
