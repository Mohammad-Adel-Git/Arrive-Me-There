package arrive_me_there;

import java.util.ArrayList;
import java.util.Iterator;

public class DB {
	
	private ArrayList<Client> clientList;
	private ArrayList<Admin> adminList;
	private ArrayList<Driver> driverList;
	private ArrayList<Ride> rideList;
	
	DB(){
	clientList=new ArrayList<Client>();
	adminList=new ArrayList<Admin>();
	driverList=new ArrayList<Driver>();
	rideList=new ArrayList<Ride>();
	}
	public void addClient(Client client) {
		this.clientList.add(client);
			
	}
	public void addAdmin(Admin admin) {
		this.adminList.add(admin);
	}
	public void addDriver(Driver driver) {
		this.driverList.add(driver);
	}
	public void addRide (Ride ride) {
		this.rideList.add(ride);
	}
	public Client getClient(String username) {
		 for (int i = 0; i < clientList.size(); i++) {
			if(username.equals(clientList.get(i).getInfo().getUserName())) {
				return clientList.get(i);
			}
		}
		 return null;
	}
	public Admin getAdmin(String username) {
		 for (int i = 0; i < adminList.size(); i++) {
				if(username.equals( adminList.get(i).getInfo().getUserName())) {
					return  adminList.get(i);
				}
			}
			 return null;
	}
	public Driver getDriver(String username) {
		
		 for (int i = 0; i < driverList.size(); i++) {
				if(username.equals(driverList.get(i).getinfo().getUserName())) {
					return driverList.get(i);
				}
			}
			 return null;
		
	}
	public ArrayList<Ride> getRideList() {
		return rideList;
	}
	
	
	

}
