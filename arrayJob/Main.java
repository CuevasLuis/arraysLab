package arrayJob;

import java.util.Scanner;

// class name must be the same as the file name
public class Main {

    public static void main(String[] args) {

        String[] appetizers = { "egg-rolls", "dumplings", "wonton soup", "sushi", "salad" };
        String[] entrees = { "fried-shrimp", "fried-catfish", "Hamburger", "Pizza", "Hot-dog" };
        String[] desserts = { "ice-cream", "chocolate-cake", "pie", "cookies", "fudge" };

        int orderNumber = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose one of the menus to start. \"Appetizers\", \"entrees\" or \"dessert\" menu. ");
        String user_choice3 = scan.nextLine();
        
        scan.close();
       

        
        
        if ("appetizers".equals(user_choice3)) {
            System.out.println("This is our appetizers,everything is $5");
            for (String x : appetizers) {
                System.out.println("menu item: " + x);

            }
            

        } else if ("entrees".equals(user_choice3)) {
            System.out.println("This the entrees menu, everything is $10");
            for (String x : entrees) {
                System.out.println("menu item: " + x);
            }

        } else if ("dessert".equals(user_choice3)) {
            System.out.println("This is our desserts,everything is $6");
            for (String x : desserts) {
                System.out.println("menu item: " + x);
            }
            
        } else {
            System.out.println("we dont have that menu");
        }


        
        

    }// end of mainMethod

}// end of MainClass
