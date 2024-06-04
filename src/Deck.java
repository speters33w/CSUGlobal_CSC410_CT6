/**
 * Creates a simple 52-card blackjack deck.
 * Suites are not defined.
 */

import java.util.ArrayList;

public class Deck {
    final ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
            for (int i = 0; i < 4; i++) {
                this.cards.add(Card.ACE);
                this.cards.add(Card.TWO);
                this.cards.add(Card.THREE);
                this.cards.add(Card.FOUR);
                this.cards.add(Card.FIVE);
                this.cards.add(Card.SIX);
                this.cards.add(Card.SEVEN);
                this.cards.add(Card.EIGHT);
                this.cards.add(Card.NINE);
                this.cards.add(Card.TEN);
                this.cards.add(Card.JACK);
                this.cards.add(Card.QUEEN);
                this.cards.add(Card.KING);
            }
    }

    public String toString() {
        return cards.toString();
    }
}
