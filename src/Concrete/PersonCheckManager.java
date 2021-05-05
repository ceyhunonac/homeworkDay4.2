package Concrete;

import Abstract.PersonCheckService;
import Entities.Customer;
import maven.QEMKPSPublicSoap;

public class PersonCheckManager implements PersonCheckService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {

        return true;
    }
}
