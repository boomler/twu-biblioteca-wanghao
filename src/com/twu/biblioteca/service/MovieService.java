package com.twu.biblioteca.service;

import com.twu.biblioteca.repository.Movie;
import com.twu.biblioteca.repository.MovieRepository;

public class MovieService {
    public MovieRepository movieRespository;

    public MovieService() {
        movieRespository = new MovieRepository();
    }

    public MovieService(MovieRepository movieRepository) {
        this.movieRespository = movieRepository;
    }

    public String getAllMovie() {
        String movieListStr = "";
        Movie[] all = movieRespository.getAll();

        for(Movie movie: all){
            movieListStr += movie.toString();
        }
        return movieListStr;
    }


    public boolean checkOutMovie(int movieId) {
        boolean updateResult = movieRespository.updateAvaliableStatus(movieId, false);
        if(!updateResult) {
            System.out.println("That movie is not avaliable");
            return false;
        } else {
            System.out.println("Thank you! Enjoy the movie");
            return true;
        }
    }
}
