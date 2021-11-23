package arrive_me_there;

import java.util.ArrayList;

public class Driver {

    private UserPersonalInfo info;
    private String drivingLicense;
    private String nationalID;
    private ArrayList<String> favouriteAreas;
    private boolean isSuspended = false;
    private boolean isVerifyed = false;
    private ArrayList<Rate> userRatings;
    private float averageRate;
    private String notification;

    public Driver(UserPersonalInfo personalInfo, String drivingLicense, String nationalID) {
        info = personalInfo;
        this.drivingLicense = drivingLicense;
        this.nationalID = nationalID;
    }

    public void addFavouriteArea(String area) {
        favouriteAreas.add(area);
    }

    public ArrayList<Ride> listRidesRequestsMatchedWithFavoriteArea(String area) {

    }

    public void listUserRatings() {
        for (Rate rate : userRatings) {
            System.out.println(rate);
        }
    }

    public void addRate(RateValue rate, Client client) {

    }

    public void evaluateAverageRate() {

    }

    public float getAverageRatings() {
        return averageRate;
    }

    public void suggestOffer(Ride ride) {

    }

    public void notifyClientOwner() {

    }

    public void changeSuspendedState(boolean state) {
        isSuspended = state;
    }

    public void makeVerifyed() {
        isVerifyed = true;
    }

    public void displayNotification() {

    }
}
