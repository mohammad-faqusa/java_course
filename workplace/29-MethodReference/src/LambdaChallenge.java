import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.UnaryOperator;

public class LambdaChallenge {

    private static Random  rand = new Random();

    public static void main(String[] args) {

        String[] names = {"Mohammad" , "Ahmad" , "Khaled",  "Ehsan"};

        List<UnaryOperator<String>> operators = Arrays.asList(
                LambdaChallenge::generateRandomCharacter,
                s -> s + " " +String.valueOf(new StringBuilder(s.substring(0, s.indexOf(" "))).reverse()),
                String::toUpperCase
                );

        operators.forEach(operator -> Arrays.setAll(names, i -> names[i].transform(operator)));

        System.out.println(Arrays.toString(names));
    }

    private static String reverse (String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private static String generateRandomCharacter(String s){

        return s + " " + generateRandomCharacter('A' , 'Z')+ ".";
    }
    private static Character generateRandomCharacter(char a, char b) {
        int bound = (int) (a - b ) >= 0 ? a - b : b - a;
        return (char)(rand.nextInt(bound) + a);
    }

//    private static void reverse


}
