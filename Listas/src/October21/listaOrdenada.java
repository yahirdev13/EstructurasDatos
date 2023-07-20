package October21;



public class listaOrdenada {
        public static void main(String[] args) {
            listaEnlazada lista = new listaEnlazada();
            for (int i = 0; i < 10; i++){
                lista.insertar((int) (Math.random() * 100));
            }

            System.out.println();

        }
    }

