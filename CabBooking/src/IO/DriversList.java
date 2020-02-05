package IO;

import java.util.List;

public class DriversList {


    private final String customersName;

    public DriversList(String customersName, double customerAvgRating, List<EligibleDrivers> eligibleDrivers) {
        this.customersName = customersName;
        this.customerAvgRating = customerAvgRating;
        this.eligibleDrivers = eligibleDrivers;
    }

    private final double customerAvgRating;
    private final List<EligibleDrivers> eligibleDrivers;



    public String getCustomersName() {
        return customersName;
    }

    public double getCustomerAvgRating() {
        return customerAvgRating;
    }

    public List<EligibleDrivers> getEligibleDrivers() {
        return eligibleDrivers;
    }

    public void getList(DriversList List){
        System.out.println(List.getCustomersName()+" "+List.getCustomerAvgRating());
        for(EligibleDrivers drivers:List.getEligibleDrivers())
            System.out.println(drivers.getDriversName()+" "+drivers.getDriverAvgRating());
    }
}
