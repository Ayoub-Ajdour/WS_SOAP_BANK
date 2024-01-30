
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.1
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BankService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankService {


    /**
     * 
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createNewCompte", targetNamespace = "http://ws/", className = "proxy.CreateNewCompte")
    @ResponseWrapper(localName = "createNewCompteResponse", targetNamespace = "http://ws/", className = "proxy.CreateNewCompteResponse")
    @Action(input = "http://ws/BankService/createNewCompteRequest", output = "http://ws/BankService/createNewCompteResponse")
    public Compte createNewCompte();

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "clientComptes", targetNamespace = "http://ws/", className = "proxy.ClientComptes")
    @ResponseWrapper(localName = "clientComptesResponse", targetNamespace = "http://ws/", className = "proxy.ClientComptesResponse")
    @Action(input = "http://ws/BankService/clientComptesRequest", output = "http://ws/BankService/clientComptesResponse")
    public List<Compte> clientComptes();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionToDH", targetNamespace = "http://ws/", className = "proxy.ConversionToDH")
    @ResponseWrapper(localName = "conversionToDHResponse", targetNamespace = "http://ws/", className = "proxy.ConversionToDHResponse")
    @Action(input = "http://ws/BankService/conversionToDHRequest", output = "http://ws/BankService/conversionToDHResponse")
    public double conversionToDH(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

}