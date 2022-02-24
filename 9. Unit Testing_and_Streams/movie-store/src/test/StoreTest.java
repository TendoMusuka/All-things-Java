package src.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.TestInstance;

import src.main.models.Movie;
import src.main.models.Store;

public class StoreTest {

    Store store;

    @Before  //this before set up will run before each test 
    public void setup(){
        store =new Store(); //initialize each variable that each test will depend on
        store.addMovie (new Movie ("The Jist", "DVD", 8.6) );
        store.addMovie (new Movie ("The Godfather", "DVD", 8.6) );
    }

    @Test
    public void movieAdded() {

        assertTrue(store.contains(new Movie ("The Jist", "DVD", 8.6)));
    }

    @Test
    public void sellMovieTest(){
        store.sellMovie("The Godfather");
        assertFalse(store.contains(new Movie ("The Godfather", "DVD", 8.6)));
    }

    @Test
    public void rentMovieTest(){
        store.rentMovie("The Godfather");
        assertFalse(store.getMovie(1).isAvailable());
    }

    @Test (expected = IllegalStateException.class)
    public void movieNotInStock(){
        store.rentMovie("The Godfather");
        store.sellMovie("The God Father");
    }



}
