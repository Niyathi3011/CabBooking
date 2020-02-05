package Data;

import IO.TripOrder;
import IO.driversList;
import IO.eligibleDrivers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class prevTripRatings {

    private final Map<String,List<Integer>>customerAvg;
    private final Map<String,List<Integer>>driverAvg;
    private final List<eligibleDrivers> eligibleDriversList;

    public prevTripRatings() {

        this.driverAvg=new HashMap<>();
        this.eligibleDriversList=new ArrayList<>();
        this.customerAvg=new HashMap<>();
    }

    public void getAverage(List<TripOrder> tripOrders){

            for(TripOrder tripOrder:tripOrders){

                if (!customerAvg.containsKey(tripOrder.getCustomers_name())) {
                    customerAvg.put(tripOrder.getCustomers_name(),new ArrayList<>());
                }

                customerAvg.get(tripOrder.getCustomers_name()).add(tripOrder.getCustomers_rating());

                if(!driverAvg.containsKey(tripOrder.getDrivers_name()))
                    driverAvg.put(tripOrder.getDrivers_name(),new ArrayList<>());

                driverAvg.get(tripOrder.getDrivers_name()).add(tripOrder.getDrivers_rating());

            }
    }

    public driversList getEligibleDrivers(String customers_name){

        for(String name: driverAvg.keySet()){

            if(avg(driverAvg.get(customers_name))>avg(customerAvg.get(name))){

                eligibleDriversList.add(new eligibleDrivers(name,avg(customerAvg.get(name))));
            }
        }

        return new driversList(customers_name,avg(customerAvg.get(customers_name)),eligibleDriversList);


    }

    private static double avg(List<Integer>list) {

            double average = 0.0;
            for(Integer integer:list) average += integer;
            return average/list.size();
        }
    }

}
