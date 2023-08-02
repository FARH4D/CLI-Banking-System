package data;

import java.io.File;
import java.io.IOException;
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
                    String email = properties[2];
                    float balance = Float.parseFloat(properties[3]);

                    Customer newCustomer = new Customer(id, name, email, balance);
                    
                    
                } catch (NumberFormatException ex) {
                    throw new bankingSystemException("Error when loading customer " + properties[0] + " on line " + pointer + "\nError: " + ex);
                }
            }
        }

    }

    @Override
    public void storeData(BankingSystem bankingSystem) throws IOException {
        
    }

}
