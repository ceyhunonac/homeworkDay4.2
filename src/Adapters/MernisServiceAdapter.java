
package Adapters;

import java.rmi.RemoteException;

import Abstract.PersonCheckService;
import Entities.Customer;
import maven.QEMKPSPublicSoap;


public class MernisServiceAdapter implements PersonCheckService {

    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        QEMKPSPublicSoap client = new QEMKPSPublicSoap();
        try {
            return client.TCKimlikNoDogrula(String.valueOf(customer.getNationalityId()),
                    customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
                    customer.getDateOfBirth().getYear());

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("HATA ADAPTER");


            return false;
        }
    }
}