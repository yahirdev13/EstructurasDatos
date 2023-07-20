import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService(name = "MiServicio", targetNamespace = "utez")
@SOAPBinding(style = SOAPBinding.Style.RPC)

public class MiServicio {

    @WebMethod(operationName = "retornarMensaje")
    public String retornarMensaje(@WebParam(name = "mensaje") String mensaje){
        String cadena = "Hola desde SoapServer Java, "+mensaje;
        return cadena;
    }

    public static void main(String[] args) {
        System.out.println("Iniciando Servidor...");
        Endpoint.publish("http://localhost:7878/MiServicio", new MiServicio());
        System.out.println("Esperando Petición...");
    }
}
