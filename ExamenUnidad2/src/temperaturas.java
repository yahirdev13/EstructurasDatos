import java.util.Arrays;

public class temperaturas {
    public static void main(String[] args) {

        int [] temperaturas;

        int cSup = 0, cInf = 0, saltoS = 0, saltoI = 0, N = 60;

        int [] temSup, temInf;

        int promedio = 0;

        temperaturas = new int[N];

        for (int i = 0; i < temperaturas.length; i++){
            temperaturas[i] = (int) (Math.random() * 10);
            promedio += temperaturas[i];
        }

        promedio /= temperaturas.length;

        for (int i =0; i < temperaturas.length; i ++){
            if (temperaturas[i] > promedio){
                cSup++;
            }else{
                cInf++;
            }
        }

        temSup = new int[cSup];
        temInf = new int[cInf];

        for (int i = 0; i < temperaturas.length; i++){
            if (temperaturas[i] > promedio){
                temSup[saltoS] = temperaturas[i];
                saltoS++;
            }else{
                temInf[saltoI] = temperaturas[i];
                saltoI++;
            }
        }

        System.out.println("longitud del arreglo de temperaturas: " + temperaturas.length);
        System.out.println("Promedio: " + promedio);
        System.out.println("Temperaturas superiores al promedio: ");
        System.out.println(Arrays.toString(temSup));
        System.out.println("Temperaturas inferiores al promedio: ");
        System.out.println(Arrays.toString(temInf));
    }
}
