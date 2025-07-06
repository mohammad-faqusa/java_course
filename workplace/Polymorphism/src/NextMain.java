public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

//        Adventure jaws = (Adventure) Movie.getMovie("C", "Jaws"); // ClassCaseException
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws"); // compiler error, compiler suppose return Movie
        jaws.watchMovie();

        Object adv = Movie.getMovie("A", "Last of Us");
//        Adventure advMovie = (Movie) adv ;
        Adventure advMvoie = (Adventure) adv;

        advMvoie.watchMovie();
        advMvoie.watchAdventure();

        var scaryAdventure = new Adventure("Scary Adventure");
        scaryAdventure.watchMovie();
        scaryAdventure.watchAdventure();


//        adv.watchMovie() // error


    }

}
