package com.hugomeireles.portocode.example;

import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private String genre;
    private int duration;
    private int rentPrice;
    private boolean isRented;
    private List<Rent> allRents;

    public Movie(String title, int duration, int rentPrice, String genre) {
        this.title = title;
        this.duration = duration;
        this.rentPrice = rentPrice;
        this.genre = genre;
        this.isRented = false;
        this.allRents = new ArrayList<Rent>();
    }

    public boolean getIsRented() {
        return isRented;
    }

    public void setIsRented(boolean isRented) {
        this.isRented = isRented;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public int getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(int rentPrice) {
        this.rentPrice = rentPrice;
    }

    public List<Rent> getAllRents() {
        return allRents;
    }

    public void addRent(Rent rent) {
        this.allRents.add(rent);
    }

    private String showRents(){
        StringBuilder stringBuilder = new StringBuilder();

        for (Rent rent: allRents) {
            stringBuilder.append(rent.toString());
        }

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "Movie {" +
                "\n" +"title='" + title +
                "\n" +", genre='" + genre +
                "\n" +", duration=" + duration +
                "\n" +", rentPrice=" + rentPrice +
                "\n" +", isRented=" + isRented +
                "\n" +", allRents=" + showRents() +
                "\n" +'}' + "\n";
    }
}
