package arrive_me_there;

import java.util.ArrayList;

public class Driver {

    private UserPersonalInfo info;
    private DB connection = DB::getInstance
    ();
    private String drivingLicense;
    private String nationalID;
    private ArrayList<String> favouriteAreas;
    private boolean isSuspended = false;
    private boolean isVerifyed = false;
    private ArrayList<Rate> userRatings;
    private float averageRate;
    private ArrayList<String> notificationList;

    public Driver(UserPersonalInfo personalInfo, String drivingLicense, String nationalID) {
        info = personalInfo;
        this.drivingLicense = drivingLicense;
        this.nationalID = nationalID;
    }

    public void addFavouriteArea(String area) {
        favouriteAreas.add(area);
    }

    public ArrayList<Ride> getRidesRequestsMatchedWithFavoriteArea(String area) {

    }

    public void addRate(Client client, RateValue rateValue) {
        Rate rate = new Rate(client, rateValue);
        userRatings.add(rate);
        evaluateAverageRate();
    }

    public void evaluateAverageRate() {
        float sum = 0;
        for (Rate rate : userRatings) {
            sum += rate.getRateValue().getValue();
        }
        averageRate = sum / userRatings.size();
    }

    public float getAverageRatings() {
        return averageRate;
    }

    public void suggestOffer(Ride ride) {

    }

    public void notifyClientOwner() {

    }

    public void addNotification(String notification) {
        notificationList.add(nationalID);
    }

    public void changeSuspendedState(boolean state) {
        isSuspended = state;
    }

    public void makeVerifyed() {
        isVerifyed = true;
    }

    public void displayNotification() {
        for (String notification : notificationList) {
            System.out.println(notification + "\n" + "-------------------");
        }
    }
    public ArrayList<Rate> getUserRatings() {
        return userRatings;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public String getNationalID() {
        return nationalID;
    }
    public boolean getSuspendState(){
        return isSuspended;
    }
    public boolean getVerifyState(){
        return isVerifyed;
    }
    
    public ArrayList <String> getFavouriteArea(){
        return favouriteAreas;
    }
}
