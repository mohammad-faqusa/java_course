public class NextMain {
    public static void main(String[] args) {


        Movie comedy = Movie.getMovie("comedy", "because I am happy");
        comedy.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");

        Movie comedyMovie = Movie.getMovie("C", "Airplane");
        comedy.watchMovie();
//        comedy.watchComedy(); // watch movie is not resolve


        Object comedyObject = Movie.getMovie("C", "Airplane");
        Movie comedyTypeMovie = (Movie) comedyObject;
        comedyTypeMovie.watchMovie();
        Comedy updateComedy = (Comedy) comedyTypeMovie;
        updateComedy.watchComedy(); // compile error , this method is not declared in Movie


        var airplance = Movie.getMovie("C", "Airplane");

        var plane = new Comedy("Airplance");
        plane.watchComedy();
    }
}