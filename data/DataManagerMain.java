package data;

import java.io.IOException;

import main.BankingSystem;

public interface DataManagerMain {
    
    public static final String Seperator = ":::";

    public void loadData(BankingSystem bankingSystem) throws IOException;
    public void storeData(BankingSystem bankingSystem) throws IOException;

}
