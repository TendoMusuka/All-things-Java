package src.main.models;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Store {
    ArrayList<Movie> movies;

    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    public Movie getMovie(int index) {
        return new Movie(this.movies.get(index));
    }

    public void setMovie(int index, Movie movie) {
        this.movies.set(index, new Movie(movie));
    }

    public void addMovie(Movie movie){
        this.movies.add(new Movie(movie));
    }

    public boolean contains (Movie movie){
        return this.movies.contains(movie);
    }

    // public void sellMovie(String name){
    //     this.movies.removeIf((movie) ->{
    //         return movie.getName().equals(name);
    //     });
    // }

    public void sellMovie(String name){
        this.movies.removeIf((movie) -> movie.getName().equals(name));
        //Predicate<Employee> condition = employee -> employee.getName().startsWith("P");
    }

    public int getMovieIndex (String name){
        return IntStream.range(0, this.movies.size())   //goes through a pipeline until it finds an integer that representa n index

               .filter((i) ->{
                return this.movies.get(i).getName().equals(name); //checks if the movie at the indicated index is the same as the parameter 
                })
                .findFirst() // findFirst() method finds the first element in a Stream. So, we use this method when we specifically want the first element from a sequence.
                .orElse(-1000);
                }

    public void rentMovie(String name){
        this.movies.get(getMovieIndex(name)).setAvailable(false); //get() is an inbuilt method in Java and is used to return the element at a given index from the specified Array.

    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.movies.size(); i++) {
            temp += this.movies.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }

}
