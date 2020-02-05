package IO;

public class TripOrder {

    private final String drivers_name;
    private final int drivers_rating;
    private final String customers_name;
    private final int customers_rating;


    public TripOrder(String drivers_name, int drivers_rating, String customers_name, int customers_rating) {
        this.drivers_name = drivers_name;
        this.drivers_rating = drivers_rating;
        this.customers_name = customers_name;
        this.customers_rating = customers_rating;
    }

    public String getDrivers_name() {

        return drivers_name;
    }

    public int getDrivers_rating() {

        return drivers_rating;
    }

    public String getCustomers_name() {
        return customers_name;
    }

    public int getCustomers_rating() {

        return customers_rating;
    }
}
