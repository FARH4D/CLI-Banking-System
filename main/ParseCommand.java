package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import commands.AddCustomer;
import commands.Command;
import commands.FindCustomer;
import commands.FindTransaction;
import commands.Help;
import commands.ListCustomers;
import commands.ListTransactions;

public class ParseCommand {
    
    public static Command parse(String commandWhole) throws IOException{
        String[] commandParts = commandWhole.split(" ", 3);

        String command = commandParts[0];
        if (command.equals("addcustomer")){
            BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
            System.out.println("Customer Name: ");
            String customerName = reader.readLine();
            System.out.println("Phone Number: ");
            String phoneNumber = reader.readLine();
            System.out.println("Customer Email: ");
            String customerEmail = reader.readLine();

            return new AddCustomer(customerName, phoneNumber, customerEmail);
        } else if (commandParts.length == 1){
            if (command.equals("help")){
            return new Help();
            } else if (command.equals("listcustomers")){
                return new ListCustomers();
            } else if (command.equals("listtrans")){
                return new ListTransactions();
            }
        } else if (commandParts.length == 2){
            int id = Integer.parseInt(commandParts[1]);
            if (command.equals("findcustomer")){
                return new FindCustomer(id);
            } else if (command.equals("findtrans")){
                return new FindTransaction(id);
            }
        }
        return null;
    }
}
