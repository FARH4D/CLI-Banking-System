package commands;

import main.BankingSystem;
import java.util.List;
import models.Transaction;

public class ListTransactions implements Command{

    @Override
    public void execute (BankingSystem bankingSystem){
        List<Transaction> transactions = bankingSystem.listTransactions();

        for (Transaction transaction : transactions){
            System.out.println(transaction.getCustomer1() + " " + transaction.getCustomer2());
            System.out.println();
        }
    }
}
