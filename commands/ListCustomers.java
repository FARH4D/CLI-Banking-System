package commands;

import main.BankingSystem;
import java.util.List;
import models.Customer;

public class ListCustomers implements Command{

    @Override
    public void execute (BankingSystem bankingSystem){
        List<Customer> customers = bankingSystem.listCustomers();

        for (Customer customer : customers){
            System.out.println(customer.getName());
            System.out.println();
        }

    }

}
