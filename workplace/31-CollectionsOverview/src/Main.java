import java.util.*;

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

        List<Card> kingList = new ArrayList<>(List.of(kingArray));

        List<Card> deck = new ArrayList<>(Card.getStandardDeck());

        Card.printStandardDeck(deck);
        Collections.shuffle(deck);
        Card.printStandardDeck(deck);

        Collections.reverse(deck);
        Card.printStandardDeck(deck);

        var sortintAlgorithm = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck, sortintAlgorithm);
        Collections.reverse(deck);
        Card.printStandardDeck(deck);

//        sortintAlgorithm = Comparator.comparing(Card::suit).thenComparing(Card::rank);
//        Collections.sort(deck, sortintAlgorithm);
//        Card.printStandardDeck(deck);

        List<Card> kingsList = new ArrayList<>(deck.subList(4,8));
        System.out.println(kingsList);

        List<Card> tens = new ArrayList<>(deck.subList(16,20));
        System.out.println(tens);

        int indexOfSublist = Collections.indexOfSubList(deck, tens);
        System.out.println(indexOfSublist);

        System.out.println(deck.containsAll(tens));

        System.out.println(Collections.disjoint(deck, tens));
        System.out.println(Collections.disjoint(kingsList, tens));
    }
}