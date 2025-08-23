public class Movie {

    private String title ;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName(); // to show the used subclass if instantiated
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title){

        return switch(type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> null;
        };
    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    // use Intellij override generation
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3), "Please Scene", "Scary Music", "Something Bad Happens");

    }

    public void watchAdventure() {
        System.out.println("Watching an Adventure");
    }
}

class Comedy extends Movie {

    public Comedy(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3), "Very funny", "Interesting", "Positive");

    }

    public void watchComedy() {
        System.out.println("Watching a comedy ");
    }
}

class ScienceFiction extends Movie {

    public ScienceFiction(String title){
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("... %s%n".repeat(3),
                "Bad Aliens do Bad Stuff",
                "Space Guys chase Aliens",
                "Planet Blows Up");

    }

    public void watchScienceFiction() {
        System.out.println("Watching a ScienceFiction");
    }
}


