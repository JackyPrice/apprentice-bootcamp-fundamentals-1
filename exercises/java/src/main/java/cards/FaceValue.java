package cards;

public class FaceValue {


    private String faceValueName;
    private int[][] deck = new int[52][3];

    String faceValueGenerator() {
        for (int[] card : deck) {
            switch (card[1]) {
                case 0:
                    faceValueName = "ace";
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    faceValueName = Integer.toString(card[1] + 1);
                    break;
                case 10:
                    faceValueName = "jack";
                    break;
                case 11:
                    faceValueName = "queen";
                    break;
                case 12:
                    faceValueName = "king";
                    break;
                default:
                    throw new IllegalArgumentException("Something went wrong " + card[1] + "is not a valid faceValue!");
            }
        }
    return faceValueName;
    }
}
