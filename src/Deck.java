import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Deck {
    private final ArrayList<Card> cards;
    public Deck() {
        this.cards = new ArrayList<>();
        List<String> suits = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades");
        List<String> values = Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King",
                "Ace");

        // create the deck, un-shuffled
        for (String suit : suits) {
            for (String value : values) {
                this.cards.add(new Card(suit, value));
            }
        }
    }
    // Getter for the cards
    public ArrayList<Card> getDeck(){
        return cards;
    }
    public Card getAndRemoveRandomCard() {
        Random rand = new Random();
        int cardPos = rand.nextInt(cards.size());
        return cards.remove(cardPos);
    }
    // Shuffle the deck using the Fisher-Yates algorithm.
    public void shuffle() {
        Random rand = new Random();
        for (int card = 0; card < cards.size(); card++) {
            int cardToSwapWith = rand.nextInt(cards.size());
            Card holdForSwap = this.cards.get(card);
            cards.set(card, this.cards.get(cardToSwapWith));
            cards.set(cardToSwapWith, holdForSwap);
        }
    }

    public String toString(){
        StringBuilder cardsAsString = new StringBuilder();
        for (Card card : cards) {
            cardsAsString.append(STR." \{card.toString()}");
        }
        return cardsAsString.toString();
    }
}