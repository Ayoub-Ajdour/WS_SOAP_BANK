import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class BankServerWeb {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1010/",new BankService());
    }


}
