import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class MySession {

    HashSet<Hotels> premiumhotellist;
    ArrayList<Hotels> localHotelList;
    Scanner scanner=new Scanner(System.in);
    String response;
    boolean loginStatus=false;
    MySession(HashSet<Hotels> premiumhotellist, ArrayList<Hotels> localHotelList) {
        this.premiumhotellist=premiumhotellist;
        this.localHotelList=localHotelList;
    }

    public void mySession() {
            System.out.println();



            String name = scanner.nextLine();
            System.out.print("Hello " + name + ", ");

            System.out.println("Please type Y if you want to login");
            System.out.println("Type \"LIST\" if you want to see the list of hotels available");
            String response = scanner.next();

//        boolean login_Status=false;
            if (response.equalsIgnoreCase("Y")) {
                loginStatus=true;
                System.out.println("Hi " + name + ", You are logged in");
                System.out.println("Type \"LIST\" if you want to see the list of hotels available");
                System.out.println("Please type N if you want to logout");
                response = scanner.next();

                if (response.equalsIgnoreCase("list")) {
                    System.out.println("__________Premium____||____hotels:________");
                System.out.println(premiumhotellist);
                    System.out.println("__________Local____||____hotels:________");
                System.out.println(localHotelList);

                    System.out.println("Please type N if you want to logout");
                    response=scanner.next();
                    if (response.equalsIgnoreCase("N")){
                        loginStatus=false;
                        System.out.println("You are successfully logged out.");
                    }
                }
                else if(response.equalsIgnoreCase("N")){
                        loginStatus=false;
                        System.out.println("You are successfully logged out.");
                }
            } else {
                System.out.println("You aren’t logged in.Please provide a valid response");
            }
            mySession();

    }
}
