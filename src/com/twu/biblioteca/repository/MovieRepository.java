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

    public boolean updateAvaliableStatus(int movieId, boolean IsAvaliable) {
        for(Movie movie: movieList){
            System.out.println(movie.toString() + movie.getIsAvaliable());
            if(movie.getId() == movieId && movie.getIsAvaliable() == !IsAvaliable) {
                movie.setAvaliable(IsAvaliable);
                return true;
            }
        }
        return false;
    }
}
