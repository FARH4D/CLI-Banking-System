package commands;

import main.BankingSystem;

public class Help implements Command{

    @Override
    public void execute(BankingSystem bankingSystems){
        System.out.println(Command.commands);
    }
    
}
