import java.util.Arrays;
import java.util.Scanner;

public class pareseimpares {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int [] numeros = {11,22,33,44,55,66,77,88,99,100};

        int [] numerosPares, numerosImpares;

        int pares = 0, impares = 0;

        int saltop = 0, saltoi = 0;


        for( int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }

        numerosPares = new int [pares];
        numerosImpares = new int [impares];


        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 == 0){
                numerosPares[saltop] = numeros[i];
                saltop ++;
            }else{
                numerosImpares[saltoi] = numeros[i];
                saltoi ++;
            }
        }

        System.out.println("---------------------------------------");
        System.out.println(Arrays.toString(numeros));
        System.out.println("---------------------------------------");
        System.out.println("Numeros que son pares: " + pares);
        for (int i = 0; i < numerosPares.length ; i++){
            System.out.println(numerosPares[i]);
        }
        System.out.println("---------------------------------------");
        System.out.println("Numeros que son impares: " + impares);
        for (int i = 0; i < numerosImpares.length; i++){
            System.out.println(numerosImpares[i]);
        }
        System.out.println("---------------------------------------");
    }
}
