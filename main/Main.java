package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import commands.Command;
import data.BankingDataManager;
import exceptions.bankingSystemException;

public class Main{

    public static void main(String[] args) throws IOException, bankingSystemException {
        
        BankingSystem bankingSystem = BankingDataManager.loadData();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  // Creates new reader to read user input
    
        System.out.println("Banking System");
        System.out.println("Enter a command, type in help to see list of commands");

        while(true){
            String userCommand = br.readLine();
            if (userCommand.equals("exit")){    
                break;
            }   

            try{
                Command command = ParseCommand.parse(userCommand);     // If the user's command is not exit, the program will try to parse and read the command.
                command.execute(bankingSystem);
            } catch (IOException ex){
                System.out.println("Error: " + ex.getMessage());
            }
        }
        BankingDataManager.storeData(bankingSystem);
        System.exit(0);
    }
}