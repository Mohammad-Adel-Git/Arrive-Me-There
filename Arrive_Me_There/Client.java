/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareproject;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Dell
 */
public class Client{

    private UserPersonalInfo Info;
    private boolean isSusbended;
    private Ride RequestRide;
    private String Notification;
   
     
    public void Client(UserPersonalInfo PersonalInfo){
        
        UserPersonalInfo input=new UserPersonalInfo();
        DataBase db=new DataBase();
        if(db.getInstance()==null){
        Info=PersonalInfo;
        db.addclient(this);
        
        }
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
  
        
        
    
        
    
    
        
     
  
    //  public void notifiyInterestedDrivers(){}
    
   /* public void rateDriver(Driver driver){
    
   
        
    Driver d=new Driver();
    d.addrate(Clien c);
    Scanner input=new Scanner(System.in);
    String rate=input.nextLine();
    
    
    }*/
    //public void showDriverRate(Driver driver){}
   //public void update(){}
    public void changeSuspendState(boolean status){
        if (status==true){
        
        isSusbended=true;
        System.out.println("you are suspended");
        
        }
        else
        {
            isSusbended=false;
        }

    }
    
    public void displaynotfication( ){}
 

    

}
    
    
    


    

    
    
    
    
   