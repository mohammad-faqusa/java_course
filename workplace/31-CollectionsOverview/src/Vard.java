

import java.util.ArrayList;
import java.util.List;

public record Vard(Suit suit, String face, int rank) {
    public enum Suit {
        CLUB,
        DIAMOND,
        HEART,
        SPADE;

        public char getImage() {
            return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
        }
    }

    @Override
    public String toString() {
        int index = face.equals("10") ? 2 : 1;
        String faceString = face.substring(0, index);
        return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
    }

    public static Vard getNumericCard(Suit suit, int cardNumber) {
        if(cardNumber > 1 && cardNumber < 11) {
            return new Vard(suit, String.valueOf(cardNumber), cardNumber - 2);
        }

        System.out.println("Invalid card number selected");
        return null;
    }

    public static Vard getFaceCard(Suit suit, char abbrev) {
        int charIndex = "JQKA".indexOf(abbrev);

        if(charIndex > -1 ) {
            return new Vard(suit, "" + abbrev, charIndex + 9);
        }

        System.out.println("Invalid face card selected");
        return null;
    }

    public static List<Vard> getStandardDeck() {

        List<Vard> deck = new ArrayList<>(52);

        for(Suit suit : Suit.values()) {
            for(int i = 2 ; i <= 10 ; i++ ) {
                deck.add(getNumericCard(suit, i));
            }
            for(char c : new char[]{'J','Q','K','A'}) {
                deck.add(getFaceCard(suit, c));
            }
        }
        return deck;
    }

    public static void printDeck(List<Vard> deck , String description, int rows) {

        System.out.println("-------------------------------------------------");
        if(!(description.isEmpty() || description == null))
            System.out.println(description);

        int cardsInRow = deck.size() / rows;

        for(int i = 0 ; i < rows ; i ++ ) {

            int startIndex = i * cardsInRow;
            int endIndex = startIndex + cardsInRow - 1;

            for(int j = startIndex; j <= endIndex ; j++ ) {
                Vard card = deck.get(j);
                System.out.print(card + " ");
            }
            System.out.println();
        }
    }

    public static void printDeck(List<Vard> deck) {
        printDeck(deck, "current deck" , 4);
    }



}