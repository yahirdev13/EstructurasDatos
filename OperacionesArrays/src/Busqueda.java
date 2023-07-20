import java.util.Scanner;

public class Busqueda {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int busqueda, mayor = 0, menor = 0, busquedaP = 0, mayorP = 0, menorP = 0, encontrado =0;
        int [] numeros = new int [100];

        System.out.println("Ingrese el numero que quiere buscar");
        busqueda = leer. nextInt();

        for (int i =0; i < numeros.length; i++){
            numeros[i] = (int) (Math.random() * 1000 +1);
        }

        mayor = numeros[numeros.length - 1];
        for (int i = 0; i < numeros.length - 1; i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
                mayorP = i;

            }
        }

        menor = numeros[0];
        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] < menor){
                menor = numeros[i];
                menorP = i;
            }
        }

        encontrado = -1;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == busqueda){
                encontrado = 1;
                busquedaP = i;
            }
        }


        System.out.println("El valor menor es " + menor + " y se encuentra en la posicion " + menorP);
        System.out.println("El valor mayor es " + mayor + " y se encuentra en la posicion " + mayorP);
        System.out.println("La posicion del valor " + busqueda + " es: " + busquedaP);
    }
}
