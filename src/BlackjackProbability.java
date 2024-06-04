/*
CSU Global CSC 410 Module 6 Critical Thinking
Applying Probability in the Casino

A number of casino games are all about probability.
In Blackjack, there are rules which you should follow about taking a hit or standing when the dealer is showing a 10.

Assuming that you are only using one deck, and there are only four cards on the table.
If you have a 10 and a 7 showing, the dealer has a 10 showing,
calculate the probability of the dealer's other card being an 8, 9, or a face card.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BlackjackProbability {

    /**
     * Gets a Card from the user input.
     * @param input Scanner to get the input from.
     * @return the Card from the user input.
     */
    public static Card getCard(Scanner input) {
        System.out.print("Card ? ");
        String inputString = input.nextLine().toUpperCase();
        if (inputString.equals("10")) {
            return Card.TEN;
        }
        switch (inputString.charAt(0)) {
            case '2' -> {
                return Card.TWO;
            }
            case '3' -> {
                return Card.THREE;
            }
            case '4' -> {
                return Card.FOUR;
            }
            case '5' -> {
                return Card.FIVE;
            }
            case '6' -> {
                return Card.SIX;
            }
            case '7' -> {
                return Card.SEVEN;
            }
            case '8' -> {
                return Card.EIGHT;
            }
            case '9' -> {
                return Card.NINE;
            }
            case 'J' -> {
                return Card.JACK;
            }
            case 'Q' -> {
                return Card.QUEEN;
            }
            case 'K' -> {
                return Card.KING;
            }
            case 'A' -> {
                return Card.ACE;
            }
            default -> {
                System.out.println("Please enter a valid card");
                return getCard(input);
            }
        }
    }

    /**
     * Gets a set of cards that are already shown.
     * Currently, accepts one player with two cards shown, and the dealer with one card shown.
     * This method would need to be re-written to accept more players or more cards shown.
     * This method is used only for this specific exercise.
     * @param input Scanner to get the input from.
     * @return An ArrayList of Cards that are already shown.
     */
    public static ArrayList<Card> CardsShown(Scanner input){

        ArrayList<Card> cardsShown = new ArrayList<>();
        System.out.println("Which cards do you have in your hand?\n(In this assignment the cards are 7 and 10.)");
        cardsShown.add(getCard(input));
        cardsShown.add(getCard(input));
        System.out.println("Which is shown by the dealer?\n(In this assignment the card is a 10.)");
        cardsShown.add(getCard(input));
        return cardsShown;
    }

    /**
     * Determines the specific probability of the dealer's other card being an 8, 9, or face card.
     * This method would need to be re-written for more versatility.
     * @param deck The deck of cards to determine the probability from.
     * @return the probability of the dealer's other card being an 8, 9, or face card.
     */
    public static double probability(Deck deck){
        System.out.println("For this exercise we are asked to determine the probability of the dealer's other card " +
                           "being an 8, 9, or face card.\n");
        List<Card> faceCards = Arrays.asList(Card.JACK, Card.QUEEN, Card.KING);
        int count = 0;
        for(Card card : deck.cards){
            if(faceCards.contains(card) || card.equals(Card.EIGHT) || card.equals(Card.NINE)){
                count++;
            }
        }
        return (double) count / deck.cards.size();
    }

    /**
     * The main runner method.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        ArrayList<Card> cardsShown = CardsShown(input);
        for(Card card : cardsShown){
            deck.cards.remove(card);
        }
        System.out.printf("The probability of the dealer's other card being an 8, 9, or face card is %.1f%%",
                probability(deck) * 100);
    }
}
