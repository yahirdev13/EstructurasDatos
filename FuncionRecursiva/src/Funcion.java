public class Funcion {
    public static void main(String[] args) {

        int n = 8;
        int result = 1;
        int factorial = 0;

        System.out.println("-----------------------------");
        System.out.println("El resultado es de: " + examen(n));
    }

    /*public static void muestraNumeros(int n){
        if (n ==0 ){

        }else{
            System.out.println(n);
            muestraNumeros(n - 1);
        }
    }

    public static int factorialNumeros(int n){

        if (n==0){
            n = 1;
        }else{
            n = n * factorialNumeros(n -1);
        }
        return n;
    }

    public static int sumarNaturales(int n){
        if (n == 0){

        }else{
            n = n + sumarNaturales(n - 1);
        }
        return n;
    }*/

    public static double examen(int n){
        if (n ==0){
            return 1;
        } else if (n ==1) {
            return 2;
        }else{
            return 3 * examen(n-2) + 2 *examen(n-1);
        }
    }
}
