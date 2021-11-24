package arrive_me_there;

import java.util.ArrayList;

public class Driver {

    private UserPersonalInfo info;
    private DB connection = DB.getInstance();    
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
    
    public ArrayList<Ride> getRidesRequestsMatchedWithFavoriteArea(String area) {
        ArrayList <Ride> rideList = new ArrayList<>();
        for (Ride ride : connection.getRideList())
            if (ride.getsource() == area)
                rideList.add(ride);
        return rideList;
    }

    public void addRate(Rate rate) {        
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

    public void suggestOffer(Ride ride, int price) {
        Offer offer = new Offer(this, price);
        ride.getOfferList().add(offer);
        notifyClientOwner(ride.getClient(), price);
    }

    public void notifyClientOwner(Client client, int price) {
        String notification = "A Driver" + this.getInfo().getUserName() + 
                                "offers " + price + "for your ride" +
                                "his phoneNumber: " + this.getInfo().getMobileNumber();
        client.addNotification(notification);
    }

    public void addNotification(String notification) {
        notificationList.add(notification);

    }

    public ArrayList<String> getNotificationList() {
        return notificationList;
    }

    public void addFavouriteArea(String area) {
        favouriteAreas.add(area);
    }
    
    public ArrayList<String> getFavouriteArea() {
        return favouriteAreas;
    }
    
    public void changeSuspendedState(boolean state) {
        isSuspended = state;
    }
    
    public boolean getSuspendState() {
        return isSuspended;
    }

    public void makeVerifyed() {
        isVerifyed = true;
    }

    public boolean getVerifyState() {
        return isVerifyed;
    }

    public ArrayList<Rate> getUserRatings() {
        return userRatings;
    }

    public float getAverageRatings() {
        return averageRate;
    }
    
    ///////// Setters and getters for driver Info ////////////
    public void setInfo(UserPersonalInfo info, String license, String nationalID){
        this.info = info;
        this.drivingLicense = license;
        this.nationalID = nationalID;
    }
    
    public UserPersonalInfo getInfo(){
        return info;
    }
    
    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }
    
    public String getDrivingLicense() {
        return drivingLicense;
    }
    public void setNatinalID (String paramNationalID){
        nationalID = paramNationalID;
    }
    public String getNationalID() {
        return nationalID;
    }
    @Override
    public String toString(){
        return info.toString();
        
    }
}
