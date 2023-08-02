package data;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;

import exceptions.bankingSystemException;
import main.BankingSystem;

public class BankingDataManager {
    
    private static final List<DataManagerMain> dataControllers = new ArrayList<>();

    static {
        dataControllers.add(new CustomerController());
    }

    public static BankingSystem loadData() throws IOException, bankingSystemException{
        BankingSystem bankingSystem = new BankingSystem();

        for (DataManagerMain data : dataControllers){
            data.loadData(bankingSystem);
        }
        return bankingSystem;

    }

}
