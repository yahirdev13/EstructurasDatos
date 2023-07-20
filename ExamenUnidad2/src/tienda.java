import java.util.Scanner;

public class tienda {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        String [] claves = {"P001","P002","P003","P004","P005","P006","P007","P008","P009","P010","P011","P012","P013","P014","P015","P016","P017","P018","P019","P020"};
        int [] existencias = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        double [] precios = {10.5,23,54,32,56,52,64,45.6,43.6,43.7,43.43,7,43.4,54,23,54,13,24,35,30};
        int index;
        int opc;

        do{
            System.out.println("-------------------------------------");
            System.out.println("MENU TIENDA");
            System.out.println("-------------------------------------");
            System.out.println("1. Producto con mayor existencia");
            System.out.println("2. Producto con mayor precio");
            System.out.println("3. Comprar Productos");
            System.out.println("4. Vender Productos");
            System.out.println("5. Actualizar precio de un producto");
            System.out.println("6. Salir del programa");
            System.out.println("-------------------------------------");
            opc = read.nextInt();
            switch (opc){
                case 1:
                    System.out.println("El producto con mas existencia es:");
                    index = mayorExistencia(existencias);
                    System.out.println("Clave      Existencia     Precio");
                    System.out.println(claves[index] + "          " + existencias[index] + "          " + precios[index]);
                    break;
                case 2:
                    System.out.println("\nProducto con mayor precio de venta es:");
                    index = mayorPrecio(precios);
                    System.out.println("Clave      Existencia     Precio");
                    System.out.println(claves[index] + "          " + existencias[index] + "          " + precios[index]);
                    break;
                case 3:
                    do {
                        opc = 0;
                        System.out.println("Escribe la clave del producto para vender");
                        String clave = read.next();
                        int resul = serch(claves, clave);
                        if (resul != -1) {
                            System.out.println("ingrese la cantidad de productos");
                            int cant = read.nextInt();
                            if (cant <= existencias[resul]) {
                                existencias[resul] -= cant;
                                opc = 1;
                            } else {
                                System.out.println("No se puede procesar la venta por existencias");
                            }
                        } else {
                            System.out.println("El producto no existe");
                        }
                    }while (opc == 0);
                    break;
                case 4:
                    do {
                        opc = 0;
                        System.out.println("Escribe la clave del producto para comprar");
                        String clave2 = read.next();
                        int resul2 = serch(claves, clave2);
                        if (resul2 != -1) {
                            System.out.println("ingrese la cantidad de productos");
                            int cant = read.nextInt();
                            existencias[resul2] += cant;
                            opc = 1;
                        } else {
                            System.out.println("El producto no existe");
                        }
                    }while(opc == 0);
                    break;
                case 5:
                    do {
                        opc =0;
                        System.out.println("Escribe la clave del producto");
                        String clave3 = read.next();
                        int resul3 = serch(claves, clave3);
                        if (resul3 != -1) {
                            System.out.println("Clave      Existencia     Precio");
                            System.out.println(claves[resul3] + "\t\t" + existencias[resul3] + "\t\t" + precios[resul3] + "\n");
                            System.out.println("Escribe el nuevo precio");
                            double precio = read.nextDouble();
                            precios[resul3] = precio;
                            opc = 1;
                        } else {
                            System.out.println("No se encontro el producto");
                        }
                    }while(opc == 0);
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese nuevamente");
            }

        }while(opc != 6);

        
    }
    public static int mayorExistencia(int array[]) {
        double mayor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return find(array, mayor);
    }
    public static int mayorPrecio(double array[]) {
        double mayor = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
        }
        return find(array, mayor);
    }


    public static int find(double[] array, double num){
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static int find(int[] array, double num){
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                return i;
            }
        }
        return -1;
    }

    private static int serch(String [] claves, String clave) {
        for (int i = 0; i < claves.length; i++){
            if (claves[i].equalsIgnoreCase(clave)){
                return i;
            }
        }
        return -1;
    }
}
