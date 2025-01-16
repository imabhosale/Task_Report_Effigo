package ArralistWorkbook;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Movie> movies;

    public Store() {
        // TODO
        this.movies=new ArrayList<>();
    }

    public Movie getMovie(int index) {
        // TODO
       Movie copy=new Movie(movies.get(index));
        return copy;
    }

    public void setMovie(int index, Movie movie) {
       this.movies.set(index,new Movie(movie));
    }

    public void addMovie(Movie movie) {
        // TODO
        Movie copy=new Movie(movie);
        this.movies.add(copy);
    }

    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }

}
