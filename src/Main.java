import javax.sound.midi.SysexMessage;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> movies=new ArrayList<>();
        movies.add(new Movie("HarryPorter",1999,"Fiction","9"));
        movies.add(new Movie("DrangonBallzSuper",2018,"Action,Fantasy,Fiction","10"));
        movies.add(new Movie("Lucy",2014,"Action,Scientific,Fiction","8"));

        System.out.println("Initial List of Movies:");
        System.out.println("Size of Movie List:" + movies.size());
        for(Movie temp:movies)
        {
            System.out.println(temp);

        }
        System.out.println("The Index of the movie" + movies.indexOf(new Movie("DrangonBallzSuper",2018,"Action,Fantasy,Fiction","10")));
        movies.remove(new Movie("HarryPorter",1999,"Fiction","9"));
        System.out.println("Size of Movie List after removal:" + movies.size());
        for(Movie temp:movies)
        {
            System.out.println(temp);

        }
        movies.set(0,new Movie("The Incredibles",2004,"Animated,Action","8"));
        System.out.println("Size of Movie List after updating:" + movies.size());
        for(Movie temp:movies)
        {
            System.out.println(temp);

        }



    }
}