package arrive_me_there;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Eng.Mohamed
 */
public class Arrive_Me_There {

    public static void main(String[] args) {
        DB connection = DB.getInstance();
        Stranger guy=new Stranger();
        System.out.println("Login For Initial Admin.");

        Scanner inp1 = new Scanner(System.in);
        Scanner inp2 = new Scanner(System.in);
        Scanner inp3 = new Scanner(System.in);
        Scanner inp4 = new Scanner(System.in);
        System.out.print("enter your name :");
        String userName1 = inp1.next();
        System.out.print("enter your password :");
        String password1 = inp2.next();
        System.out.print("enter your email :");
        String email1 = inp3.next();
        System.out.print("enter your phone number :");
        String phoneNumber1 = inp4.next();
        UserPersonalInfo adminUser = UserPersonalInfo.createUserInfoWithEmail(userName1, phoneNumber1, email1, password1);
        //adminUser.createUserInfoWithEmail(userName1, password1, email1, phoneNumber1);

        Admin mainAdmin = new Admin(adminUser);
        connection.addAdmin(mainAdmin);
        System.out.println("Login as 1-Add New Admin\n         2-Client\n         3-Driver\n         4-exit");
//        UserPersonalInfo user = UserPersonalInfo.createUserInfoWithEmail(userName1, phoneNumber1, email1, password1);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Scanner input5 = new Scanner(System.in);
        Scanner input6 = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        int choice = input.nextInt();
        while (true) {

            switch (choice) {
                case 1://admin
                    System.out.print("enter your name :");
                    String userName = input1.next();
                    System.out.print("enter your password :");
                    String password = input2.next();
                    System.out.print("enter your email :");
                    String email = input3.next();
                    System.out.print("enter your phone number :");
                    String phoneNumber = input4.next();
                    UserPersonalInfo.createUserInfoWithEmail(userName, password, email, phoneNumber);
                    //Admin admin = new Admin(user);
                    //admin.addNewAdmin(user);
                    break;
                case 2://client
                    System.out.print("enter your name :");
                    userName = input1.next();
                    System.out.print("enter your password :");
                    password = input2.next();
                    System.out.print("enter your email :");
                    email = input3.next();
                    System.out.print("enter your phone number :");
                    phoneNumber = input4.next();
                    System.out.println("1- requset ride\n"
                            + "2- offers \n"
                            + "3- finish ride \n"
                            + "4- logout");
                    UserPersonalInfo.createUserInfoWithEmail(userName, password, email, phoneNumber);
                    //Client client1=new Client(user);
                    //guy.registerAsClient(user);
                    break;
                case 3://driver
                    System.out.print("enter your name :");
                    userName = input1.next();
                    System.out.print("enter your password :");
                    password = input2.next();
                    System.out.print("enter your email :");
                    email = input3.next();
                    System.out.print("enter your phone number :");
                    phoneNumber = input4.next();
                    System.out.print("enter your phone number :");
                    String drivingLicense = input5.next();
                    System.out.print("enter your phone number :");
                    String nationalID = input6.next();
                    Driver driver1=new Driver(UserPersonalInfo.createUserInfoWithEmail(userName, phoneNumber, email, password), drivingLicense, nationalID);
                    System.out.println("1- add favourite areas\n"
                            + "2- available trips\n"
                            + "3- show users rate\n"
                            + "4- logout");
                    UserPersonalInfo.createUserInfoWithEmail(userName, password, email, phoneNumber);
//                    guy.registerAsDriver(user, drivingLicense, nationalID);
                    break;
                case 4:
                    exit(0);

            }
        }
    }

}
