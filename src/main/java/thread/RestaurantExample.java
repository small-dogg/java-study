package thread;

import thread.resturant.Cooker;
import thread.resturant.Customer;
import thread.resturant.Table;

public class RestaurantExample {
    public static void main(String[] args) throws Exception {
        Table table = new Table();

        new Thread(new Cooker(table), "COOK").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        Thread.sleep(10000);
        System.exit(0);
    }
}
