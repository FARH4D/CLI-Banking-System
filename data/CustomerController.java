package data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import exceptions.bankingSystemException;
import main.BankingSystem;
import models.Customer;

public class CustomerController implements DataManagerMain{

    private final String source = "./infoStore/customer.txt";

    @Override
    public void loadData(BankingSystem bankingSystem) throws IOException, bankingSystemException {

        try (Scanner scanner = new Scanner(new File(source))) {
            int pointer = 1;
            
            while(scanner.hasNextLine()) {
                String nextLine = scanner.nextLine();
                String[] properties = nextLine.split(Seperator, -1);
                try {
                    int id = Integer.parseInt(properties[0]);
                    String name = properties[1];
                    String phoneNumber = properties[2];
                    String email = properties[3];
                    float balance = Float.parseFloat(properties[4]);

                    Customer newCustomer = new Customer(id, name, phoneNumber, email, balance);
                    bankingSystem.addCustomer(newCustomer);
                    
                } catch (NumberFormatException ex) {
                    throw new bankingSystemException("Error when loading customer " + properties[0] + " on line " + pointer + "\nError: " + ex);
                }
                pointer++;
            }
        }

    }

    @Override
    public void storeData(BankingSystem bankingSystem) throws IOException {
        try (PrintWriter out = new PrintWriter(new FileWriter(source))) {
            for (Customer customer : bankingSystem.listCustomers()) {
                out.print(customer.getId() + Seperator);
                out.print(customer.getName() + Seperator);
                out.print(customer.getNumber() + Seperator);
                out.print(customer.getEmail() + Seperator);
                out.print(customer.getBalance() + Seperator);
                if (customer.getTransactions().size() > 0) {
                	for (int i = 0; i < customer.getTransactions().size(); i++) {
                    	out.print(customer.getTransactions().get(i).getId() + Seperator);
                    	out.print(customer.getTransactions().get(i).getCustomer1().getId() + Seperator);
                    	out.print(customer.getTransactions().get(i).getCustomer2() + Seperator);
                        out.print(customer.getTransactions().get(i).getTransactionDate() + Seperator);
                    }
                }
                out.println();
            }
        }
    }
}