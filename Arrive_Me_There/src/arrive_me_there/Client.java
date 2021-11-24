
package arrive_me_there;

import java.util.ArrayList;


public class Client  {

    private DB connection = DB.getInstance();

    private UserPersonalInfo Info;
    private boolean isSusbended;
    private Ride RequestRide;
    private String Notification;
    private Rate rate;
    private ArrayList<String> notificationList;
        
    public Client(UserPersonalInfo PersonalInfo) {

        Info = PersonalInfo;
    }
    
    public UserPersonalInfo getInfo() {
        return Info;
    }

    public void requestRide(Ride ride) {
        connection.addRide(ride);
        notifiyInterestedDrivers(ride);
    }

    public void notifiyInterestedDrivers(Ride ride) {
        for (Driver driver : connection.getDriverList()){
            for (String area : driver.getFavouriteArea()){
                if (area.equalsIgnoreCase(ride.getsource()));
                String notification = "A Client called" + ride.getClient().getInfo().getUserName() +
                                        "requests Ride from " + ride.getsource() + "to " + ride.getdestination()+
                                        "and his phoneNumber: " + ride.getClient().getInfo().getMobileNumber();
                driver.addNotification(notification);
            }
        }
    }
    
    public void rateDriver(Driver driver, RateValue rateValue) {
        Rate rate = new Rate(this, rateValue);        
        driver.addRate(rate);
    }

    public float getDriverRate(Driver driver) {
        return driver.getAverageRatings();
    }

    public void addNotification(String notification) {
        notificationList.add(notification);
    }

    public ArrayList <String> getNotificationList (){
        return notificationList;
    }
        
    public void changeSuspendState(boolean status) {

        isSusbended = status;
    }
    @Override
    public String toString(){
        
        return "******* Client Info **********\n" +
                 Info.toString();
        
    }

}
