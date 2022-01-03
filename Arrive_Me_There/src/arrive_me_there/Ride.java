
package arrive_me_there;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;


public class Ride {    
    private Date RideDate = new Date();
    static int count = 0;
    private int id;
    private int numOfPassenger;
    private String source;
    private String destination;
    private Client client;
    private boolean isCompleted = false;
    private ArrayList<Offer> offerList;
    private Discount discount;
    
    
    public void Ride(String source, String destination, Client client,int numOfPassenger) {
        this.source = source;
        this.destination = destination;
        this.numOfPassenger=numOfPassenger;
        count++;
        id = count;
        calcDiscountValue();
    }
    
    public void calcDiscountValue(){
        discount.calcAreaDiscount(destination);
        discount.calcBithdayDiscount(client.getBirthday());
        LocalDate currentDate;
        currentDate = (new Date()).toInstant()
        .atZone(ZoneId.systemDefault()).toLocalDate();
        discount.calcHolidayDiscount(currentDate);
        discount.calcTwoPassengerDiscount(numOfPassenger);
        discount.calcFirstRideDiscount(client);
        discount.calcFinalDiscountValue();
    }

    public void setNumOfPassenger(int numOfPassenger) {
        this.numOfPassenger = numOfPassenger;
    }

    public int getNumOfPassenger() {
        return numOfPassenger;
    }
    
    public void setSource(String source){
        this.source = source;
    }
    
    public String getsource() {
        return source;
    }

    public String getdestination() {
        return destination;
    }

    public ArrayList<Offer> getOfferList() {
        return offerList;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void addOffer(Offer offer) {
        offer.setPriceWithDiscount(offer.getOriginalPrice() - discount.calcFinalDiscountValue() * offer.getOriginalPrice());
        offerList.add(offer);
    }
    
    public Discount getDiscount(){
        return discount;
    }
    
    public void completed(boolean ride_finished) {
        isCompleted = ride_finished;
    }

    public boolean ifcompleted() {
        return isCompleted;
    }  

}