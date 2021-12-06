package arrive_me_there;

import java.util.ArrayList;
import java.util.Iterator;

public class DB {

    private static DB instance;
    private ArrayList<Client> clientList;
    private ArrayList<Admin> adminList;
    private ArrayList<Driver> driverList;
    private ArrayList<Ride> rideList;

    private DB() {
        clientList = new ArrayList<Client>();
        adminList = new ArrayList<Admin>();
        driverList = new ArrayList<Driver>();
        rideList = new ArrayList<Ride>();
    }

    public static DB getInstance() {
        if (instance == null) {
            instance = new DB();
        }
        return instance;
    }

    public void addClient(Client client) {
        clientList.add(client);

    }

    public void addAdmin(Admin admin) {
        adminList.add(admin);
    }

    public void addDriver(Driver driver) {
        driverList.add(driver);
    }

    public void addRide(Ride ride) {
        rideList.add(ride);
    }
    
    public ArrayList<Client> getClientList() {
        return clientList;
    }

    public ArrayList<Admin> getAdminList() {
        return adminList;
    }

    public ArrayList<Driver> getDriverList() {
        return driverList;
    }

    public ArrayList<Ride> getRideList() {
        return rideList;
    }
    public Client checkClientExists(String userName, String password){
        for (Client client: clientList)
            if (userName.equals(client.getInfo().getUserName()) &&
                    password.equals(client.getInfo().getPassword()))
                return client;
        return null;
    }
    public Driver checkDriverExists(String userName, String password){
        for (Driver driver : driverList)
            if (userName.equals(driver.getInfo().getUserName()) &&
                    password.equals(driver.getInfo().getPassword()))
                return driver;
        return null;
    }
    
    public Admin checkAdminExists(String userName, String password){
        for (Admin admin : adminList)
            if (userName.equals(admin.getInfo().getUserName()) &&
                    password.equals(admin.getInfo().getPassword()))
                return admin;
        return null;
        
    }
    
    public Client getClient(String mobileNumber) {
        for (int i = 0; i < clientList.size(); i++) {
            if (mobileNumber.equals(clientList.get(i).getInfo().getMobileNumber())) {
                return clientList.get(i);
            }
        }
        return null;
    }

    public Admin getAdmin(String mobileNumber) {
        for (int i = 0; i < adminList.size(); i++) {
            if (mobileNumber.equals(adminList.get(i).getInfo().getMobileNumber())) {
                return adminList.get(i);
            }
        }
        return null;
    }

    public Driver getDriver(String mobileNumber) {

        for (int i = 0; i < driverList.size(); i++) {
            if (mobileNumber.equals(driverList.get(i).getInfo().getMobileNumber())) {
                return driverList.get(i);
            }
        }
        return null;

    }
    
//    public Driver getDriver(String mobileNumber) {
//        for (Driver driver : driverList)
//            if (driver.getInfo().getMobileNumber() == mobileNumber)
//                return driver;
//        return null
//    }
    
    public Ride getRide (int id){
        for (Ride ride : rideList){
            if (ride.getID() == id)
                return ride;
        }
        return null;
    }

}
