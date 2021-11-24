/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrive_me_there;
import java.util.ArrayList;



/**
 *
 * @author Dell
 */
public class Client implements User{
    private DB connection = DB::getInstance();

    private UserPersonalInfo Info;
    private boolean isSusbended;
    private Ride RequestRide;
    private String Notification;
    private Rate rate;
    private ArrayList<String> notificationList;
   
   
     @Override
     public void logout(){
     
     
     
     
     }
    public  Client(UserPersonalInfo PersonalInfo){
        
          Info=PersonalInfo;
  }
    
    public UserPersonalInfo getinfo(){
        return Info;

    }
        public boolean requestRide(Ride request){
      
            if(this.RequestRide==request)
            {
                System.out.println("you requested a ride  add source and destination");
                Ride ride=new Ride();
                ride.RideDetails(request.getsource(), request.getdestination()); 
            
            }

            return true;
                   
}
        
        
    
     
  
      public void notifiyInterestedDrivers(String area){
          
          Driver d=new Driver();
          ArrayList<Ride> found=d.listRidesRequestsMatchedWithFavoriteArea(area);
          if(found.contains(area))
              
          {
              System.out.println("a client matched with your place");
              d.displayNotification();


          }
        

}
        
        
        
    
         public void rateDriver(Driver driver){
             Rate r=new Rate();
            // Driver d=new Driver();
             driver.addRate(r.getRate(), r.getClient());

         }
        
 
    public void showDriverRate(Driver driver){
        
        driver.listUserRatings();    
    }
         
         
         
         
  
   public void addnotification(String notification) {
        notificationList.add(notification);
    }

         
         
         
    public void changeSuspendState(boolean status){
       
        isSusbended=status;
          }
    
    
    
   
    public void displayNotification() {
        for (String notification : notificationList) {
            System.out.println(notification + "\n" + "-------------------");
        }
    }

    

}
    
    
    


    

    
    
    
    
   