package pelis;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class MenuPeliculas {
    static LinkedList<Pelicula> peliculas = new LinkedList<>();
    static LinkedList<Pelicula> peliculasRentadas = new LinkedList<>();
    static int tabCodigo = 7,
    tabTitulo = 50,
    tabDuracion = 10,
    tabGenero = 9,
    tabDisponible = 13,
    tabRentas = 8;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        byte opc, opc2;
        boolean bandera;
        String codigo, titulo, genero = "";
        double duracion;
        int cantidad;

        /*peliculas.add(new Pelicula("FF1", "Thor", "Accion", 2, 10));
        peliculas.add(new Pelicula("FF2", "Spider Man", "Accion", 2, 10));
        peliculas.add(new Pelicula("FF3", "Las cronicas de spiderwick", "Drama", 2, 10));
        peliculas.add(new Pelicula("FF4", "Bob esponja", "Comedia", 2, 1));*/
        do {
            System.out.println("Selecciona una opcion:\n" +
                    "1. Rentar una pelicula\n" +
                    "2. Devolver una pelicula\n" +
                    "3. Generar reporte\n" +
                    "4. Agregar pelicula\n" +
                    "5. Eliminar pelicula\n" +
                    "6. Salir");
            opc = in.nextByte();
            switch (opc){
                case 1:
                    System.out.println("\n**********RENTA DE PELICULAS**********");
                    if (!peliculas.isEmpty()) {
                        peliculasDisponibles();
                        System.out.print("Escribe un codigo: ");
                        codigo = in.next();
                        if (rentarPelicula(codigo)) {
                            System.out.println("Pelicula rentada exitosamente\n");
                        } else {
                            System.out.println("Error, pelicula no rentada\n");
                        }
                    } else {
                        System.out.println("No hay peliculas disponibles\n");
                    }
                    break;
                case 2:
                    System.out.println("\n**********DEVOLVER UNA PELICULA**********");
                    if (!peliculas.isEmpty()) {
                        mostrarPeliculasRentadas();
                        System.out.println("Escribe un codigo");
                        codigo = in.next();
                        if (devolverPelicula(codigo)){
                            System.out.println("Pelicula devuelta exitosamente\n");
                        } else {
                            System.out.println("Error, pelicula no devuelta\n");
                        }
                    } else {
                        System.out.println("No hay peliculas disponibles\n");
                    }
                    break;
                case 3:
                    System.out.println("\n**********GENERAR REPORTE**********");
                    if (!peliculas.isEmpty()) {
                        generarReporte();
                        System.out.print("\n");
                    } else {
                        System.out.println("No hay peliculas disponibles\n");
                    }
                    break;
                case 4:
                    //pides datos
                    System.out.println("\n**********AGREGAR PELICULA**********");
                    do {
                        System.out.println("Escribe el codigo de la pelicula: "); codigo = in.next();
                        bandera = codigoRepetido(codigo);
                        if (bandera){
                            System.out.println("El codigo ya se encuentra en uso, intentelo de nuevo");
                        }
                    }while(bandera);
                    System.out.println("Escribe el titulo de la pelicula: "); titulo = in.next();
                    do {
                        System.out.println("Escribe el genero de la pelicula: ");
                        System.out.println("Opciones disponibles:\n" +
                                "1. Drama\n" +
                                "2. Suspenso\n" +
                                "3. Terror\n" +
                                "4. Romance\n" +
                                "5. Accion\n" +
                                "6. Comedia"); opc2 = in.nextByte();
                        switch (opc2){
                            case 1:
                                genero = "Drama";
                                bandera = false;
                                break;
                            case 2:
                                genero = "Suspenso";
                                bandera = false;
                                break;
                            case 3:
                                genero = "Terror";
                                bandera = false;
                                break;
                            case 4:
                                genero = "Romance";
                                bandera = false;
                                break;
                            case 5:
                                genero = "Accion";
                                bandera = false;
                                break;
                            case 6:
                                genero = "Comedia";
                                bandera = false;
                                break;
                            default:
                                System.out.println("Error, opcion no valida, intentalo de nuevo\n");
                                bandera = true;
                        }
                    }while(bandera);
                    System.out.println("Escribe la duracion de la pelicula (en horas): "); duracion = in.nextDouble();
                    System.out.println("Escribe la cantidad disponible de la pelicula " + titulo + ": "); cantidad = in.nextInt();
                    peliculas.add(new Pelicula(codigo, titulo, genero, duracion, cantidad));
                    System.out.println("Pelicula agregada exitosamente\n");
                    break;
                case 5:
                    System.out.println("\n**********ELIMINAR PELICULA**********");
                    if (!peliculas.isEmpty()) {
                        mostrarPeliculas();
                        System.out.print("Escribe un codigo: ");
                        codigo = in.next();
                        if (eliminarPelicula(codigo)) {
                            System.out.println("Pelicula eliminada exitosamente\n");
                        } else {
                            System.out.println("Error, pelicula no eliminada\n");
                        }
                    } else {
                        System.out.println("No hay peliculas disponibles\n");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Error, selecciona una opcion valida\n");
            }
        }while (opc != 6);
    }

    private static boolean eliminarPelicula(String codigo) {
        Pelicula peliculaEncontrada = buscarPelicula(peliculas, codigo, false);
        Pelicula peliculaEncontradaRentada = buscarPelicula(peliculasRentadas, codigo, true);
        if (peliculaEncontrada != null){
            peliculas.remove(peliculaEncontrada);
            if (peliculaEncontradaRentada != null){
                peliculasRentadas.remove(peliculaEncontradaRentada);
            }
            return true;
        } else {
            return false;
        }
    }

    private static boolean codigoRepetido(String codigo) {
        return buscarPelicula(peliculas, codigo, true) != null;
    }

    public static void peliculasDisponibles(){
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

    public static void generarReporte(){
        if (!peliculas.isEmpty()) {
            System.out.println("**********PELICULAS RENTADAS**********");
            if (peliculasRentadas.isEmpty()){
                System.out.println("No hay peliculas disponibles");
            } else {
                mostrarPeliculasRentadas();
            }
            System.out.println("\n\n**********PELICULAS DISPONIBLES**********");
            peliculasDisponibles();
            System.out.println("\n\n**********PELICULAS MAS RENTADAS**********");
            ordenarPeliculas(true);
            mostrarPeliculas();
            System.out.println("\n\n**********PELICULAS MENOS RENTADAS**********");
            ordenarPeliculas(false);
            mostrarPeliculas();
            ordenarPeliculasPorCodigo();
        } else {
            System.out.println("No hay peliculas disponibles");
        }
    }

    public static void mostrarPeliculas(){
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

    public static void mostrarPeliculasRentadas(){
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

    public static void ordenarPeliculas(boolean ordenarPorMasRentada) {
        Pelicula aux;
        for(int i = 0;i < peliculas.size()-1;i++){
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

    public static void ordenarPeliculasPorCodigo() {
        Pelicula aux;
        for(int i = 0;i < peliculas.size()-1;i++){
            for(int j = 0;j < peliculas.size()-i-1;j++){
                if (peliculas.get(j + 1).getCodigo().compareToIgnoreCase( peliculas.get(j).getCodigo()) < 0) {
                    aux = peliculas.get(j + 1);
                    peliculas.set(j + 1, peliculas.get(j));
                    peliculas.set(j, aux);
                }
            }
        }
    }

    public static boolean rentarPelicula(String codigo){
        Pelicula peliculaEncontrada = buscarPelicula(peliculas, codigo, false);
        if (peliculaEncontrada != null){
            Pelicula peliculaEncontradaRentada = buscarPelicula(peliculasRentadas, peliculaEncontrada.getCodigo(), true);
            assert peliculaEncontradaRentada != null;
            if(peliculaEncontrada.getCantidad() > 0) {
                if (!peliculasRentadas.isEmpty()) {
                    if (peliculasRentadas.contains(peliculaEncontradaRentada)){
                    } else {
                        peliculasRentadas.add(new Pelicula(peliculaEncontrada));
                    }
                } else {
                    peliculasRentadas.add(new Pelicula(peliculaEncontrada));
                }
                peliculaEncontrada.incrementarRenta();
                peliculaEncontrada.setCantidad(peliculaEncontrada.getCantidad() - 1);
                peliculaEncontradaRentada = buscarPelicula(peliculasRentadas, peliculaEncontrada.getCodigo(), false);
                assert peliculaEncontradaRentada != null;
                peliculaEncontradaRentada.setCantidad(peliculaEncontradaRentada.getCantidad() + 1);
            } else {
                System.out.println("No hay suficiente cantidad de " + peliculaEncontrada.getTitulo());
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    public static boolean devolverPelicula(String codigo){
            Pelicula peliculaEncontradaRentada = buscarPelicula(peliculasRentadas, codigo, false);
            if (peliculaEncontradaRentada != null) {
                Pelicula peliculaEncontrada = buscarPelicula(peliculas, peliculaEncontradaRentada.getCodigo(), true);
                assert peliculaEncontrada != null;
                if (peliculaEncontradaRentada.getCantidad() > 1){
                    peliculaEncontradaRentada.setCantidad(peliculaEncontradaRentada.getCantidad() - 1);
                    peliculaEncontrada.setCantidad(peliculaEncontrada.getCantidad() + 1);
                } else if (peliculaEncontradaRentada.getCantidad() == 1){
                    peliculaEncontradaRentada.setCantidad(peliculaEncontradaRentada.getCantidad() - 1);
                    peliculaEncontrada.setCantidad(peliculaEncontrada.getCantidad() + 1);
                    peliculasRentadas.remove(peliculaEncontradaRentada);
                }
                return true;
            } else {
                return false;
            }
    }

    public static Pelicula buscarPelicula(LinkedList<Pelicula> peliculas, String codigo, boolean add){
        for (Pelicula pelicula: peliculas) {
            if (pelicula.getCodigo().equalsIgnoreCase(codigo)){
                return pelicula;
            }
        }
        if (!add) {
            System.out.println("Pelicula no encontrada");
        }
        return null;
    }
}