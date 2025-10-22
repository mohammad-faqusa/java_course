import java.util.Random;

public record Seat(char seatLetter, int seatNumber , boolean isReserved) {

    public Seat(char seatLetter, int seatNumber) {
        this(seatLetter, seatNumber, new Random().nextBoolean());
    }
}
