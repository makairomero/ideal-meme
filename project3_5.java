
/**
 * Write a description of class project3_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class project3_5
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        //double hw = reader.nextDouble();
        System.out.println("Enter regular hours: ");
        int reg = reader.nextInt();
        System.out.println("Enter overtime hours: ");
        int over = reader.nextInt();

        
        double totalpay;
        totalpay = reg + (over * (1.5));
        System.out.println(totalpay);
    }
}
