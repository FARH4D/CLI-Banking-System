package models;

import java.time.LocalDate;

public class Transaction {
    private int id;
    private Customer customer1;
    private Customer customer2;
    private LocalDate transactionDate;

    public Transaction(Integer id, Customer customer1, Customer customer2, LocalDate transactionDate){
        this.id = id;
        this.customer1 = customer1;
        this.customer2 = customer2;
        this.transactionDate = transactionDate;
    }


    public int getId() {
        return this.id;
    }

    public Customer getCustomer1() {
        return this.customer1;
    }

    public Customer getCustomer2() {
        return this.customer2;
    }

    public LocalDate getTransactionDate() {
        return this.transactionDate;
    }

}
