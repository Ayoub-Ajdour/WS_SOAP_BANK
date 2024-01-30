package clientSoap;

import proxy.BankService;
import proxy.BankServices;
import proxy.Compte;

public class clientWS {
    public static void main(String[] args) {
        BankService stub=new BankServices().getBankServicePort();
        System.out.println(stub.conversionToDH(189));
        Compte compte=stub.createNewCompte();
        System.out.println("New Compte: "+compte.getCode()+" "+compte.getSolde());
    }
}
