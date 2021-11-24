package arrive_me_there;

public class Stranger {
	public boolean registerwithemail(String userName, String mobileNumber, String email, String password, String type,
			DB mydata,String drivingLicense, String nationalID) {

		if (type.equals("client")) {
			if (mobileNumber.equals(mydata.getClient(mobileNumber))) {
				return false;
			}
			UserPersonalInfo info = new UserPersonalInfo();
			info.createUserInfoWithEmail(userName, mobileNumber, email, password);
			Client c1 = new Client(info);
			mydata.addClient(c1);
			return true;

		}

		else if (type.equals("admin")) {
			if (mobileNumber.equals(mydata.getAdmin(mobileNumber))) {
				return false;
			}
			UserPersonalInfo info = new UserPersonalInfo();
			info.createUserInfoWithEmail(userName, mobileNumber, email, password);
			Admin a1 = new Admin(info);
			mydata.addClient(a1);
			return true;
		}

		else if (type.equals("driver")) {
			if (mobileNumber.equals(mydata.getDriver(mobileNumber))) {
				return false;
			}
			UserPersonalInfo info = new UserPersonalInfo();
			info.createUserInfoWithEmail(userName, mobileNumber, email, password);
			Driver d1 = new Driver(info,drivingLicense,nationalID);
			mydata.addDriver(d1);
			return true;

		}
		return false;
	}
	
	
	public boolean registerwithoutemail(String userName, String mobileNumber, String password, String type,
			DB mydata,String drivingLicense, String nationalID) {

		if (type.equals("client")) {
			if (mobileNumber.equals(mydata.getClient(mobileNumber))) {
				return false;
			}
			UserPersonalInfo info = new UserPersonalInfo();
			info.createUserInfoWithoutEmail(userName, mobileNumber, password);
			Client c1 = new Client(info);
			mydata.addClient(c1);
			return true;

		}

		else if (type.equals("admin")) {
			if (mobileNumber.equals(mydata.getAdmin(mobileNumber))) {
				return false;
			}
			UserPersonalInfo info = new UserPersonalInfo();
			info.createUserInfoWithoutEmail(userName, mobileNumber, password);
			Admin a1 = new Admin(info);
			mydata.addClient(a1);
			return true;
		}

		else if (type.equals("driver")) {
			if (mobileNumber.equals(mydata.getDriver(mobileNumber))) {
				return false;
			}
			UserPersonalInfo info = new UserPersonalInfo();
			info.createUserInfoWithoutEmail(userName, mobileNumber, password);
			Driver d1 = new Driver(info,drivingLicense,nationalID);
			mydata.addDriver(d1);
			return true;

		}
		return false;
	}
	
	

	public boolean login(String userName, String password, String type, DB mydata) {
		if (type.equals("client")) {
			Client c1 = mydata.getClient(userName);
			if (c1 != null && c1.getInfo().getPassword().equals(password))
				return true;
		} else if (type.equals("admin")) {
			Admin a1 = mydata.getAdmin(userName);
			if (a1 != null && a1.getInfo().getPassword().equals(password))
				return true;

		} else if (type.equals("driver")) {
			Driver d1 = mydata.getDriver(userName);
			if (d1 != null && d1.getinfo().getPassword().equals(password))
				return true;

		}

		else {
			System.out.println("Invalid type");
			return false;
		}
		System.out.println("Invalid UserName or Password");
		return false;

	}

}

