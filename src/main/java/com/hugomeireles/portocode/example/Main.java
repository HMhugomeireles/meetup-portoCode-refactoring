package com.hugomeireles.portocode.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Customer johnDoe = new Customer("John", "Doe", "lower");
        Customer janeDoe = new Customer("Jane", "Doe", "mid");
        Customer tiffanyCook = new Customer("Tiffany", "Cook", "high");

        Movie starWars = new Movie("Star Wars", 150, 5, "fantasy");
        Movie johnWick = new Movie("John Wick", 180, 8, "action");
        Movie joker = new Movie("Joker", 120, 10, "Drama");

        List<Movie> movies = new ArrayList<>();
        movies.add(starWars);
        movies.add(johnWick);
        movies.add(joker);

        MovieClub movieClub = new MovieClub(movies);

        movieClub.updateRentMovie(starWars, janeDoe);
        movieClub.updateRentMovie(starWars, johnDoe);
        movieClub.updateRentMovie(johnWick, johnDoe);
        movieClub.updateRentMovie(joker, tiffanyCook);
        movieClub.updateRentMovie(joker, johnDoe);

        movieClub.showLists();
    }

}
