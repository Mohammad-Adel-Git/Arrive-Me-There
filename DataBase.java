/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareproject;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class DataBase {
    private DataBase instance;
    private ArrayList<Client> clientList;
    private ArrayList<Ride> RideList;
    public DataBase getInstance(){
        if (instance==null){
          instance=new DataBase();
        
        }
            return instance;
    }
        public void addclient(Client client){
         ArrayList<Client> clientList=new  ArrayList<Client>();
         clientList.add(client);
         
         
    }
          public void addRide(Ride ride){
              ArrayList<Ride> clientList=new  ArrayList<Ride>();
             clientList.add(ride);
          
          }

    

    
}
