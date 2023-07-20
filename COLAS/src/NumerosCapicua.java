import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class NumerosCapicua {
    public static void main(String[] args) {

        Stack<Character> pilaC = new Stack<>();
        LinkedList<Character> colaC = new LinkedList<>();

        Scanner read = new Scanner(System.in);

        int num;

        String cadenaNumeros;

        System.out.println("Ingrese un numero capicúa");
        num = read.nextInt();

        cadenaNumeros = "" + num;

        for (int i = 0; i < cadenaNumeros.length(); i++){
            pilaC.push(cadenaNumeros.charAt(i));
            colaC.add(cadenaNumeros.charAt(i));
        }

        for (int i = 0; i < cadenaNumeros.length(); i++){
            if (colaC.peekFirst() == pilaC.peek()){
                colaC.removeFirst();
                pilaC.pop();
            }
        }

        if (colaC.isEmpty() && pilaC.isEmpty()){
            System.out.println("Los numeros ingresados SON Capicúas");
        }else{
            System.out.println("Los numeros ingresados NO son Capicúas");
        }

    }
}
