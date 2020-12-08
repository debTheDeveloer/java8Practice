package Consumer.MovieDetailsUsingConsumer;

public class Movie {
    String name;
    String hero;
    String heroine;

    public Movie(String name, String hero, String heroine) {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }

    @Override
    public String toString() {
        String s = String.format("(%s,%s,%s)",name,hero,heroine);
        return s;
    }
}
