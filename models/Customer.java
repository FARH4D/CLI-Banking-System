package models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private float balance;
    private String name;
    private String email;

    private final List<Transaction> transactions = new ArrayList<>();

    public Customer(int id, float balance, String name, String email){
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.email = email;
    }

    public void addTransaction(Transaction transaction){
        
    }

    public List<Transaction> getTransactions(){
        return transactions;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
