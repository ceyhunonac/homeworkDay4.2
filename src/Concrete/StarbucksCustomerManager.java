package Concrete;

import Abstract.CustomerService;
import Abstract.PersonCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
    private PersonCheckService personCheckService;

    public StarbucksCustomerManager(PersonCheckService personCheckService) {
        this.personCheckService = personCheckService;
    }

    @Override
    public void Save(Customer customer) {
        if (personCheckService.CheckIfRealPerson(customer)) {
            BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(personCheckService);
            baseCustomerManager.Save(customer);
        } else {
            System.out.println("Not a valid person");
        }
    }

}
