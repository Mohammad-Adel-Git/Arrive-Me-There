
package arrive_me_there;

import java.util.ArrayList;

/**
 *
 * @author Eng.Mohamed
 */
public class Admin {
    private UserPersonalInfo adminPersonalInfo;

    public Admin(UserPersonalInfo adminPersonalInfo) {
        this.adminPersonalInfo = adminPersonalInfo;
    }
    
    public boolean verify(Driver driver){
        return driver.getVerifyState();
    }
    
    public void suspend(Driver driver){
        driver.changeSuspendedState(true);
    }
    
    public ArrayList<Driver> getPendingDriver(){
       DB dbDriver=DB.getInstance();
       ArrayList<Driver> listDrivers=new ArrayList<>();
       listDrivers= dbDriver.getDriverList();
        return listDrivers;
        
    }
    
    public void addNewAdmin(UserPersonalInfo personalInfo){
        DB db=DB.getInstance();
        db.addAdmin(this);
    }
    
    @Override
    public String toString(){
        return adminPersonalInfo.toString();
        
    }
}
