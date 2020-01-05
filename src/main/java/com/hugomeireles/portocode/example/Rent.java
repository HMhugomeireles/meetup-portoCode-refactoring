package com.hugomeireles.portocode.example;

public class Rent {

    private int deliveryExpect;
    private Customer customer;

    public Rent(int deliveryExpect, Customer customer) {
        this.deliveryExpect = deliveryExpect;
        this.customer = customer;
    }

    public int getDeliveryExpect() {
        return deliveryExpect;
    }

    @Override
    public String toString() {
        return "\n \t {" +
                ", deliveryExpect=" + deliveryExpect +
                ", customer={ name=" + customer.getFirstName() + ", rating=" + customer.getRating() +"}" +
                "},";
    }
}
