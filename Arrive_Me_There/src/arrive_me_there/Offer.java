
package arrive_me_there;


public class Offer {
    private Driver driver;
    private int originalPrice;
    private int priceWithDiscount;
    
    public Offer (Driver driver, int price){
    this.driver = driver;
    originalPrice = price;
    }
    
    public void setOriginalPrice(int price){
        originalPrice = price;
    }
    
    public int getOriginalPrice(){
        return originalPrice;
    }
    
    public void setPriceWithDiscount(int price){
        priceWithDiscount = price;
    }
    
    public void setDriver (Driver driver){
        this.driver = driver;
    }
    
    public Driver getDriver (){
        return driver;
    }
    
}