import java.util.Scanner;

public class ExamenU1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int opc, n;
        String text;

        String oracion = "esta es una oracion";
        char[] array = oracion.toCharArray();
        array = eliminarVocales(0, array);





        System.out.println("Ingrese num del problema");
        opc =leer.nextInt();


        switch (opc){
            case 1:



                break;
            case 2:
                //Eliminar vocales
                String texto = String.valueOf(array);
                System.out.println(texto);

                System.out.println("Alumno: Yahir Alberto Diaz Gonzalez");
                break;
            case 3:
                //Reverso
                System.out.println("Ingrese una palabra");
                text = leer.next();
                System.out.println(reverso(text));

                System.out.println("Alumno: Yahir Alberto Diaz Gonzalez");
                break;
            case 4:
                //Conversion
                System.out.println("ingrse n");
                n = leer.nextInt();
                System.out.println(sumaDeSeries(n, suma + (float) 1 / i));

                System.out.println("Alumno: Yahir Alberto Diaz Gonzalez");
                break;
            default:
                System.out.println("no valido");
        }
    }

    public static char[] eliminarVocales(int i, char [] array){
        if (i == array.length){
            return array;
        }else{
            char auxiliar = array[i];
            if (auxiliar == 'a' || auxiliar == 'e' || auxiliar == 'i' || auxiliar == 'o' || auxiliar == 'u'){
                array[i] = ' ';
            }
            return eliminarVocales(++i, array);
        }

    }

    public static String reverso(String text){
        if (text.length() == 1) {
            return text;
        }else {
            return reverso(text.substring(1)) + text.charAt(0);
        }
    }

    public static float sumaDeSeries(int n, float v){
        float suma;
        int i;
        suma = 0;
        i = 0;

        if (i < n){
            i++;
            if (i%2 == 0){
                return sumaDeSeries(n,suma - (float)1/i);
            } else {
                return sumaDeSeries(n,suma + (float)1/i);
            }
        } else {
            return suma;
        }

    }

}
