import java.util.Scanner;

public class ordenamientoShell {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int [] numeros;
        int salto = 0, aux = 0;
        boolean cambio;

        System.out.println("Ingresa la longitud del arreglo");
        numeros = new int[read.nextInt()];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = (int) (Math.random() * 1000);

            if(i < numeros.length - 1){
                System.out.print(numeros[i] + ", ");
            }else{
                System.out.println(numeros[i]);
            }

        }

        System.out.println("----------------------------------");


        salto = numeros.length / 2;

        while( salto > 0){
            cambio = true;
            while (cambio){
                cambio = false;
                for (int i = salto; i < numeros.length; i++){
                    if (numeros[i - salto] > numeros[i]){
                        aux = numeros[i];
                        numeros[i] = numeros[i - salto];
                        numeros[i - salto]= aux;
                        cambio = true;
                    }
                }
            }
            salto = salto / 2;
        }

        for (int i = 0; i < numeros.length; i++){

            if(i < numeros.length - 1){
                System.out.print(numeros[i] + ", ");
            }else{
                System.out.println(numeros[i]);
            }
        }

    }
}
