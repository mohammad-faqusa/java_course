package dev.lpa;

public class Main {

    public static void main(String[] args) {

        String helloWorld = "%s %s".formatted("Hello", "World");

        String helloWorld3 = Main.format("%s %s", "Hello", "World");
        System.out.println(helloWorld3);

        String testString = "Anyone can learn abc's, 123's, and any regular expression";
        String replacement = "(-)";
        String [] patterns = {
                "[abc]",
                "[123]",
                "[A]"
        };

        for(String pattern : patterns) {
            String output = testString.replaceFirst(pattern, replacement);
            System.out.println("Pattern : " + pattern + " => " + output);
        }
    }

    private static String format(String regexp, String... args) {

        int index = 0;
        while(regexp.contains(".*%s.*")){
            regexp = regexp.replaceFirst("%s" , args[index++]);
        }
        return regexp;
    }
}
