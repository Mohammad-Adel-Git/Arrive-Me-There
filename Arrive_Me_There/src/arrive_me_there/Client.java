package arrive_me_there;

import java.util.ArrayList;
import java.util.Date;

public class Client {

    private DB connection = DB.getInstance();
    private UserPersonalInfo Info;
    private boolean isSusbended;
    private Ride RequestRide;
    private String Notification;
    private Rate rate;
    private ArrayList<String> notificationList;
    private ArrayList<String> UserAcceptlist;
    private float balance;
    private Date birthDay;
    private boolean isFirstRide = true;
    Admin admin;

    public ArrayList<String> getUserAcceptList() {

        return UserAcceptlist;
    }

    public void UserAcceptPrice(Offer offer) {

        String event = "user accepted the price offered " + "with Date: " + new Date().toString() +
                "  client: " + getInfo().getUserName()
                + "accepts " + offer.getOriginalPrice() + "for the ride";
        UserAcceptlist.add(event);
        String notify = "User accepted price ";
        admin.addnotification(notify);

    }

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
        for (Driver driver : connection.getDriverList()) {
            for (String area : driver.getFavouriteArea()) {
                if (area.equalsIgnoreCase(ride.getsource()) && driver.getAvailableState());
                String notification = "A Client called" + ride.getClient().getInfo().getUserName()
                        + "requests Ride from " + ride.getsource() + "to " + ride.getdestination()
                        + "and his phoneNumber: " + ride.getClient().getInfo().getMobileNumber();
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

    public ArrayList<String> getNotificationList() {
        return notificationList;
    }

    public void changeSuspendState(boolean status) {

        isSusbended = status;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }
    
    public void setBirhday(Date date){
        birthDay = date;
    }
    
    public Date getBirthday(){
        return birthDay;
    }
    
    public boolean checkIfFirstRide(){
        return isFirstRide;
    }
    
    public void changeFirstRideState(){
        isFirstRide = false;
    }
    
    @Override
    public String toString() {

        return "******* Client Info **********\n"
                + Info.toString();

    }
}