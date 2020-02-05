package IO;

public class EligibleDrivers {


      private final String driversName;
      private final double driverAvgRating;


    public EligibleDrivers(String driversName, double driverAvgRating) {
        this.driversName = driversName;
        this.driverAvgRating = driverAvgRating;
    }

    public String getDriversName() {
        return driversName;
    }

    public double getDriverAvgRating() {
        return driverAvgRating;
    }
}
