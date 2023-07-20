import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int suma = 0, contadorMenores = 0, contadorMayores = 0;
        double promedio;
        String [][] datos = new String[3][2];
        String [][] datosMayores = new String[3][2];
        String [][] datosMenores = new String[3][2];


        for (int i = 0; i < datos.length; i++){
            int y = 0;
            System.out.println("Ingrese el nombre del alumno");
            datos[i][y] = leer.next();
            y++;
            System.out.println("Ingrese la estatura en cm");
            datos[i][y] = leer.next();

            suma += Integer.parseInt(datos[i][y]);
        }

        promedio = suma / datos.length;

        for (int i = 0; i < datos.length; i++){
            if (Integer.parseInt(datos[i][1]) < promedio){
                contadorMenores++;

            }else{
                contadorMayores++;
            }
        }

        datosMenores = new String[contadorMenores][2];
        datosMayores = new String[contadorMayores][2];

        System.out.println("La estatura promedio es: " + promedio);
        System.out.println("Hay " + contadorMayores + " alumnos que son mas altos que el promedio");
        for (int i = 0; i < datos.length;i++){
            if (Integer.parseInt(datos[i][1]) > promedio){
                System.out.println("Nombre: " + datos[i][0] + " con " + datos[i][1] + " centimetros");
            }
        }

        System.out.println("Hay " + contadorMenores + " alumnos que son mas bajos que el promedio");
        for (int i = 0; i < datos.length;i++){
            if (Integer.parseInt(datos[i][1]) < promedio){
                System.out.println("Nombre: " + datos[i][0] + " con " + datos[i][1] + " centimetros");
            }
        }


    }
}
