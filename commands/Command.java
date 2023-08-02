package commands;

import exceptions.bankingSystemException;
import main.BankingSystem;

public interface Command {
    
    public static final String commands = "Commands: \n"
    + "\tLog in                            Log in to a customer account\n"
    + "\tList Customers                    List all customers\n"
    + "\tAdd Customer                      Add a new customer\n"
    + "\tEdit Customer                     Edit a customer's details\n"
    + "\tDelete Customer                   Delete a customer\n"
    + "\tList Transactions                 List all transactions\n"
    + "\tDelete Transaction                Delete a transaction\n"
    + "\tHelp                              Displays this help message\n"
    + "\tExit                              Exits the program (who could have guessed)\n";
    
    public void execute(BankingSystem bankingSystem) throws bankingSystemException;

}
