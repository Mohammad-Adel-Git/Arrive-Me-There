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
public class Offer {
    private int price;
   // private Driver driver;
    Offer add(Offer offer){
    Offer of=new Offer();
    of.price=offer.price;
    return of;
    }
    
}
