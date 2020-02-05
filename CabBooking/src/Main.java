import Data.PrevTripRatings;

import IO.DriversList;
import IO.TripOrder;



import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PrevTripRatings ratings = new PrevTripRatings();
        List<TripOrder> tripOrders = DummyData.getData();
        ratings.getAverage(tripOrders);

        String customersName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customers name");
        customersName = sc.nextLine();
        DriversList list = ratings.getEligibleDrivers(customersName);

        list.getList(list);

    }
}

