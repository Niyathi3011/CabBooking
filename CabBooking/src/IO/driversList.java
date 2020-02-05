package IO;

import java.util.List;

public class DriversList {


    private final String customers_name;

    public DriversList(String customers_name, double customer_avgRating, List<EligibleDrivers> eligibleDrivers) {
        this.customers_name = customers_name;
        this.customer_avgRating = customer_avgRating;
        this.eligibleDrivers = eligibleDrivers;
    }

    private final double customer_avgRating;
    private final List<EligibleDrivers> eligibleDrivers;



    public String getCustomers_name() {
        return customers_name;
    }

    public double getCustomer_avgRating() {
        return customer_avgRating;
    }

    public List<EligibleDrivers> getEligibleDrivers() {
        return eligibleDrivers;
    }

    public void getList(DriversList List){
        System.out.println(List.getCustomers_name()+" "+List.getCustomer_avgRating());
        for(EligibleDrivers drivers:List.getEligibleDrivers())
            System.out.println(drivers.getDrivers_name()+" "+drivers.getDriver_avgRating());
    }
}
