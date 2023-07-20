import utez.MiServicio;
import utez.MiServicioService;

public class MiCliente {
    public static void main(String[] args) {
        MiServicioService service = new MiServicioService();
        MiServicio port = service.getMiServicioPort();

        String resultado = port.retornarMensaje("Yahir");
        System.out.println(resultado);
    }
}