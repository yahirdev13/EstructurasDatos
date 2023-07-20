import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int num;

        System.out.println("Ingrese un numero");
        num = leer.nextInt();

        funPar(num);

        if(funPar(num)){
            System.out.println("El numero ingresado es par");
        }else{
            System.out.println("El numero ingresado es impar");
        }
    }

    public static boolean funPar(int num){
        if(num == 0){
            return true;
        }else{
            return funImpar( num-1);
        }
    }

    public static boolean funImpar(int num){
        if(num == 0){
            return false;
        }else{
            return funPar(num -1);
        }
    }

}
