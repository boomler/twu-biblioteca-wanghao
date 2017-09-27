package com.twu.biblioteca.repository;

import com.twu.biblioteca.service.MovieService;

import java.util.stream.Stream;

public class MovieRepository {
    private Movie[] movieList;

    public MovieRepository(Movie[] movieList) {
        this.movieList = movieList;
    }

    public MovieRepository() {

        movieList = new Movie[] {
                new Movie(1, "three idots", "director1", 3,"2017"),
                new Movie(2, "a movie", "director2", 0,"2017")
        };
   }

    public Movie[] getAll() {
        return Stream.of(movieList).filter(movie -> movie.isAvaliable).toArray(Movie[]::new);
    }

    public boolean updateAvaliableStatus(int movieId, boolean IsAvaliable) {
        for(Movie movie: movieList) {
            if(movie.getId() == movieId && movie.getIsAvaliable() == !IsAvaliable) {
                movie.setAvaliable(IsAvaliable);
                return true;
            }
        }
        return false;
    }
}
