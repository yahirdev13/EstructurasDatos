import java.util.Scanner;

public class UsarCuerpos {
    public static void main(String args[]){

        Scanner leer = new Scanner(System.in);
        Esfera e;
        Cubo c;

        System.out.println("---------------------------------------");
        System.out.println("Ingrese el radio de la esfera");
        e = new Esfera(leer.nextDouble());
        System.out.println("Ingrese el lado del cubo");
        c = new Cubo(leer.nextDouble());
        System.out.println("---------------------------------------");
        System.out.println("Radio de la esfera: " + e.getRadio());
        System.out.println("Area de la esfera: " + e.calcularArea());
        System.out.println("Volumen de la esfera: " + e.calcularVolumen());
        System.out.println("Diametro de la esfera: " + e.calcularDiametro());
        System.out.println("Circunferencia de la esfera: " + e.calcularCircunferencia());
        System.out.println("---------------------------------------");
        System.out.println("Lado del cubo: " + c.getLado());
        System.out.println("Area del cubo: " + c.calcularArea());
        System.out.println("Volumen del cubo: " + c.calcularvolumen());

    }
}
