import games.cards.Card;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Card> cards = Card.getCardsDeck();
        Card.printDeck(cards);

        Card[] aceshearts = new Card[13];
        Card aceOfHeart = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(aceshearts, aceOfHeart);
        Card.printDeck(Arrays.asList(aceshearts));

        List<Card> acesOfHearts = Collections.nCopies(13, aceOfHeart);
        System.out.println("Aces of hearts : ");
        Card.printDeck(acesOfHearts);

//        acesOfHearts.addAll(aceshearts);
        Collections.addAll(cards,aceshearts);

        List<Card> acesCopy = List.copyOf(acesOfHearts);

        List<Card> deck = Card.getCardsDeck();

        Card.printDeck(deck);
        Collections.shuffle(deck);
        Card.printDeck(deck);

        Collections.reverse(deck);

        Card.printDeck(deck);

        var sortingAgorithm = Comparator.comparing(Card::suit).thenComparing(Card::rank);

        Collections.sort(deck, sortingAgorithm);
        Card.printDeck(deck);

        var sortingAlgorithm2 = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck, sortingAlgorithm2);

        Card.printDeck(deck);
        Collections.reverse(deck);
        Card.printDeck(deck);

        List<Card> kings = new ArrayList<>(deck.subList(4,8));
        Card.printDeck(kings, "kings", 1);

        List<Card> tens = new ArrayList<>(deck.subList(16,20));
        Card.printDeck(tens, "tens", 1);


        System.out.println(Collections.indexOfSubList(deck, tens));

        System.out.println(Collections.disjoint(deck, tens));
        System.out.println(Collections.disjoint(kings, tens));

        Collections.sort(deck, sortingAgorithm);
//        Collections.reverse(deck);

        Card tenOfheart = Card.getNumericCard(Card.Suit.HEART, 10);
        System.out.println(deck.indexOf(tenOfheart));
        System.out.println(Collections.binarySearch(deck, tenOfheart, sortingAgorithm));

        Card kingOfClub = Card.getFaceCard(Card.Suit.CLUB, 'K');
        Collections.replaceAll(deck, tenOfheart, kingOfClub);

        Card.printDeck(deck);

        System.out.println(Collections.frequency(deck, kingOfClub));
        System.out.println(Collections.min(deck, sortingAgorithm));
        System.out.println(Collections.max(deck, sortingAgorithm));


        Comparator<Card> sortBySuit = Comparator.comparing(Card::suit).thenComparing(Card::rank);

        Collections.sort(deck, sortBySuit);

        Card.printDeck(deck) ;

        // use collections swap
        List<Card> spades = new ArrayList<>(deck.subList(0,13));

        for(int i = 0 ; i < spades.size() / 2 ; i ++ ) {
            Collections.swap(spades, i , spades.size() - 1 - i);
        }

        Card.printDeck(spades, "spades" , 1);

    }

}