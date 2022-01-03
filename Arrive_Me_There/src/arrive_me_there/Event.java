package arrive_me_there;

import java.util.ArrayList;
import java.util.Date;

public class Event {

    //private String Eventname;
    //private Date date;
    //private int price;
    //private String clientName;
    //private String driverName;
    //private Ride ride;
    // private ArrayList<Event> eventList;
    Client client;
    Driver driver;

    void displayCaptinPutPriceEvent() {
        for (int i = 0; i < driver.getcaptinpriceList().size(); i++) {
            System.out.println(driver.getcaptinpriceList().get(i));
        }
    }

    void displaydestinationeEvent() {

        for (int i = 0; i < driver.getdestinationList().size(); i++) {
            System.out.println(driver.getdestinationList().get(i));
        }
    }

    void displaylocationEvent() {

        for (int i = 0; i < driver.getlocationList().size(); i++) {
            System.out.println(driver.getlocationList().get(i));
        }
    }

    void displayUserEvent() {
        for (int i = 0; i < client.getUserAcceptList().size(); i++) {
            System.out.println(client.getUserAcceptList().get(i));
        }
    }
}
