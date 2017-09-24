package com.twu.biblioteca.service;

import com.twu.biblioteca.repository.Movie;
import com.twu.biblioteca.repository.MovieRepository;

public class MovieService {
    public MovieRepository movieRespository;
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
}
