package cards;

import java.util.ArrayList;
import java.util.Collections;

class CardDeck {

    private ArrayList<Card> deck = new ArrayList<Card>();
    private String[] valueList = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private String[] suitList = {"Clubs", "Spades", "Diamonds", "Hearts"};


    public CardDeck() {

        for (String suit : suitList) {
            for (String value : valueList) {
                Card Card = new Card(value, suit);
                deck.add(Card);
            }
        }

    }

    void shuffle() {
        Collections.shuffle(deck);
    }

    String[] getCards() {
        String[] result = new String[deck.size()];
        for (int i = 0; i < deck.size(); i++) {
            Card Card = deck.get(i);
            result[i] = Card.getFacevalue();
        }
        return result;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    Card deal() {
        return deck.remove(0);
    }

    // constructor makes a deck of cards

}
