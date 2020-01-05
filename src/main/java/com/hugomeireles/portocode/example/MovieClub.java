package com.hugomeireles.portocode.example;

import java.util.List;
import java.util.Optional;

public class MovieClub {

    private List<Customer> customerList;
    private List<Movie> movieList;

    public MovieClub(List<Customer> customerList, List<Movie> movieList) {
        this.customerList = customerList;
        this.movieList = movieList;
    }

    public Movie updateRentMovie(Movie movieToRent, Customer customer) {
        if (movieToRent != null || customer != null) {
            for (Movie movie : movieList) {
                if (movie.getTitle() != null && movieToRent.getTitle() != null) {
                    if (movie.getTitle().equals(movieToRent.getTitle())) {
                        if (customer.getRating() != null) {
                            if (customer.getRating().equals("lower")) {
                                movie.addRent(new Rent(1, (3 - 1), customer));
                                return movie;
                            } else if (customer.getRating().equals("mid")) {
                                movie.addRent(new Rent(1, (3), customer));
                                return movie;
                            } else if (customer.getRating().equals("high")) {
                                movie.addRent(new Rent(1, (3 + 1), customer));
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

    public List<Movie> getMovieList() {
        return movieList;
    }

    public Movie getMovie(final Movie movie) {
        Movie movieTemp = null;

        for(Movie movieItem: movieList) {
            if (movieItem.getTitle().equals(movie.getTitle())) {
                movieTemp = movieItem;
                break;
            }
        }

        return movieTemp;
    }

    public void showLists() {
        for (Movie movie : movieList) {
            System.out.println(movie.toString());
        }
    }

}
