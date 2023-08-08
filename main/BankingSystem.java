package main;

import java.util.TreeMap;

import exceptions.bankingSystemException;

import java.util.Map;
import java.util.List;
import models.Customer;
import models.Transaction;
import java.util.ArrayList;

public class BankingSystem {
    
    private final Map<Integer, Customer> customers = new TreeMap<>();
    private final Map<Integer, Transaction> transactions = new TreeMap<>();

    public void addCustomer(Customer customer) throws bankingSystemException{
        if (customers.containsKey(customer.getId())){
            throw new bankingSystemException("There is already a customer with a duplicate ID.");
        }

        for (Customer old : customers.values()){
            if (old.getName() == customer.getName() && old.getEmail() == customer.getEmail()){
                throw new bankingSystemException("There is already a customer with the same name and email on the system.");
            }
        }
        customers.put(customer.getId(), customer);

    }

    public List<Customer> listCustomers(){
        List<Customer> list = new ArrayList<>(customers.values());
        return list;
    }


}
