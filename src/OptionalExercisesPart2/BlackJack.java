package OptionalExercisesPart2;

public class BlackJack {


    public static void main(String[] args) {
        BlackJack game = new BlackJack();
        System.out.println(game.firstTurn("six", "six", "eight"));
    }


    public int parseCard(String card) {

        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0;
        }
    }

    public boolean isBlackJack(String card1, String card2) {
        return (parseCard(card1) + parseCard(card2)) == 21;
    }


    public String largeHand(boolean isBlackjack, int dealerScore) {
        String value = "S";
        if (isBlackjack && dealerScore != 11 && dealerScore != 10) {
            value = "W";
        }
        return value;
    }

    public String smallHand(int handscore, int dealerScore) {
        String value;
        if (handscore >= 17) {
            value = "S";
        } else if (handscore <= 11) {
            value = "H";
        } else if (dealerScore < 7) {
            value = "S";
        } else {
            value = "H";
        }
        return value;
    }

    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackJack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }


}
