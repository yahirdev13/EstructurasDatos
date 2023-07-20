import java.util.Scanner;

public class Letras {

    public static void main(String[] args) {

        int contador = 0, posicion = 0;
        String palabra;
        char letra;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una palabra");
        palabra = leer.next();
        System.out.println("Ingrese la letra que desea contar");
        letra = leer.next().charAt(0);

        contadorLetras(palabra, letra, posicion, contador);

    }



    public static int contadorLetras(String palabra, char letra, int posicion, int contador){


        if( posicion == palabra.length()){
            return contador;
        }else{

        }

        return contador;
    }
}
