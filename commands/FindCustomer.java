package commands;

import exceptions.bankingSystemException;
import main.BankingSystem;

public class FindCustomer implements Command{
    
    private int customerId;

    public FindCustomer(Integer id){
        this.customerId = id;
    }

    @Override
    public void execute(BankingSystem bankingSystem) throws bankingSystemException{
        System.out.println(bankingSystem.findCustomer(customerId).getName());
    }

}
