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
        Stranger guy = new Stranger();
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
        System.out.println("1-Register || 2-Login");
//        UserPersonalInfo user = UserPersonalInfo.createUserInfoWithEmail(userName1, phoneNumber1, email1, password1);
        Scanner input1 = new Scanner(System.in);
        String userName = input1.next();
        String password = input1.next();
        String email = input1.next();
        String phoneNumber = input1.next();
        boolean isloggin = false;
        int choice = input1.nextInt();
        int choice2 = input1.nextInt();
        while (true) {

            switch (choice) {
                case 1:
                    System.out.println("Register as 1-Client\n         2-Driver\n         3-exit");
                    switch (choice2) {
                        case 1://cleinr
                            System.out.print("enter your name :");
                            userName = input1.next();
                            System.out.print("enter your password :");
                            password = input1.next();
                            System.out.print("enter your email :");
                            email = input1.next();
                            System.out.print("enter your phone number :");
                            phoneNumber = input1.next();
                            System.out.println("1- requset ride\n"
                                    + "2- offers \n"
                                    + "3- finish ride \n"
                                    + "4- logout");
                            UserPersonalInfo cl = UserPersonalInfo.createUserInfoWithEmail(userName, phoneNumber, email, password);
                            guy.registerAsClient(cl);

                            break;
                        case 2://driver
                            System.out.print("enter your name :");
                            userName = input1.next();
                            System.out.print("enter your password :");
                            password = input1.next();
                            System.out.print("enter your email :");
                            email = input1.next();
                            System.out.print("enter your phone number :");
                            phoneNumber = input1.next();
                            System.out.print("enter your phone number :");
                            String drivingLicense = input1.next();
                            System.out.print("enter your phone number :");
                            String nationalID = input1.next();
                            System.out.println("1- add favourite areas\n"
                                    + "2- available trips\n"
                                    + "3- show users rate\n"
                                    + "4- logout");
                            UserPersonalInfo dr = UserPersonalInfo.createUserInfoWithEmail(userName, password, email, phoneNumber);
                            guy.registerAsDriver(dr, drivingLicense, nationalID);

                            break;
                        case 3:
                            exit(0);
                    }

                    break;
                case 2://login
                    System.out.println("Login as 1-Client\n         2-Driver\n         3-Admin\n        4-exit");

                    switch (choice2) {
                        case 1://client
                            System.out.print("enter your name :");
                            userName = input1.next();
                            System.out.print("enter your password :");
                            password = input1.next();

                            isloggin = guy.login(userName, password, "client");
                            break;
                        case 2://driver
                            System.out.print("enter your name :");
                            userName = input1.next();
                            System.out.print("enter your password :");
                            password = input1.next();

                            isloggin = guy.login(userName, password, "driver");
                            break;
                        case 3://admin
                            System.out.print("enter your name :");
                            userName = input1.next();
                            System.out.print("enter your password :");
                            password = input1.next();

                            isloggin = guy.login(userName, password, "admin");
                            break;
                    }
                    break;
                case 3:
                    exit(0);

            }
        }
    }

}
