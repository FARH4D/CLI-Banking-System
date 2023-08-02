package data;

import java.io.IOException;

import exceptions.bankingSystemException;
import main.BankingSystem;

public interface DataManagerMain {
    
    public static final String Seperator = ":::";

    public void loadData(BankingSystem bankingSystem) throws IOException, bankingSystemException;
    public void storeData(BankingSystem bankingSystem) throws IOException;

}
