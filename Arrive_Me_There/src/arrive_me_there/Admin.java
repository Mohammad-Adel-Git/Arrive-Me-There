
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
    
    public void verify(Driver driver){
        driver.makeVerifyed();
    }
    
    public void suspend(Driver driver){
        driver.changeSuspendedState(true);
    }
    
    public ArrayList<Driver> listPendingDriver(){
        ArrayList<Driver> listDrivers=new ArrayList<>();
        listDrivers.add();//pass driver as parameter but from what
        return listDrivers;
        
    }
    
    public void addNewAdmin(UserPersonalInfo personalInfo){
        DataBase db=new DataBase();
        db.addAdmin(this);
    }
    
    @Override
    public String toString(){
        return adminPersonalInfo.toString();
        
    }
}
