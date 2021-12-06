package arrive_me_there;

import java.util.ArrayList;

public class Ride {

    static int count = 0;
    private int id;
    private String source;
    private String destination;
    private Client client;
    private boolean isCompleted = false;
    private ArrayList<Offer> offerList;

    public void Ride(String Source, String Destination, Client client) {
        this.source = source;
        this.destination = destination;
        count++;
        id = count;
    }

    public void setSource(String source) {
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
        offerList.add(offer);
    }

    public void completed(boolean ride_finished) {
        isCompleted = ride_finished;
    }

    public boolean ifcompleted() {
        return isCompleted;
    }

}
