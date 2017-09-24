package com.twu.biblioteca;

import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.repository.Movie;
import com.twu.biblioteca.repository.MovieRepository;
import com.twu.biblioteca.service.MovieService;
import com.twu.biblioteca.service.MovieService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovieServiceTests {
    private Movie[] movies;
    private MovieRepository movieRepository;
    private MovieService movieService;

    @Before
    public void setUp() {
        movies = new Movie[] {
                new Movie(1,"three idots", "director1", 3,"2017"),
                new Movie(2,"a movie", "director2", 0,"2017")
        };
        movieRepository = new MovieRepository(movies);
        movieService = new MovieService(movieRepository);

    }
    @Test
    public void movieToStringTest() {
        Assert.assertEquals("name: three idots; director: director1; rate: 3; year: 2017\n", movies[0].toString());
        Assert.assertEquals("name: a movie; director: director2; rate: unrated; year: 2017\n", movies[1].toString());
    }
    @Test
    public void getAvaliablemoviesTest() {
        movies[0].setAvaliable(false);
        Movie[] allAvaliable = movieRepository.getAll();
        Assert.assertEquals(1, allAvaliable.length);
        Assert.assertEquals("name: a movie; director: director2; rate: unrated; year: 2017\n", movieService.getAllMovie());
    }

    @Test
    public void checkoutMovieFailTest() {
        movies[1].setAvaliable(false);
        int checkoutMovieId = movies[1].getId();
        MovieRepository movieRespository = new MovieRepository(movies);
        boolean checkResult = new MovieService(movieRespository).checkOutMovie(checkoutMovieId);
        Assert.assertFalse(checkResult);
    }

    @Test
    public void checkoutMovieSuccessTest() {
        int checkoutMovieId = movies[1].getId();
        MovieRepository movieRespository = new MovieRepository(movies);
        boolean checkResult = new MovieService(movieRespository).checkOutMovie(checkoutMovieId);
        Assert.assertTrue(checkResult);
        Assert.assertFalse(movies[1].getIsAvaliable());
    }

}
