package u5pp;

public class Card {

    private String value = "2";
    private String suit = "clubs";

    public Card() {}

    public Card(String suit) 
    {
        this.suit = suit;
    }

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return "The " + value + " of " + suit;
    }

    public boolean equals(Card c) {
        return this.suit.equals(c.suit) && this.value.equals(c.value);
    }

    public void changeSuit(String suit) {
        suit = suit.toLowerCase();
        if (suit.equals("clubs") ||
            suit.equals("diamonds") ||
            suit.equals("hearts") ||
            suit.equals("spades") )
        {
            this.suit = suit;
        }
    }

    public void changeValue(String value) {
        value = value.toLowerCase();
        if (value.equals("ace") || value.equals("2") || value.equals("3") || value.equals("4") || value.equals("5") || value.equals("6") || value.equals("7") 
        || value.equals("8") || value.equals("9") || value.equals("10") || value.equals("jack") || value.equals("queen") || value.equals("king"))
    {
        this.value = value;
    }
    }

}



