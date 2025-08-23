import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie theMovie = new Movie("Star Wars");
//        theMovie.watchMovie();

//        Movie theMovie = new Adventure("Start Wars ");
//        theMovie.watchMovie(); // notice the decided method to run in runtime

        Movie adventure = Movie.getMovie("A", "Star Wars");
        Movie comedy = Movie.getMovie("C", "Tom and Jerry");
        Movie science = Movie.getMovie("S", "Don't try this at home");

        adventure.watchMovie();
        comedy.watchMovie();
        science.watchMovie();


        Scanner s = new Scanner(System.in);

        while(true) {

            System.out.println("Enter movie type (A, C or S), or type Q to quit: ");
            String type = s.nextLine();

            if("Qq".contains(type))
                break;

            System.out.println("Enter movie title: ");
            String title = s.nextLine();

            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }


    }
}