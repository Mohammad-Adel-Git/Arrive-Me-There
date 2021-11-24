package arrive_me_there;

public class UserPersonalInfo {
	private String userName;
	private String mobileNumber;
	private String email ;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public String getMobileNumber() {
		return mobileNumber;
	}

	
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
    private void UserInfowithemail(String userName, String mobileNumber, String email, String password) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.password = password;
		
	}
	
	private void  UserInfowithoutemail(String userName,String mobileNumber,String password) {
		this.userName=userName;
		this.mobileNumber=mobileNumber;
		this.password=password;
		
	}
	
	public void createUserInfoWithEmail(String userName,String mobileNumber,String email,String password) {
		this.userName=userName;
		this.mobileNumber=mobileNumber;
		this.email=email;
		this.password=password;
        this.UserInfowithemail(userName, mobileNumber, email, password);
		
	}
	
	public void createUserInfoWithoutEmail(String userName,String mobileNumber,String password) {
		this.userName=userName;
		this.mobileNumber=mobileNumber;
		this.password=password;
        this.UserInfowithoutemail(userName, mobileNumber, password);
		
	}
    @Override
    public String toString() {
        return "******* User Info **********" +
                "\nUser Name: " + userName +
                "\nmobile Number: " + mobileNumber + 
                "\nemail " + email ;                
    }
	
	
	
	
	

}
