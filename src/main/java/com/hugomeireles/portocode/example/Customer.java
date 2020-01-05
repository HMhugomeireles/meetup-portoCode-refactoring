package com.hugomeireles.portocode.example;

public class Customer {

    private String firstName;
    private String lastName;
    private String rating;

    public Customer(String firstName, String lastName, String rating) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rating = rating;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
