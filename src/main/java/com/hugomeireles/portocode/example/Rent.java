package com.hugomeireles.portocode.example;

public class Rent {

    private int day;
    private int deliveryExpect;
    private int deliveryDone;
    private Customer customer;

    public Rent(int day, int deliveryExpect, Customer customer) {
        this.day = day;
        this.deliveryExpect = deliveryExpect;
        this.customer = customer;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDeliveryExpect() {
        return deliveryExpect;
    }

    public void setDeliveryExpect(int deliveryExpect) {
        this.deliveryExpect = deliveryExpect;
    }

    public int getDeliveryDone() {
        return deliveryDone;
    }

    public void setDeliveryDone(int deliveryDone) {
        this.deliveryDone = deliveryDone;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "\n \t {" +
                "day=" + day +
                ", deliveryExpect=" + deliveryExpect +
                ", deliveryDone=" + deliveryDone +
                ", customer={ name=" + customer.getFirstName() + ", rating=" + customer.getRating() +"}" +
                "},";
    }
}
