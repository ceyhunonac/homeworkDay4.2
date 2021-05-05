import java.time.LocalDate;

import Concrete.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

    public static void main(String[] args) {

        BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

        Customer customer = new Customer("Ceyhun","ONAÇ",LocalDate.of(2003,4,22),"************");
        customerManager.Save(customer);
    }

}