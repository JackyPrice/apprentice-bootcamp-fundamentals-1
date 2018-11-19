package cards;

import java.util.Scanner;

class SnapNormalDeck {

    // need to make this work with values instead of animals
    private int player1Score;
    private int player2Score;
    private CardDeck deck;

    SnapNormalDeck(CardDeck deck) {
        this.deck = deck;
        deck.shuffle();
    }

    public static void main(String[] args) {
        SnapNormalDeck snap = new SnapNormalDeck(new CardDeck());
        snap.play();
    }

    void play() {
        Scanner scanner = new Scanner(System.in);

        Card previousCard = null;
        while (deck.getCards().length > 0) {
            Card currentCard = deck.deal();
            System.out.println(currentCard.getFacevalue());
            String input = scanner.nextLine();
            if (input.length() > 0 && input.charAt(0) == 'a') {
                if (currentCard.snap(previousCard)) {
                    System.out.println("SNAP! score Player 1");
                    player1Score++;
                } else {
                    System.out.println("WRONG! deducting score from Player 1");
                    player1Score--;
                }
            } else if (input.length() > 0 && input.charAt(0) == 'l') {
                if (currentCard.snap(previousCard)) {
                    System.out.println("SNAP! scorePlayer 2");
                    player2Score++;
                } else {
                    System.out.println("WRONG! deducting score from Player 2");
                    player2Score--;
                }
            }
            previousCard = currentCard;
        }

        scoring(player1Score, player2Score);
    }


    public void scoring(int player1Score, int player2Score) {
        if (player1Score == player2Score) {
            System.out.println("Draw.");
        } else if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else System.out.println("Player 2 wins!");

        System.out.println("Scores: " + player1Score + " vs " + player2Score);
    }
}

