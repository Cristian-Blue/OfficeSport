package sport;

import sport.constants.Value;

public class Tennis extends Sport {
    private Value.ModeType mode;

    public Tennis(String name, int numberPlayers, double salary) {
        super(name, numberPlayers, salary);
        if (numberPlayers != 1 && numberPlayers != 2) {
            throw new IllegalArgumentException(
                    "the number of players must be 1 or 2");
        }
        this.mode = numberPlayers == 1 ? Value.ModeType.SINGLE : Value.ModeType.DOUBLES;
    }

    @Override
    public double payrollPayment() {
        double total = numberPlayers * salary;
        if (mode == Value.ModeType.DOUBLES) {
            total += total * Value.TEN_PERCENT;
        }
        return total;
    }

    public void setMode(Value.ModeType mode) {
        if (mode == null) {
            throw new IllegalArgumentException(
                    "The mode cannot be null");
        }

        this.mode = mode;
    }
}
