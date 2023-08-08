package commands;

import main.BankingSystem;

public class AddCustomer implements Command{
    private final Integer id;
    private final String name;
    private final String email;

    
    

    public AddCustomer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public void execute(BankingSystem bankingSystem){
        int id = 0;

    }


}
