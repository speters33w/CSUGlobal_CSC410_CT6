/**
 * Enum that assigns Blackjack card values.
 */
public enum Card {
    ACE(1,11),
    TWO(2,2),
    THREE(3, 3),
    FOUR(4, 4),
    FIVE(5, 5),
    SIX(6, 6),
    SEVEN(7, 7),
    EIGHT(8, 8),
    NINE(9, 9),
    TEN(10, 10),
    JACK(10, 10),
    QUEEN(10, 10),
    KING(10, 10);


    Card(int i, int j) {
        Pair values = new Pair(i, j);
    }
}
