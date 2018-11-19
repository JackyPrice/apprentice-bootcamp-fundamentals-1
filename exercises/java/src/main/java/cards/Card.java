package cards;


public class Card {

    private String facevalue;
    private String suit;

    public Card(String facevalue, String suit) {
        this.facevalue = facevalue;
        this.suit = suit;
    }

    public String getFacevalue() {
        return facevalue;
    }

    public String getSuit() {
        return suit;
    }

    boolean snap( Card otherPlayingCard){
        return otherPlayingCard != null && this.facevalue.equals(otherPlayingCard.getFacevalue());
    }
}

