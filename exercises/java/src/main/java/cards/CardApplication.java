package cards;


import java.util.ArrayList;

public class CardApplication {
    public static void main(String[] args) {
        CardDeck cardFinder = new CardDeck();
        ArrayList<Card> deck = cardFinder.getDeck();

        for(Card Card : deck){
            System.out.println(Card.getFacevalue() + " of " + Card.getSuit());
        }

//        String[] deckInOrder = cardFinder.getCards();
//        for (String card : deckInOrder) {
//            System.out.println(card);
//        }

    }
}


