package com.hugomeireles.portocode.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class MovieClubTest {

    private List<Customer> customers;
    private List<Movie> movies;
    private MovieClub movieClub;

    @Before
    public void setup() {
        Customer johnDoe = new Customer("John", "Doe", "lower");
        Customer janeDoe = new Customer("Jane", "Doe", "mid");
        Customer tiffanyCook = new Customer("Tiffany", "Cook", "high");

        List<Customer> customers = new ArrayList<Customer>();
        customers.add(johnDoe);
        customers.add(janeDoe);
        customers.add(tiffanyCook);

        Movie starWars = new Movie("Star Wars", 150, 5, "fantasy");
        Movie johnWick = new Movie("John Wick", 180, 8, "action");
        Movie joker = new Movie("Joker", 120, 10, "Drama");

        List<Movie> movies = new ArrayList<Movie>();
        movies.add(starWars);
        movies.add(johnWick);
        movies.add(joker);

        this.movieClub = new MovieClub(customers, movies);
    }

    @Test(expected = IllegalArgumentException.class)
    public void movieIsNullThrowIllegalArgumentException() {
        movieClub.updateRentMovie(null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void customerIsNullThrowIllegalArgumentException() {
        movieClub.updateRentMovie(null, null);
    }

    @Test
    public void customerRatingIsLowerRemoveOneDayOfDefaultDeliveryDays(){
        int defaultDeliveryDays = 3;
        int removeDays = 1;

        Customer johnDoe = new Customer("John", "Doe", "lower");
        Movie starWars = new Movie("Star Wars", 150, 5, "fantasy");

        Movie movieReturn = movieClub.updateRentMovie(starWars, johnDoe);

        int deliveryExpectReturned = movieReturn.getAllRents().get(0).getDeliveryExpect();
        int dayRemoved = defaultDeliveryDays - removeDays;

        Assert.assertEquals(deliveryExpectReturned, dayRemoved);
    }

    @Test
    public void customerRatingIsMidApplyDefaultDeliveryDays(){
        int defaultDeliveryDays = 3;

        Customer johnDoe = new Customer("John", "Doe", "mid");
        Movie starWars = new Movie("Star Wars", 150, 5, "fantasy");

        Movie movieReturn = movieClub.updateRentMovie(starWars, johnDoe);

        int deliveryExpectReturned = movieReturn.getAllRents().get(0).getDeliveryExpect();


        Assert.assertEquals(deliveryExpectReturned, defaultDeliveryDays);
    }

    @Test
    public void customerRatingIsHighApplyDefaultDeliveryDaysPlusOne(){
        int defaultDeliveryDays = 3;
        int addDays = 1;

        Customer johnDoe = new Customer("John", "Doe", "high");
        Movie starWars = new Movie("Star Wars", 150, 5, "fantasy");

        Movie movieReturn = movieClub.updateRentMovie(starWars, johnDoe);

        int deliveryExpectReturned = movieReturn.getAllRents().get(0).getDeliveryExpect();
        int dayRemoved = defaultDeliveryDays + addDays;

        Assert.assertEquals(deliveryExpectReturned, dayRemoved);
    }


}
