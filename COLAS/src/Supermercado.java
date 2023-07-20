import java.util.LinkedList;
import java.util.Scanner;

public class Supermercado {
    static LinkedList<String>  carritos = new LinkedList<>();
    static LinkedList<Cliente> caja1 = new LinkedList<>();
    static LinkedList<Cliente> caja2 = new LinkedList<>();
    static LinkedList<Cliente> caja3 = new LinkedList<>();
    static LinkedList<Cliente> colaEspera = new LinkedList<>();
    static LinkedList<Cliente> compras = new LinkedList<>();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        String opcCad, opc2Cad;
        byte opc, opc2;
        String nombreCliente;
        boolean bandera = false;

        for (int i = 0; i < 6; i ++){
            carritos.addLast("carrito " + (i+1));
        }

        do {
            System.out.println("\nSelecciona una opcion\n" +
                    "1. Ingresar cliente al supermercado\n" +
                    "2. Ingresar cliente a la cola de la caja\n" +
                    "3. Ingresar pago de cliente\n" +
                    "4. Salir");
            opcCad = in.next();
            try {
                opc = Byte.parseByte(opcCad);
            }catch (Exception e){
                opc = 5;
            }

            switch (opc){
                case 1:
                    System.out.println("Ingresa el nombre del cliente: ");
                    nombreCliente = in.next();
                    if (!carritos.isEmpty()){
                        compras.addLast(new Cliente(nombreCliente, carritos.peek()));
                        carritos.removeFirst();
                        System.out.println("El cliente " + nombreCliente + " está comprando");
                    } else {
                        colaEspera.addLast(new Cliente(nombreCliente));
                        System.out.println("No hay carritos disponibles!\nEl cliente " + nombreCliente + " está en la cola de espera");
                    }
                    break;
                case 2:
                    if (!compras.isEmpty()){
                        System.out.println("Escribe el nombre del cliente que quieres mandar a una cola de las cajas");
                        nombreCliente = in.next();
                        Cliente cliente = buscar(compras,nombreCliente);
                        if (cliente != null){
                            compras.remove(cliente);
                            if (caja1.isEmpty()){
                                caja1.addLast(cliente);
                                System.out.println("El cliente " + nombreCliente + " se mando a la caja 1");
                            } else if (caja2.isEmpty()){
                                caja2.addLast(cliente);
                                System.out.println("El cliente " + nombreCliente + " se mando a la caja 2");
                            } else if (caja3.isEmpty()){
                                caja3.addLast(cliente);
                                System.out.println("El cliente " + nombreCliente + " se mando a la caja 3");
                            } else {
                                if (caja1.size() < caja2.size()) {
                                    if (caja1.size() < caja3.size()) {
                                        caja1.addLast(cliente);
                                        System.out.println("El cliente " + nombreCliente + " se mando a la caja 1");
                                    } else {
                                        caja3.addLast(cliente);
                                        System.out.println("El cliente " + nombreCliente + " se mando a la caja 3");
                                    }
                                } else if (caja2.size() < caja3.size()) {
                                    caja2.addLast(cliente);
                                    System.out.println("El cliente " + nombreCliente + " se mando a la caja 2");
                                } else {
                                    caja3.addLast(cliente);
                                    System.out.println("El cliente " + nombreCliente + " se mando a la caja 3");
                                }
                            }
                        } else {
                            System.out.println("Error, cliente no encontrado");
                        }
                    } else {
                        System.out.println("Error, no hay clientes en el supermercado");
                    }
                    break;
                case 3:
                    if (!caja1.isEmpty() || !caja2.isEmpty() || !caja3.isEmpty()){
                        System.out.println("Selecciona la caja que quieras que se le haga el cobro al cliente:\n" +
                                "1. Caja 1\n" +
                                "2. Caja 2\n" +
                                "3. Caja 3");
                        opc2Cad = in.next();
                        try {
                            opc2 = Byte.parseByte(opc2Cad);
                        }catch (Exception e){
                            opc2 = 4;
                        }
                        switch (opc2){
                            case 1:
                                sacarCliente(caja1);
                                break;
                            case 2:
                                sacarCliente(caja2);
                                break;
                            case 3:
                                sacarCliente(caja3);
                                break;
                            default:
                                System.out.println("Error, opcion no valida");
                        }
                    } else {
                        System.out.println("Error, no hay ningun cliente en ninguna de las cajas");
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Error, opcion no valida");
            }
        }while(opc != 4);
    }

    public static Cliente buscar(LinkedList<Cliente> lista, String nombreCliente){
        for (Cliente cliente: lista) {
            if (cliente.getNombre().equalsIgnoreCase(nombreCliente)){
                return cliente;
            }
        }
        return null;
    }

    public static void sacarCliente(LinkedList<Cliente> caja){
        assert caja.peekFirst() != null;
        String carrito = caja.peekFirst().getCarrito();
        carritos.addLast(carrito);
        assert caja.peekFirst() != null;
        System.out.println("El cliente " + caja.peekFirst().getNombre() + " ha pagado y salio del supermercado");
        caja.removeFirst();
        if (!colaEspera.isEmpty()){
            compras.addLast(new Cliente(colaEspera.peekFirst().getNombre(), carrito));
            assert colaEspera.peekFirst() != null;
            System.out.println("El " + carrito + " ha sido asignado al cliente " + colaEspera.peekFirst().getNombre() + " y ha ingresado al supermercado");
            colaEspera.removeFirst();
        }
    }
}