import java.util.Arrays;

public class ordenamientos {
    static double tiempoBurbuja;

    static double tiempoShell;

    static double tiempoQuickSort;

    public static void main(String[] args) {

        double[] numeros = new double[10000];



        System.out.println("Ordenamiento Burbuja");
        tiempoBurbuja = System.currentTimeMillis();
        System.out.println(Arrays.toString(burbuja(numeros)));
        tiempoBurbuja = System.currentTimeMillis() - tiempoBurbuja;
        System.out.println("Ordenamiento Shell");
        tiempoShell = System.nanoTime();
        System.out.println(Arrays.toString(shell(numeros)));
        tiempoShell = System.nanoTime() - tiempoShell;
        System.out.println("Ordenamiento QuickSort");
        tiempoQuickSort = System.nanoTime();
        quickSort(numeros, 0, numeros.length-1);
        tiempoQuickSort = System.nanoTime();
        System.out.println(Arrays.toString(numeros));



        //asignamos numeros random al arreglo
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = Math.random() * 2000;
        }

    }


    public static double[] burbuja(double numeros[]){
        double aux;
        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros.length-i-1; j++){
                if (numeros[j+1] < numeros[j]){
                    aux = numeros[j+1];
                    numeros[j+1] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        return numeros;
    }

    public static double[] shell(double array[]){
        int n = array.length;
        int salto = n/2;
        double aux;
        boolean cambio;

        while(salto > 0){
            cambio = true;
            while(cambio){
                cambio = false;
                for (int i = salto; i < n; i++){
                    if (array[i-salto] > array[i]){
                        aux = array[i];
                        array[i] = array[i-salto];
                        array[i-salto] = aux;
                        cambio = true;

                    }
                }
            }
            salto /= 2;
        }

        return array;
    }

    public static void quickSort(double[] array, int inicio, int fin){
        if(inicio>=fin) return;
        double pivote=array[inicio];
        int elemIzq=inicio+1;
        int elemDer=fin;
        while(elemIzq<=elemDer){
            while(elemIzq<=fin && array[elemIzq]<pivote){
                elemIzq++;
            }
            while(elemDer>inicio && array[elemDer]>=pivote){
                elemDer--;
            }
            if(elemIzq<elemDer){
                double temp=array[elemIzq];
                array[elemIzq]=array[elemDer];
                array[elemDer]=temp;
            }
        }

        if(elemDer>inicio){
            double temp=array[inicio];
            array[inicio]=array[elemDer];
            array[elemDer]=temp;
        }
        quickSort(array, inicio, elemDer-1);
        quickSort(array, elemDer+1, fin);
    }


}

