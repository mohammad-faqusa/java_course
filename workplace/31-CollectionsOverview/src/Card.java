import java.util.ArrayList;
import java.util.List;

public record Card(Suit suit, String face, int rank){

    enum Suit {
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
        String faceChar = face.substring(0, index);

        return "%c%s(%d)".formatted(suit.getImage(), faceChar, rank);
    }

    public static Card getNumbericCard(Suit suit, int cardNumber){
        if(cardNumber > 1 && cardNumber < 11) {
            return new Card(suit, String.valueOf(cardNumber), cardNumber - 2);
        }
        System.out.println("Invalid selected card number");
        return null;
    }

    public static Card getFaceCard(Suit suit, char abbrev) {

        int index = "JQKA".indexOf(abbrev);
        if(index == -1){
            System.out.println("Invalid selected card number");
            return null;
        }
        return new Card(suit, "" + abbrev, index + 9);
    }

    public static List<Card> getStandardDeck() {
        List<Card> deck = new ArrayList<>(52);

        for(Suit suit : Suit.values()){
            for(int i = 2 ; i <= 10 ; i++ ) {
                deck.add(getNumbericCard(suit, i));
            }
            for(char c : new char[]{'J', 'Q', 'K', 'A'}){
                deck.add(getFaceCard(suit, c));
            }
        }
        return deck;
    }

    public static void printStandardDeck(List<Card> deck,String description, int rowsCount){
        System.out.println("---------------------------------");
        System.out.println(description);

        int cardsInRow = deck.size() / rowsCount;
        for(int i = 0 ; i < rowsCount ; i++ ) {

            int startIndex =  i * cardsInRow;
            int endIndex = startIndex + cardsInRow - 1;

            for(int j = startIndex; j <= endIndex; j++ ) {
                Card card = deck.get(j);
                System.out.print(card + " ");
            }
            System.out.println();
        }
    }

    public static void printStandardDeck(List<Card> deck){

        printStandardDeck(deck, "current deck", 4);
    }
}
