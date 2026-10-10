package sport;

public abstract class Sport {
    protected String name;
    protected int numberPlayers;
    protected double salary;

    public Sport(String name, int numberPlayers, double salary) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException(
                    "The sport name cannot be empty");
        }

        if (numberPlayers <= 0) {
            throw new IllegalArgumentException(
                    "The number of players must be positive");
        }

        if (salary < 0) {
            throw new IllegalArgumentException(
                    "The salary cannot be negative");
        }

        this.name = name;
        this.numberPlayers = numberPlayers;
        this.salary = salary;
    }

    public abstract double payrollPayment();

}
