
package arrive_me_there;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.time.DayOfWeek;

public class Discount {
    private DB connection = DB.getInstance();
    private int finalDiscountValue = 0;
    private int areaDiscount = 0;
    private int holidayDiscount = 0;
    private int birthdayDiscount = 0;
    private int twoPassengerDiscount = 0;
    private int firstRideDiscount = 0;
    
    
    
    // setters and getter of Attibutes //
    public int calcFinalDiscountValue(){
        finalDiscountValue =  areaDiscount + holidayDiscount + birthdayDiscount + twoPassengerDiscount + firstRideDiscount;
        return finalDiscountValue;
    }
    
    public void calcAreaDiscount(String area){
        for (String discountArea : connection.getDiscountArea()){
            if (area.equalsIgnoreCase(discountArea)){
                areaDiscount = 10;
                break;
            }
        }
    }
    
    public int getAreaDiscount(){
        return areaDiscount;
    }
    
    public void calcHolidayDiscount(LocalDate localDate){
        DayOfWeek dow = localDate.getDayOfWeek();
        if (dow == DayOfWeek.SATURDAY || dow == DayOfWeek.SUNDAY)
            holidayDiscount = 5;
    }
    
    public int getHolidayDiscount(){
        return holidayDiscount;
    }
    
    public void calcBithdayDiscount(Date clientBirthdayDate){
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMDD");
        if (formatter.format(currentDate).equals(formatter.format(clientBirthdayDate)))
            birthdayDiscount = 10;        
    }
    
    public int getBirthdayDiscoutn(){
        return birthdayDiscount;
    }
    
    public void calcTwoPassengerDiscount(int passengerNum){
        if (passengerNum >= 2)
            twoPassengerDiscount = 5;
    }
    
    public int getTwoPassengerDiscount(){
        return twoPassengerDiscount;
    }
    
    public void calcFirstRideDiscount(Client client){
        if (client.checkIfFirstRide())
            firstRideDiscount = 10;
    }
}
