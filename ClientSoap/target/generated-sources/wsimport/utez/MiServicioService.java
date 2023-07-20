
package utez;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MiServicioService", targetNamespace = "utez", wsdlLocation = "http://localhost:7878/MiServicio?wsdl")
public class MiServicioService
    extends Service
{

    private final static URL MISERVICIOSERVICE_WSDL_LOCATION;
    private final static WebServiceException MISERVICIOSERVICE_EXCEPTION;
    private final static QName MISERVICIOSERVICE_QNAME = new QName("utez", "MiServicioService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7878/MiServicio?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MISERVICIOSERVICE_WSDL_LOCATION = url;
        MISERVICIOSERVICE_EXCEPTION = e;
    }

    public MiServicioService() {
        super(__getWsdlLocation(), MISERVICIOSERVICE_QNAME);
    }

    public MiServicioService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MISERVICIOSERVICE_QNAME, features);
    }

    public MiServicioService(URL wsdlLocation) {
        super(wsdlLocation, MISERVICIOSERVICE_QNAME);
    }

    public MiServicioService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MISERVICIOSERVICE_QNAME, features);
    }

    public MiServicioService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MiServicioService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MiServicio
     */
    @WebEndpoint(name = "MiServicioPort")
    public MiServicio getMiServicioPort() {
        return super.getPort(new QName("utez", "MiServicioPort"), MiServicio.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MiServicio
     */
    @WebEndpoint(name = "MiServicioPort")
    public MiServicio getMiServicioPort(WebServiceFeature... features) {
        return super.getPort(new QName("utez", "MiServicioPort"), MiServicio.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MISERVICIOSERVICE_EXCEPTION!= null) {
            throw MISERVICIOSERVICE_EXCEPTION;
        }
        return MISERVICIOSERVICE_WSDL_LOCATION;
    }

}
