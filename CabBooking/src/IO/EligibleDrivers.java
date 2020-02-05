package IO;

public class EligibleDrivers {


      private final String drivers_name;
      private final double driver_avgRating;


    public EligibleDrivers(String drivers_name, double driver_avgRating) {
        this.drivers_name = drivers_name;
        this.driver_avgRating = driver_avgRating;
    }

    public String getDrivers_name() {
        return drivers_name;
    }

    public double getDriver_avgRating() {
        return driver_avgRating;
    }
}
