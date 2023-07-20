package October27;

import java.util.Scanner;

public class menu {

    public static void main(String[] args) {


        Scanner read = new Scanner(System.in);



        int opc, opc2;

        do{
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Obtener primer elemento");
            System.out.println("2. Obtener ultimo elemento");
            System.out.println("3. Eliminar lista");
            System.out.println("4. Ordenar lista");
            System.out.println("5. Salir del sistema");
            opc = read.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Ingrese ");
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Ingrese el valor de Ordenamiento");
                    System.out.println("1. Ascendente");
                    System.out.println("2. Desendente");
                    opc2 = read.nextInt();

                    if (opc2 == 1){

                    }else{

                    }

                    break;
                case 5:
                    opc = 5;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }while(opc != 5);
    }
}
