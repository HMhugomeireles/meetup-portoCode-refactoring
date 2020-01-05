package com.hugomeireles.portocode.example;

public class Customer {

    private String firstName;
    private String lastName;
    private String rating;

    public Customer(String firstName, String lastName, String rating) {
        //if (rating == null) throw new IllegalArgumentException();
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getRating() {
        return rating;
    }

}
