package games.cards;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public record Card(Suit suit, String face, int rank) {

    public enum Suit {
        SPADE, DIAMOND, HEART, CLUB  ;

        public char getImage() {
            return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
        }
    }

    public static Comparator<Card> sortRankReversedSuit() {
        return Comparator.comparing(Card::rank).reversed().thenComparing(Card::suit);
    }

    public String toString() {
        int index = face.equals("10") ? 2 : 1;
        String faceCard = face.substring(0 , index);
        return "%c%s(%d)".formatted(suit.getImage(), faceCard, rank);
    }

    public static Card getNumericCard(Suit suit, int cardNumber) {
        if(cardNumber > 1 && cardNumber < 11) {
            return new Card(suit, String.valueOf(cardNumber), cardNumber - 2 );
        }
        System.out.println("Invalid Numeric card selected");
        return null;
    }

    public static Card getFaceCard(Suit suit, char abbrev) {
        int charIndex = "JQKA".indexOf(abbrev);
        if(charIndex > -1 ) {
            return new Card(suit, String.valueOf(abbrev), charIndex + 9);
        }
        System.out.println("Invalid Face card selected");
        return null;
    }

    public static List<Card> getCardsDeck() {
        List<Card> cards = new ArrayList<>(52);

        for(Suit suit : Suit.values()) {

            for(int i = 2 ; i <= 10 ; i++ ) {
                cards.add(Card.getNumericCard(suit, i));
            }

            for(char abbrev: new char[]{'J', 'Q', 'K', 'A'}) {
                cards.add(Card.getFaceCard(suit, abbrev));
            }

        }
        return cards;

    }

    public static void printDeck(List<Card> list, String description, int rows) {
        System.out.println("---------------------------------------------");
        if(description != null) {
            System.out.println(description);
        }

        int cardsInRow = list.size() / rows;

        for(int i = 0 ; i < rows ; i++ ) {
            int firstIndex = i *  cardsInRow;
            int lastIndex = firstIndex + cardsInRow;
            list.subList(firstIndex, lastIndex).forEach(s -> System.out.print(s + " "));
            System.out.println();

        }
    }

    public static void printDeck(List<Card> deck) {
        printDeck(deck, "Current Deck", 4);
    }


}
