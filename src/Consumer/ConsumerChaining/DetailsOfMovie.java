package Consumer.ConsumerChaining;

import java.util.ArrayList;
import java.util.function.Consumer;

public class DetailsOfMovie {
    public static void main(String[] args){
        ArrayList<Movie> movieList = new ArrayList();
        populateMovie(movieList);
        Consumer<Movie>c1 = movie -> System.out.println("Movie : "+movie.name+" is released");
        Consumer<Movie>c2 = movie -> System.out.println("Movie: "+movie.name+" is "+movie.result);
        Consumer<Movie>c3 = movie -> System.out.println("Information of Movie: "+movie.name+" is stored in DB");

        for (Movie mv:movieList) {
            c1.andThen(c2).andThen(c3).accept(mv);
            System.out.println("-------------------------------");
        }
    }

    private static void populateMovie(ArrayList<Movie> movieList) {
        movieList.add(new Movie("Mai Hoo na","Hit"));
        movieList.add(new Movie("Autograph","Hit"));
        movieList.add(new Movie("Don 3","Flop"));
        movieList.add(new Movie("HouseFull 4","Flop"));
        movieList.add(new Movie("Rang De Basanti","Hit"));
    }
}
