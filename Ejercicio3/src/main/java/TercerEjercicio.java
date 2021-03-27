
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sergi
 */
public class TercerEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, how old are you? ");
        byte age = Byte.parseByte(scan.nextLine());

        float alcohol = 0;
        System.out.println("Are you a guy or a girl? ");
        String gender = scan.nextLine();

        if (age >= 18 && age < 90) {

            System.out.println("Do you know your blood alcohol concentration? ");
            alcohol = Float.parseFloat(scan.nextLine());

        }

        if (age >= 18 && age < 90 && alcohol >= 0.25f) {

            System.out.println("You should not drink anymore");
        }
        if (age < 18) {

            if (gender.equals("guy") || gender.equals("Guy")) {
                System.out.println("young man... you are still too young to drink");
            } else if (gender.equals("Girl") || gender.equals("girl")) {
                System.out.println("young lady... you are still too young to drink");
            }
        } else if (age >= 90) {
            System.out.println("Alcohol may not be a good idea at the age of " + age + " years old");

        } else if (alcohol >= 0.25f) {
            if (gender.equals("guy") || gender.equals("Guy")) {
                System.out.println("be a good boy and go home, you are too drunk");
            } else if (gender.equals("Girl") || gender.equals("girl")) {
                System.out.println("be a good girl and go home, you are too drunk");
            }

        } else {
            System.out.println("Have a drink! Enjoy it! ");
        }

    }

}
