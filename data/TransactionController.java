package data;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import exceptions.bankingSystemException;
import main.BankingSystem;
import models.Customer;

public class TransactionController implements DataManagerMain{
    
    private final String source = "./infoStore/transactions.txt";

    @Override
    public void loadData(BankingSystem bankingSystem) throws IOException, bankingSystemException {

        // try (Scanner scanner = new Scanner(new File(source))) {
        //     int pointer = 1;
            
        //     while(scanner.hasNextLine()) {
        //         String nextLine = scanner.nextLine();
        //         String[] properties = nextLine.split(Seperator, -1);
        //         try {
        //             int id = Integer.parseInt(properties[0]);
        //             Customer customer1 = null;
        //             String phoneNumber = properties[2];
        //             String email = properties[3];
        //             float balance = Float.parseFloat(properties[4]);

        //             Customer newCustomer = new Customer(id, name, phoneNumber, email, balance);
        //             bankingSystem.addCustomer(newCustomer);
                    
        //         } catch (NumberFormatException ex) {
        //             throw new bankingSystemException("Error when loading customer " + properties[0] + " on line " + pointer + "\nError: " + ex);
        //         }
        //         pointer++;
        //     }
        // }
    }

    @Override
    public void storeData(BankingSystem bankingSystem) throws IOException {

    }
}
