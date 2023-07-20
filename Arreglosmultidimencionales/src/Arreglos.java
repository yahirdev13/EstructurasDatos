import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int longitud;
        int opc;
        int columnas = 2;

        System.out.println("Ingrese el numero del problema");
        opc = leer.nextInt();


        switch (opc){
            case 1:
                //registrar alumnos
                System.out.println("Ingrese la longitud de alumnos para resgitrar");
                longitud = leer.nextInt();
                String alumnos [][] = new String [longitud][columnas];

                for (int i = 0; i < alumnos.length; i++){
                    System.out.println("ingrese la matricula y el nombre del alumno");
                    for (int x = 0; x < alumnos[i].length; x++){
                        alumnos[i][x] = leer.next();
                    }
                }

                for (int i  = 0; i < alumnos.length; i++){
                    for (int x = 0; x < alumnos[i].length; x++){
                        System.out.println(alumnos[i][x]);
                    }
                }
                break;
            case 2:
                //suma y resta de matrices
                System.out.println("Ingrese la longitud de la matriz");
                longitud = leer.nextInt();
                int num1 [][] = new int [longitud][columnas];
                int num2 [][] = new int [longitud][columnas];
                int suma [][] = new int [longitud][columnas];
                int resta [][] = new int [longitud][columnas];
                for (int i = 0; i < num1.length; i++){
                    System.out.println("ingrese el par de numeros");
                    for (int x = 0; x < num1[i].length; x++){
                        num1[i][x] = leer.nextInt();
                    }
                }

                for (int i = 0; i < num2.length; i++){
                    System.out.println("ingrese el par de numeros");
                    for (int x = 0; x < num2[i].length; x++){
                        num2[i][x] = leer.nextInt();
                    }
                }

                for (int i = 0; i < num2.length; i++){
                    for (int x = 0; x < num2[i].length; x++){
                        System.out.println(num1[i][x] + num2[i][x]);
                    }
                }

                break;
            default:
                System.out.println("No valido mi panita");
        }
    }
}
