package IO;

import java.util.List;

public class driversList {

    private final String customers_name;

    public driversList(String customers_name, double customer_avgRating, List<IO.eligibleDrivers> eligibleDrivers) {
        this.customers_name = customers_name;
        this.customer_avgRating = customer_avgRating;
        this.eligibleDrivers = eligibleDrivers;
    }

    private final double customer_avgRating;
    private final List<eligibleDrivers> eligibleDrivers;



    public String getCustomers_name() {
        return customers_name;
    }

    public double getCustomer_avgRating() {
        return customer_avgRating;
    }

    public List<IO.eligibleDrivers> getEligibleDrivers() {
        return eligibleDrivers;
    }

    public void getList(driversList List){
        System.out.println(List.getCustomers_name()+" "+List.getCustomer_avgRating());
        for(eligibleDrivers drivers:List.getEligibleDrivers())
            System.out.println(drivers.getDrivers_name()+" "+drivers.getDriver_avgRating());
    }
}
