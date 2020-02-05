import Data.prevTripRatings;
import IO.TripOrder;
import IO.driversList;


import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        prevTripRatings ratings = new prevTripRatings();
        List<TripOrder> tripOrders = dummyData.getData();
        ratings.getAverage(tripOrders);

        String customers_name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customers name");
        customers_name = sc.nextLine();
        driversList list = ratings.getEligibleDrivers(customers_name);

        list.getList(list);

    }
}

