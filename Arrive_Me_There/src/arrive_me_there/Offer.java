
package arrive_me_there;


public class Offer {
    public Offer (Driver driver, int price){
    this.driver = driver;
    this.price = price;
    }
    private int price;
    private Driver driver;
    public void setPrice(int price){
        this.price = price;
    }
    
    public int getPrice(){
        return price;
    }
    
    public void setDriver (Driver driver){
        this.driver = driver;
    }
    public Driver getDriver (){
        return driver;
    }
    
}
