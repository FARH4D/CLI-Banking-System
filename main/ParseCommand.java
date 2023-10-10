package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import commands.AddCustomer;
import commands.Command;

public class ParseCommand {
    
    public static Command parse(String commandWhole) throws IOException{
        String[] commandParts = commandWhole.split(" ", 3);

        String command = commandParts[0];
        if (command.equals("help")){
            
            
        }
        else if (command.equals("addcustomer")){
            BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
            System.out.println("Customer Name: ");
            String customerName = reader.readLine();
            System.out.println("Phone Number: ");
            String phoneNumber = reader.readLine();
            System.out.println("Customer Email: ");
            String customerEmail = reader.readLine();

            return new AddCustomer(customerName, phoneNumber, customerEmail);
        }

        return null;



        
    }


}
