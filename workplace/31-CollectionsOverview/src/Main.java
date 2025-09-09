import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Card.printStandardDeck(Card.getStandardDeck());

        Card[] cards = new Card[12];

        Card aceOfHearts  = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(cards, aceOfHearts);
        System.out.println(Arrays.toString(cards));

        List<Card> cardsList = new ArrayList<>(52);
        Collections.fill(cardsList, aceOfHearts);
        System.out.println(cardsList); // empty

//        cardsList = Collections.nCopies(12, aceOfHearts);
        System.out.println(cardsList);

        Card kingOfClubs =  Card.getFaceCard(Card.Suit.CLUB, 'K');
        Card[] kingArray = new Card[12];
        Arrays.fill(kingArray, kingOfClubs);

        Collections.addAll(cardsList, kingArray); // exception
        System.out.println(cardsList);

        Collections.copy(cardsList, Arrays.asList(kingArray));
        System.out.println(cardsList);

        cardsList = List.copyOf(Arrays.asList(kingArray));
        System.out.println(cardsList);
    }
}