package arrive_me_there;

public class Stranger {

    DB connection = DB.getInstance();

    public boolean registerAsClient(UserPersonalInfo info) {
        if (connection.getClient(info.getMobileNumber()) == null) {
            Client client = new Client(info);
            connection.addClient(client);
            return true;
        }

        return false;
    }

    public boolean registerAsDriver(UserPersonalInfo info, String drivingLicense, String nationalID) {
        if (connection.getDriver(info.getMobileNumber()) == null) {
            Driver driver = new Driver(info, drivingLicense, nationalID);
            connection.addDriver(driver);
            return true;
        }
        return false;
    }

    public boolean login(String userName, String password, String type) {
        if (type.equalsIgnoreCase("client")) {
            if (connection.checkClientExists(userName, password) == null)
                return false;
            else
                return true;
        } else if (type.equals("admin")) {
            if (connection.checkAdminExists(userName, password) == null)
                return false;
            return true;

        } else if (type.equals("driver")) {
            if (connection.checkDriverExists(userName, password) == null)
                return false;
            return true;

        } else {
            System.out.println("Invalid type");
            return false;
        }        
    }

}