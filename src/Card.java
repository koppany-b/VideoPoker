public class Card {
    private String suit;
    private String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }
    // setters and getters for Card values
    public String getSuit(){
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue(){
        return value;
    }
    public void setValue(String value){
        this.value = value;
    }
    public String toString() {
        String suitSymbol;
        String valueSymbol;

        suitSymbol = switch (suit) {
            case "Hearts" -> "❤";
            case "Diamonds" -> "♦";
            case "Clubs" -> "♣";
            case "Spades" -> "♠";
            default -> "ERR";
        };

        valueSymbol = switch (value) {
            case "Jack" -> "J";
            case "Queen" -> "Q";
            case "King" -> "K";
            case "Ace" -> "A";
            default -> value;
        };
        return suitSymbol + valueSymbol;
    }

}