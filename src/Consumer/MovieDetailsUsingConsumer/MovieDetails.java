package Consumer.MovieDetailsUsingConsumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MovieDetails {
    public static void main(String[] args){
        ArrayList<Movie> movieList = new ArrayList();
        populateMovie(movieList);
        Consumer<Movie> c = movie->{
            System.out.println("Name of the movie: "+movie.name);
            System.out.println("Name of the Hero: "+movie.hero);
            System.out.println("Name of the heroine: "+movie.heroine);
        };
        System.out.println("All the movie details are shown below");
        for (Movie m:movieList) {
            c.accept(m);
            System.out.println("-----------------------------------------");
        }
    }

    private static void populateMovie(ArrayList<Movie> movieList) {
        movieList.add(new Movie("Mai hoo na","Sharukh","Sushmita Sen"));
        movieList.add(new Movie("Parimeeta","Saif Ali","Visya balan"));
        movieList.add(new Movie("Kahani","Prambrata","idya balan"));
    }
}
