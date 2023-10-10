package models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String phoneNumber;
    private String email;
    private float balance;

    private final List<Transaction> transactions = new ArrayList<>();

    public Customer(int id, String name, String phoneNumber, String email, float balance){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.balance = balance;
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

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return this.phoneNumber;
    }

    public void setNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

}
