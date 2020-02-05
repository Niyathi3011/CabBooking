package Data;

import IO.DriversList;
import IO.TripOrder;

import IO.EligibleDrivers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrevTripRatings {


    private final Map<String,List<Integer>>customerAvg;
    private final Map<String,List<Integer>>driverAvg;
    private final List<EligibleDrivers> eligibleDriversList;

    public PrevTripRatings() {

        this.driverAvg=new HashMap<>();
        this.eligibleDriversList=new ArrayList<>();
        this.customerAvg=new HashMap<>();
    }

    public void getAverage(List<TripOrder> tripOrders){

            for(TripOrder tripOrder:tripOrders){

                if (!customerAvg.containsKey(tripOrder.getCustomersName())) {
                    customerAvg.put(tripOrder.getCustomersName(),new ArrayList<>());
                }

                customerAvg.get(tripOrder.getCustomersName()).add(tripOrder.getCustomersRating());

                if(!driverAvg.containsKey(tripOrder.getDriversName()))
                    driverAvg.put(tripOrder.getDriversName(),new ArrayList<>());

                driverAvg.get(tripOrder.getDriversName()).add(tripOrder.getDriversRating());

            }
    }

    public DriversList getEligibleDrivers(String customersName){

        for(String name: driverAvg.keySet()){

            if(avg(driverAvg.get(customersName))>avg(customerAvg.get(name))){

                eligibleDriversList.add(new EligibleDrivers(name,avg(customerAvg.get(name))));
            }
        }

        return new DriversList(customersName,avg(customerAvg.get(customersName)),eligibleDriversList);


    }

    private static double avg(List<Integer>list) {

            double average = 0.0;
            for(Integer integer:list) average += integer;
            return average/list.size();
        }
    }

}
