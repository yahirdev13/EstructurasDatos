package October28;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class rentaPelis {

    static LinkedList<Peliculas> pelis = new LinkedList<>();
    static LinkedList<Peliculas> pelisRentadas = new LinkedList<>();

    public static void main(String[] args) {

        int opc;
        String opcPeli;
        String id = "";

        Scanner read = new Scanner(System.in);

        do{
            System.out.println("-------------------\nMENU PELICULAS\n-------------------" +
                    "\n 1. Renta de peliculas" +
                    "\n 2. Devolucion de peliculas" +
                    "\n 3. Generar reporte de peliculas" +
                    "\n 4. Agregar peliculas" +
                    "\n 5. Eliminar peliculas" +
                    "\n 6. Salir");
            opc = read.nextInt();

            switch (opc){
                case 1://Rentar peliculas
                    System.out.println("------------------------------------------\nLista de peliculas disponibles para renta\n------------------------------------------");
                    if(!pelis.isEmpty()){
                        pelisDisponibles();
                        System.out.println("Ingrese el id de la pelicula a rentar");
                        id = read.next();
                        if (rentarMovies(id)){
                            System.out.println("Pelicula rentada exitosamente");
                        }else{
                            System.out.println("Ocurrio un error inesperadamente");
                        }
                    }else{
                        System.out.println("No existen peliculas para rentar");
                    }






















                    PelisDisponibles();
                    System.out.println("Ingrese el codigo de la pelicula");
                    opcPeli = read.next();
                    serchMovie(opcPeli);
                    rentarMovies(opcPeli);
                    break;
                case 2://Devolver pelis
                    System.out.println("------------------------------------------\nDevolver peliculas\n------------------------------------------");

                    break;
                case 3://Reporte de pelis
                    System.out.println("------------------------------------------\nReporte de peliculas\n------------------------------------------");
                    if (!pelis.isEmpty()) {
                        reporteMovies();
                        System.out.print("\n");
                    } else {
                        System.out.println("No hay peliculas disponibles\n");
                    }
                    break;
                case 4://Agregar pelis
                    System.out.println("------------------------------------------\nAgregar pelicula\n------------------------------------------");



                    break;
                case 5://Eliminar pelis
                    System.out.println("------------------------------------------\nEliminar pelicula\n------------------------------------------");
                    if (!pelis.isEmpty()) {
                        mostrarPelis();
                        System.out.print("Ingrese el id de la pelicula");
                        id = read.next();
                        if (eliminarPelicula(id)) {
                            System.out.println("La pelicula se elimino del catalogo");
                        } else {
                            System.out.println("No se puedo eliminar la pelicula del catalogo");
                        }
                    } else {
                        System.out.println("No hay peliculas disponibles");
                    }

                    break;
                case 6://salir
                    opc = 6;
                    break;
                default:
                    System.out.println("Opcion no valida, vuelva a intentarlo");
            }
        }while (opc != 6);

    }


    public static void PelisDisponibles(){
        System.out.println("Codigo\t Titulo\t Duracion\t Genero");
        if (!pelis.isEmpty()){
            for (Peliculas peliculas : pelis){
                System.out.println(peliculas.getId() +"\t"+ peliculas.getTitulo() +"\t"+ peliculas.getDuracion() +"\t"+ peliculas.getGenero() );
            }
        }else{
            System.out.println("No hay peliculas disponibles para rentar");
        }
    }

    public static Peliculas serchMovie(LinkedList<Peliculas> pelis, String id, boolean add){
        for (Peliculas peliculas : pelis){
            if (peliculas.getId().equalsIgnoreCase(id)){
                return peliculas;
            }
        }
        if (!add){
            System.out.println("Pelicula no encontrada");
        }
        return null;
    }

    public static boolean rentarMovies(String id){
        Peliculas peliculaEncontrada = serchMovie(pelis, id, false);
        if (peliculaEncontrada != null){
            Pelis peliculaEncontradaRentada






            return true;
        }else{
            return false;
        }
    }


    public static void reporteMovies(){
        if (!pelis.isEmpty()) {
            System.out.println("------------------------------------------\nPeliculas rentadas\n------------------------------------------");
            if (pelisRentadas.isEmpty()){
                System.out.println("No hay peliculas disponibles");
            } else {
                mostrarPelisRentadas();
            }
            System.out.println("------------------------------------------\nPeliculas disponibles\n------------------------------------------");
            pelisDisponibles();
            System.out.println("------------------------------------------\nTOP peliculas\n------------------------------------------");
            ordenarPelis(true);
            mostrarPelis();
            System.out.println("------------------------------------------\nPeliculas menos rentadas\n------------------------------------------");
            ordenarPelis(false);
            mostrarPelis();
        } else {
            System.out.println("No hay peliculas disponibles");
        }
    }

    public static void mostrarPelisRentadas(){
        System.out.printf("%-"+tabCodigo+"s|%-"+tabTitulo+"s|%-"+tabDuracion+"s|%-"+tabGenero+"s|%-"+tabDisponible+"s|%n",
                "Codigo", "Titulo", "Duracion", "Genero","Rentadas");
        if (!peliculasRentadas.isEmpty()) {
            for (Pelicula pelicula : peliculasRentadas) {
                System.out.printf("%-"+tabCodigo+"s|%-"+tabTitulo+"s|%-"+tabDuracion+"s|%-"+tabGenero+"s|%-"+tabDisponible+"s|%n",
                        pelicula.getCodigo(), pelicula.getTitulo(), pelicula.getDuracion() + "h", pelicula.getGenero(), pelicula.getCantidad());
            }
        } else {
            System.out.println("No hay peliculas");
        }
    }

    public static void pelisDisponibles(){
        int i = 0;
        System.out.printf("%-"+tabCodigo+"s|%-"+tabTitulo+"s|%-"+tabDuracion+"s|%-"+tabGenero+"s|%-"+tabDisponible+"s|%n",
                "Codigo", "Titulo", "Duracion", "Genero","Disponibles");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getCantidad() > 0){
                System.out.printf("%-"+tabCodigo+"s|%-"+tabTitulo+"s|%-"+tabDuracion+"s|%-"+tabGenero+"s|%-"+tabDisponible+"s|%n",
                        pelicula.getCodigo(), pelicula.getTitulo(), pelicula.getDuracion() + "h", pelicula.getGenero(), pelicula.getCantidad());
                i++;
            }
        }
        if (i == 0){
            System.out.println("No hay peliculas disponibles");
        }

    }

    public static void ordenarPelis(boolean ordenarPorMasRentada) {
        Pelicula aux;
        for(int i = 0;i < pelis.size()-1;i++){
            for(int j = 0;j < peliculas.size()-i-1;j++){
                if (!ordenarPorMasRentada) {
                    if (peliculas.get(j + 1).getHistorialRentas() < peliculas.get(j).getHistorialRentas()) {
                        aux = peliculas.get(j + 1);
                        peliculas.set(j + 1, peliculas.get(j));
                        peliculas.set(j, aux);
                    }
                } else {
                    if (peliculas.get(j + 1).getHistorialRentas() > peliculas.get(j).getHistorialRentas()) {
                        aux = peliculas.get(j + 1);
                        peliculas.set(j + 1, peliculas.get(j));
                        peliculas.set(j, aux);
                    }
                }
            }
        }
    }

    public static void mostrarPelis(){
        System.out.printf("%-"+tabCodigo+"s|%-"+tabTitulo+"s|%-"+tabDuracion+"s|%-"+tabGenero+"s|%-"+tabDisponible+"s|%-"+tabRentas+"s|%n",
                "Codigo", "Titulo", "Duracion", "Genero","Disponibles", "Rentas");
        if (!peliculas.isEmpty()) {
            for (Pelicula pelicula : peliculas) {
                System.out.printf("%-"+tabCodigo+"s|%-"+tabTitulo+"s|%-"+tabDuracion+"s|%-"+tabGenero+"s|%-"+tabDisponible+"s|%-"+tabRentas+"s|%n",
                        pelicula.getCodigo(), pelicula.getTitulo(), pelicula.getDuracion() + "h", pelicula.getGenero(), pelicula.getCantidad(), pelicula.getHistorialRentas());
            }
        } else {
            System.out.println("No hay peliculas");
        }
    }

    private static boolean eliminarPelicula(String id) {
        Peliculas peliEncontrada = serchMovie(pelis, id, false);
        Peliculas peliEncontradaRentada = serchMovie(pelisRentadas, id, true);
        if (peliEncontrada != null){
            pelis.remove(peliEncontrada);
            if (peliEncontradaRentada != null){
                pelisRentadas.remove(peliEncontradaRentada);
            }
            return true;
        } else {
            return false;
        }
    }


}
