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
public class Ride {
    private int id;
    private String source;
    private String destination;
    private Client client;
    private boolean isCompleted;
    private ArrayList<Offer> offerList;
     
    public void RideDetails(String Source,String Destination){
    
    this.source=source;
    this.destination=destination;
    
    }
    public String getsource(){
        
       return source;
       
    }
    public String getdestination(){
        
       
       return destination;
    }
    
    public static void addOffer(Offer offer){
    
    Offer input=new Offer();
    Offer off=input.add(offer);
    ArrayList<Offer> offerList=new  ArrayList<Offer>();
    offerList.add(off);
    
    }
    
    

   public void completed(boolean ride_finished){
   
   isCompleted=ride_finished;
   
   }
   public boolean ifcompleted(){
    return isCompleted;
    
    
    }

    
    
}
