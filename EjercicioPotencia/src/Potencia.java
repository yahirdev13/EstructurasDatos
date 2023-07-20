import java.util.Scanner;

public class Potencia {

    public static void main(String[] args) {

        int num, potencia;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero base");
        num = leer.nextInt();
        System.out.println("Ingrese el valor de la potencia");
        potencia = leer.nextInt();

        System.out.println("El resultado de la potencia es de: " + funPotencia(num, potencia));
    }

    public static int funPotencia(int num, int potencia){
        if (potencia == 0){
            return 1;
        }else{
            return (num * funPotencia(num, potencia -1));
        }

    }
}
