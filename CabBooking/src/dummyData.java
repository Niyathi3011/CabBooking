import IO.TripOrder;

import java.util.ArrayList;
import java.util.List;

public class dummyData {

    public static List<TripOrder> getData(){

        List<TripOrder> tripOrder=new ArrayList<>();

        tripOrder.add(new TripOrder("d1",4,"c1",5));
        tripOrder.add(new TripOrder("d1",5,"c2",4));
        tripOrder.add(new TripOrder("d1",1,"c3",2));
        tripOrder.add(new TripOrder("d2",5,"c1",1));
        tripOrder.add(new TripOrder("d2",5,"c2",5));
        tripOrder.add(new TripOrder("d2",4,"c3",5));
        tripOrder.add(new TripOrder("d3",3,"c1",2));
        tripOrder.add(new TripOrder("d3",4,"c2",5));
        tripOrder.add(new TripOrder("d3",3,"c3",3));

        return tripOrder;
    }
}
