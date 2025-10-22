import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stream.iterate((int) 'A', n -> n < (int) 'z' , n -> n + 1)
//                .map(i -> (char) i)
                .skip(5)
                .takeWhile(i -> i < 'Z')
//                .filter(Character::isAlphabetic)
                .forEach(s -> System.out.printf("%c ", s));
    }
}