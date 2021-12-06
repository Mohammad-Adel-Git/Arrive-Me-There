package arrive_me_there;

public class Stranger {

    DB connection = DB.getInstance();

    public boolean registerAsClient(UserPersonalInfo info) {

        if (mobileNumber.equals(connection.getClient(mobileNumber))) {
            return false;
        }
        UserPersonalInfo info = new UserPersonalInfo();
        info.createUserInfoWithEmail(userName, mobileNumber, email, password);
        Client c1 = new Client(info);
        connection.addClient(c1);
        return true;
    }

    public boolean registerAsDriver(UserPersonalInfo info, String drivingLicense, String nationalID) {
        if (mobileNumber.equals(connection.getDriver(mobileNumber))) {
            return false;
        }
        UserPersonalInfo info = new UserPersonalInfo();
        info.createUserInfoWithoutEmail(userName, mobileNumber, password);
        Driver d1 = new Driver(info, drivingLicense, nationalID);
        connection.addDriver(d1);
        return true;

    }

    public boolean login(String userName, String password, String type, DB connection) {
        if (type.equals("client")) {
            Client c1 = connection.getClient(userName);
            if (c1 != null && c1.getInfo().getPassword().equals(password)) {
                return true;
            }
        } else if (type.equals("admin")) {
            Admin a1 = connection.getAdmin(userName);
            if (a1 != null && a1.getInfo().getPassword().equals(password)) {
                return true;
            }

        } else if (type.equals("driver")) {
            Driver d1 = connection.getDriver(userName);
            if (d1 != null && d1.getInfo().getPassword().equals(password)) {
                return true;
            }

        } else {
            System.out.println("Invalid type");
            return false;
        }
        System.out.println("Invalid UserName or Password");
        return false;

    }

}
