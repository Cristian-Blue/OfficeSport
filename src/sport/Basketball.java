package sport;

import sport.constants.Value;

public class Basketball extends Sport {
    private int numberMatches;

    public Basketball(String name, int numberPlayers, double salary) {
        super(name, numberPlayers, salary);
    }

    @Override
    public double payrollPayment() {
        double total = numberPlayers * salary;
        if (numberMatches > Value.MATCH_LIMIT_BASKETBALL_BONUS) {
            int numberBonus = numberMatches - Value.MATCH_LIMIT_BASKETBALL_BONUS;
            total += numberBonus * Value.BASKETBALL_BONUS;
        }
        return total;
    }

    public void setNumberMatches(int numberMatches) {
        if (numberMatches < 0) {
            throw new IllegalArgumentException(
                    "The number of matches cannot be negative");
        }

        this.numberMatches = numberMatches;
    }

}
