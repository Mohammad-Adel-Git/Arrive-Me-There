package arrive_me_there;

import java.util.ArrayList;

public class Admin {

    DB connection = DB.getInstance();
    private Event event;
    ArrayList<String> notificationList;
    private UserPersonalInfo adminPersonalInfo;

    public void addnotification(String notification) {
        notificationList.add(notification);
    }

    public void addDiscountArea(String area) {
        connection.getDiscountArea().add(area);
    }

    public ArrayList<String> getNotificationList() {
        return notificationList;
    }

    public Admin(UserPersonalInfo adminPersonalInfo) {
        this.adminPersonalInfo = adminPersonalInfo;
    }

    public void verify(Driver driver) {
        driver.makeVerifyed();
    }

    public void suspend(Driver driver) {
        driver.changeSuspendedState(true);
    }

    public ArrayList<Driver> listPendingDriver() {
        ArrayList<Driver> listDrivers = new ArrayList<>();
        DB db = DB.getInstance();
        listDrivers = db.getDriverList();
        return listDrivers;
    }

    public void addNewAdmin(UserPersonalInfo personalInfo) {
        DB db = DB.getInstance();
        Admin admin = new Admin(personalInfo);
        db.addAdmin(admin);
    }

    @Override
    public String toString() {
        return "******* Admin Info **********\n"
                + adminPersonalInfo.toString();

    }

    public UserPersonalInfo getInfo() {
        return adminPersonalInfo;
    }
}