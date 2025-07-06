import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Movie movie = new Adventure("Star Wars");

        movie.watchMovie();

        if(movie instanceof Adventure) {
            ((Adventure) movie).watchAdventure();
        }

        Movie theMovie = Movie.getMovie("Adventure", "Uncharted"); // more encapsulated way

//        move.watchAdventure(); // error

        Scanner s = new Scanner(System.in);
        List list = new ArrayList<String>();

        System.out.println("this is movie class " + Movie.class.getSimpleName() );

        while(true) {
            System.out.println("Enter Type (A : Adveture , C for Comedy, S for science");
            String type = s.nextLine();

            if("Qq".contains(type)) break;

            System.out.println("Enter Movie Title");
            String title = s.nextLine();

            Movie mov = Movie.getMovie(type, title);
            mov.watchMovie();

        }

    }
}
