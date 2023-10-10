package commands;

import exceptions.bankingSystemException;
import main.BankingSystem;
import models.Customer;

public class AddCustomer implements Command{
    private final String name;
    private final String phoneNumber;
    private final String email;

    
    

    public AddCustomer(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public void execute(BankingSystem bankingSystem) throws bankingSystemException{
        int id = 0;

        if (bankingSystem.listCustomers().size() > 0) {
            int lastIndex = bankingSystem.listCustomers().size() - 1;
            id = bankingSystem.listCustomers().get(lastIndex).getId();
        }

        Customer customer = new Customer(++id, name, phoneNumber, email, 0);
        bankingSystem.addCustomer(customer);
        System.out.println("Customer id " + ++id + " has been added");

    }


}
