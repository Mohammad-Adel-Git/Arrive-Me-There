package arrive_me_there;

public class Stranger {
    	public boolean registerwithemail(String userName,String mobileNumber,String email,String password,String type,DB mydata) {

    		if(type.equals("client")){
    			
    		}
    		
    		else if(type.equals("admin")){
    			
    			
    		}
    		
    		else if(type.equals("driver")){
    			
    			
    		}
    		
    	}	
	
	
    public boolean login(String userName,String password,String type,DB mydata) {
    	if(type.equals("client")){
    		Client c1=mydata.getClient(userName);
    		if (c1!=null && c1.getInfo().getPassword().equals(password) )
    			return true;
    	}
    	else if(type.equals("admin")){
    		Admin a1=mydata.getAdmin(userName);
    		if (a1!=null && a1.getInfo().getPassword().equals(password) )
    			return true;
    		
    	}
        else if(type.equals("driver")){
        	Driver d1=mydata.getDriver(userName);
    		if (d1!=null && d1.getinfo().getPassword().equals(password) )
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
