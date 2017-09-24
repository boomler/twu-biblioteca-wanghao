package com.twu.biblioteca.repository;

import java.util.stream.Stream;

public class MovieRepository {
    private Movie[] movieList;

    public MovieRepository(Movie[] movieList) {
        this.movieList = movieList;
    }
    public Movie[] getAll() {
        return (Movie[]) Stream.of(movieList).filter(movie -> movie.isAvaliable).toArray(Movie[]::new);
    }
}
