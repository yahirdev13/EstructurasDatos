import java.util.Scanner;

public class busquedaCiudades {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int encontrado, busquedaP = 0;
        String [] ciudades = {"cdmx","toronto","texas","roma","barcelona","paris","cuernavaca","yemen","chicago","monterrey"};
        String busqueda;

        System.out.println("ingrese la ciudad que desea busacar");
        busqueda = leer.next();

        encontrado = -1;
        for (int i = 0; i < ciudades.length; i++){
            if (busqueda.equalsIgnoreCase(ciudades[i])){
                busquedaP = i;
            }
        }

        System.out.println("La ciudad " + busqueda + " se encuentra en la posicion " + busquedaP);
    }
}
