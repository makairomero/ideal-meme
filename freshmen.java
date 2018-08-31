
/**
 * Write a description of class freshmen here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class freshmen
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        
        String lastname;
        String firstname;
        int year;
        String phone;
        
        System.out.print("Enter last name: ");
        lastname = reader.nextLine();
        System.out.print("Enter first name: ");
        firstname = reader.nextLine();
        System.out.print("Enter class year: ");
        year = reader.nextInt();
        System.out.print("Enter campus phone: ");
        phone = reader.nextLine();
        
        
        
        System.out.println(lastname);
        System.out.println(firstname);
        System.out.println(year);
        System.out.println(phone);
    }
}
