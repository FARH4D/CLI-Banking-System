package models;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String email;

    private final List<Transaction> transactions = new ArrayList<>();
    
}
