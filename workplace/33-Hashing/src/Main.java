import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String a = "Hello";
        String b = "Hello";
        String c = String.join("l", "he", "lo");
        System.out.println(c);
        String d = "He".concat("llo");

        List<String> hellos = new ArrayList<>(List.of(a, b, c, d));

        hellos.forEach(s -> System.out.println("s : " + s.hashCode()));

        Set<String> mySet = new HashSet<>(hellos);
        System.out.println(mySet);

        for(String setValue : mySet ) {
            System.out.print(setValue + " : ");
            for(int i = 0 ; i < hellos.size() ; i++){
                if(setValue==hellos.get(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        PlayingCard king = new PlayingCard("Space" , "king");
        PlayingCard queen = new PlayingCard("Heart", "queen");
        PlayingCard ten = new PlayingCard("Diamond", "10");
        PlayingCard tens = new PlayingCard("Diamond", "10");

        List<PlayingCard> cards = new ArrayList<>(List.of(king, queen, ten, tens));

        HashSet<PlayingCard> cardsSet  = new HashSet<>();

        for(PlayingCard card : cards) {

            if(!cardsSet.add(card)) {
                System.out.println("could not add : " + card);
            }
        }

        System.out.println(cardsSet);

    }
}