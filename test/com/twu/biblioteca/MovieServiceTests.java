package com.twu.biblioteca;

import com.twu.biblioteca.repository.Movie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovieServiceTests {
    private Movie[] movies;

    @Before
    public void setUp() {
        movies = new Movie[] {
                new Movie("three idots", "director1", 3,"2017"),
                new Movie("a movie", "director2", 0,"2017")
        };
    }
    @Test
    public void bookToStringTest() {
        Assert.assertEquals("name: three idots; director: director1; rate: 3; year: 2017\n", movies[0].toString());
        Assert.assertEquals("name: a movie; director: director2; rate: unrated; year: 2017\n", movies[1].toString());
    }
}
