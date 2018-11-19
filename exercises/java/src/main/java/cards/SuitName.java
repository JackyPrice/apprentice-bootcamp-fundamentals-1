package cards;

public class SuitName {

       private String suitName;
    private int[] suits = {0, 1, 2, 3};


    public String getSuitGenerator() {
        for (int card: suits) {
            switch (suits[card]) {
                case 0:
                    suitName = "clubs";
                    break;
                case 1:
                    suitName = "diamonds";
                    break;
                case 2:
                    suitName = "hearts";
                    break;
                case 3:
                    suitName = "spades";
                    break;
                default:
                    throw new IllegalArgumentException("Something went wrong " + suits[card] + "is not a valid suitName!");
            }
        }
        return suitName;
    }
}
