package commands;

import exceptions.bankingSystemException;
import main.BankingSystem;

public interface Command {
    
    public static final String commands = "Commands: \n"
    + "\tlogin                             Log in to a customer account\n"
    + "\tlistcustomers                     List all customers\n"
    + "\tfindcustomer [customer id]        Find a specific customer"
    + "\taddcustomer                       Add a new customer\n"
    + "\teditcustomer [customer id]        Edit a customer's details\n"
    + "\tdeletecustomer [customer id]      Delete a customer\n"
    + "\tlisttrans                         List all transactions\n"
    + "\tfindtrans [transaction id]        Find a specific customer"
    + "\tdeletetrans [transaction id]      Delete a transaction\n"
    + "\thelp                              Displays this help message\n"
    + "\texit                              Exits the program (who could have guessed)\n";
    
    public void execute(BankingSystem bankingSystem) throws bankingSystemException;

}
