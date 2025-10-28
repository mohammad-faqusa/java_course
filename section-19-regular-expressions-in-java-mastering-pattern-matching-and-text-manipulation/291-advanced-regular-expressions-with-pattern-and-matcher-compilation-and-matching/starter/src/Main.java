import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String football = "I like B.W.F football.";

        boolean matches = Pattern.matches("[A-Z].*?[.]", football);
        System.out.println(matches);

        Pattern firstMatch = Pattern.compile("[A-Z].*?[.]");
        var matcher = firstMatch.matcher(football);

        System.out.println(matcher.matches());

        System.out.println(matcher.end());
        System.out.println(football.substring(0, matcher.end()));
        System.out.println(matcher.group());

        String htmlSnippest = """
                <H1>Hello How are you</H1>
                <h3>How are you doing</h3>
                <p>I am find</p>
                <h4>hopefully you are fine</h4>
                
                """;

        Pattern hPattern = Pattern.compile("<([hH]\\d)>(.*)</(?<level>[Hh]\\d)>");

        var hmatcher = hPattern.matcher(htmlSnippest);

        while(hmatcher.find()) {
            System.out.println("found : " + hmatcher.group(0));
            System.out.println("found : " + hmatcher.group(1));
            System.out.println("found : " + hmatcher.group(2));
            System.out.println("found : " + hmatcher.group("level"));
        }

        hmatcher.reset();
        hmatcher.results().forEach(m -> System.out.println("found : " + m.group()));

        hmatcher.reset();

        StringBuilder sb = new StringBuilder();
        while(hmatcher.find()) {
            String sentence = switch (hmatcher.group(1).toLowerCase()) {
                case "h1" -> "<header>" + hmatcher.group(2) + "</header>";
                case "p" -> "<body>" + hmatcher.group(2) + "</body>";
                default -> "<%s>".formatted(hmatcher.group(1)) + hmatcher.group(2) + "</%s>".formatted(hmatcher.group(1));

            };
            System.out.println(sentence);
        }
    }
}