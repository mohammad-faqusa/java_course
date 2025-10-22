import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int counter = 1;

    public static void main(String[] args) {



        int loopIndex = 1;
        var firstStream = Stream.iterate(loopIndex , n -> n + 1)
                .limit(15)
                .map(i -> "B" + i);
//                .forEach(System.out::println);

        var secondStream = Stream.iterate(loopIndex++ * 15 + 1 , n -> n + 1)
                .limit(15)
                .map(i -> "I" + i);

        var thirdStream = Stream.iterate(loopIndex++ * 15 + 1, n -> n + 1)
                .limit(15)
                .map(i -> "N" + i);

        var fourthStream = Stream.iterate(loopIndex++ * 15 + 1 , n -> n + 1)
                .limit(15)
                .map(i -> "G" + i);

        var fifthStream = Stream.iterate(loopIndex++ * 15 + 1 , n -> n + 1)
                .limit(15)
                .map(i -> "O" + i);

        var merged = Stream.concat(firstStream, secondStream);
        merged = Stream.concat(merged, thirdStream);
        merged = Stream.concat(merged, fourthStream);
        merged = Stream.concat(merged, fifthStream);

        merged = merged
                .filter(s -> Integer.parseInt(s.substring(1))% 15 == 0)
                .map(s -> "" + s.charAt(0)+ (Integer.parseInt(s.substring(1)) - 14) + "-" + s );
        merged.forEach(System.out::println);

        Stream.generate(() -> new Random().nextInt(15, 30))
                .distinct()
                .limit(5)
                .sorted()
                .map(s -> "O" + s)
                .forEach(s -> System.out.print(s + " "));
    }

    private static int getCounter() {
        return counter++;
    }

}