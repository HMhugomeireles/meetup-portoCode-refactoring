package com.hugomeireles.portocode.example;

import com.hugomeireles.portocode.example.entity.Customer;
import com.hugomeireles.portocode.example.entity.Movie;
import com.hugomeireles.portocode.example.entity.Rent;

import java.util.List;

public class MovieClub {

    public static final int DEFAULT_DELIVERY_DAYS = 3;
    private List<Movie> movieList;

    public MovieClub(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public Movie updateRentMovie(Movie movieToRent, Customer customer) {
        if (movieToRent != null && customer != null) {
            for (Movie movie : movieList) {
                if (movie.getTitle() != null && movieToRent.getTitle() != null) {
                    if (movie.getTitle().equals(movieToRent.getTitle())) {
                        if (customer.getRating() != null) {
                            if (customer.getRating().equals("lower")) {
                                movie.addRent(new Rent((DEFAULT_DELIVERY_DAYS - 1), customer));
                                return movie;
                            } else if (customer.getRating().equals("mid")) {
                                movie.addRent(new Rent(DEFAULT_DELIVERY_DAYS, customer));
                                return movie;
                            } else if (customer.getRating().equals("high")) {
                                movie.addRent(new Rent((DEFAULT_DELIVERY_DAYS + 1), customer));
                                return movie;
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }

        return null;
    }

    public void showLists() {
        for (Movie movie : movieList) {
            System.out.println(movie.toString());
        }
    }


}
