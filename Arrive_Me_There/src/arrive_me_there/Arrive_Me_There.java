package arrive_me_there;

import static java.lang.System.exit;
import java.util.Scanner;


public class Arrive_Me_There {

    public static void main(String[] args) {
        DB connection = DB.getInstance();
        Stranger guy = new Stranger();
        System.out.println("Login For Initial Admin.");

        Scanner inp1 = new Scanner(System.in);
        System.out.print("enter your name :");
        String userName1 = inp1.next();
        System.out.print("enter your password :");
        String password1 = inp1.next();
        System.out.print("enter your email :");
        String email1 = inp1.next();
        System.out.print("enter your phone number :");
        String phoneNumber1 = inp1.next();
        UserPersonalInfo adminUser = UserPersonalInfo.createUserInfoWithEmail(userName1, phoneNumber1, email1, password1);
        //adminUser.createUserInfoWithEmail(userName1, password1, email1, phoneNumber1);

        Admin mainAdmin = new Admin(adminUser);
        connection.addAdmin(mainAdmin);
        System.out.println("1-Register || 2-Login");
//        UserPersonalInfo user = UserPersonalInfo.createUserInfoWithEmail(userName1, phoneNumber1, email1, password1);
        String userName;
        String password;
        String email;
        String phoneNumber;
        boolean isloggin = false;
        int choice = inp1.nextInt();
        int choice2;
        while (true) {

            switch (choice) {
                case 1:
                    System.out.println("Register as 1-Client\n         2-Driver\n         3-exit");
                    choice2 = inp1.nextInt();
                    switch (choice2) {
                        case 1://cleinr
                            System.out.print("enter your name :");
                            userName = inp1.next();
                            System.out.print("enter your password :");
                            password = inp1.next();
                            System.out.print("enter your email :");
                            email = inp1.next();
                            System.out.print("enter your phone number :");
                            phoneNumber = inp1.next();
                            UserPersonalInfo cl = UserPersonalInfo.createUserInfoWithEmail(userName, phoneNumber, email, password);
                            if (guy.registerAsClient(cl)) {
                                System.out.println("you registered successfully");
                                while (true) {
                                    System.out.println("1- requset ride\n"
                                            + "2- offers \n"
                                            + "3- finish ride \n"
                                            + "4- logout");
                                    String clientChoice = inp1.next();
                                }
                            }
                            break;
                        case 2://driver
                            System.out.print("enter your name :");
                            userName = inp1.next();
                            System.out.print("enter your password :");
                            password = inp1.next();
                            System.out.print("enter your email :");
                            email = inp1.next();
                            System.out.print("enter your phone number :");
                            phoneNumber = inp1.next();
                            System.out.print("enter your phone driving Licence :");
                            String drivingLicense = inp1.next();
                            System.out.print("enter your national ID :");
                            String nationalID = inp1.next();
                            UserPersonalInfo dr = UserPersonalInfo.createUserInfoWithEmail(userName, phoneNumber, email, password);
                            if (guy.registerAsDriver(dr, drivingLicense, nationalID)) {
                                while (true) {
                                    System.out.println("1- add favourite areas\n"
                                            + "2- available trips\n"
                                            + "3- show users rate\n"
                                            + "4- logout");
                                    String driverChoice = inp1.next();
                                }
                            }

                            break;
                        case 3:
                            exit(0);
                    }

                    break;
                case 2://login
                    System.out.println("Login as 1-Client\n         2-Driver\n         3-Admin\n        4-exit");
                    choice2 = inp1.nextInt();

                    switch (choice2) {
                        case 1://client
                            System.out.print("enter your name :");
                            userName = inp1.next();
                            System.out.print("enter your password :");
                            password = inp1.next();

                            isloggin = guy.login(userName, password, "client");
                            break;
                        case 2://driver
                            System.out.print("enter your name :");
                            userName = inp1.next();
                            System.out.print("enter your password :");
                            password = inp1.next();

                            isloggin = guy.login(userName, password, "driver");
                            break;
                        case 3://admin
                            System.out.print("enter your name :");
                            userName = inp1.next();
                            System.out.print("enter your password :");
                            password = inp1.next();

                            if (guy.login(userName, password, "admin")) {
                                System.out.println("you logined successfully");
                                while (true) {
                                    System.out.println("1- add new admin\n"
                                            + "2- suspend user\n"
                                            + "3- list pending Drivers\n"
                                            + "4- verify Driver\n");
                                    String adminChoice = inp1.next();
                                }
                            }
                            break;
                    }
                    break;
                case 3:
                    exit(0);

            }
        }
    }

}
