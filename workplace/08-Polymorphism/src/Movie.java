public class Movie {

    private String title ;

    public Movie(String title){
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName(); // to show the used subclass if instantiated
        System.out.println(title + " is a " + instanceType + " film");
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
}


