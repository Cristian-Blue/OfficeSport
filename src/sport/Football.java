package sport;

import sport.constants.Value;

/**
 * Football
 */
public class Football extends Sport {
    private int yellowCard;
    private int redCard;

    public Football(String name, int numberPlayers, double salary) {
        super(name, numberPlayers, salary);
    }

    @Override
    public double payrollPayment() {
        double yellowCardDeduction = yellowCard * Value.YELLOW_CARD_VALUE;
        double redCardDeduction = redCard * Value.RED_CARD_VALUE;
        double subtotal = super.salary * super.numberPlayers;
        double discount = yellowCardDeduction + redCardDeduction;
        double total = subtotal - discount;
        return total;
    }

    public void setYellowCard(int yellowCard) {
        if (yellowCard < 0) {
            throw new IllegalArgumentException(
                    "Yellow cards cannot be negative");
        }

        this.yellowCard = yellowCard;
    }

    public void setRedCard(int redCard) {
        if (redCard < 0) {
            throw new IllegalArgumentException(
                    "Red cards cannot be negative");
        }

        this.redCard = redCard;
    }
}