package arrive_me_there;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Eng.Mohamed
 */
public class Arrive_Me_There {

    public static void main(String[] args) {
        System.out.println("Login as 1-Admin\n         2-Client\n         3-Driver\n         4-exit");
        UserPersonalInfo user = new UserPersonalInfo();
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
        Scanner input4 = new Scanner(System.in);
        Admin admin = new Admin(user);
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        while (true) {

            switch (choice) {
                case 1:
                    System.out.println("enter your name");
                    String userName = input1.next();
                    System.out.println("enter your password");
                    String password = input2.next();
                    System.out.println("enter your email");
                    String email = input3.next();
                    System.out.println("enter your phone number");
                    String phoneNumber = input4.next();

                    user.createUserInfoWithEmail(userName, password, email, phoneNumber);
                    admin.addNewAdmin(user);
                    break;
                case 2:
                    System.out.println("enter your name");

                    userName = input1.next();
                    System.out.println("enter your password");

                    password = input2.next();
                    System.out.println("enter your email");

                    email = input3.next();
                    System.out.println("enter your phone number");

                    phoneNumber = input4.next();

                    user.createUserInfoWithEmail(userName, password, email, phoneNumber);
                    //client
                    break;
                case 3:
                    System.out.println("enter your name");

                    userName = input1.next();
                    System.out.println("enter your password");

                    password = input2.next();
                    System.out.println("enter your email");

                    email = input3.next();
                    System.out.println("enter your phone number");

                    phoneNumber = input4.next();

                    user.createUserInfoWithEmail(userName, password, email, phoneNumber);
                    //driver
                    break;
                case 4:
                    exit(0);
                    break;

            }
        }
    }

}
