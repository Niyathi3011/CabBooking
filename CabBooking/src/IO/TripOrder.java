package IO;

public class TripOrder {

    private final String driversName;
    private final int driversRating;
    private final String customersName;
    private final int customersRating;


    public TripOrder(String driversName, int driversRating, String customersName, int customersRating) {
        this.driversName = driversName;
        this.driversRating = driversRating;
        this.customersName = customersName;
        this.customersRating = customersRating;
    }

    public String getDriversName() {

        return driversName;
    }

    public int getDriversRating() {

        return driversRating;
    }

    public String getCustomersName() {
        return customersName;
    }

    public int getCustomersRating() {

        return customersRating;
    }
}
