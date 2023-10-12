package commands;

import exceptions.bankingSystemException;
import main.BankingSystem;

public class FindTransaction implements Command{
    
    private int transactionId;

    public FindTransaction(Integer id){
        this.transactionId = id;
    }

    @Override
    public void execute(BankingSystem bankingSystem) throws bankingSystemException{
        System.out.println(bankingSystem.findTransaction(transactionId).getCustomer1() + " and " + bankingSystem.findTransaction(transactionId).getCustomer2());
    }

}
