import java.util.Arrays;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var stream = IntStream.iterate(1, i -> i < 500 , i -> i + 5)
                .summaryStatistics();
        System.out.println(stream);

        Seat[] seats = new Seat[100];

        Arrays.setAll(seats, i -> new Seat((char)('A' + i/10) , i%15));

        var anyMatch = Arrays.stream(seats)
//                .forEach(System.out::println);
                .anyMatch(Seat::isReserved);
        System.out.println(anyMatch);


    }
}