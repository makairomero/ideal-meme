
/**
 * Write a description of class project3_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class project3_4
{
    public static void main(String [] args){
        Scanner reader = new Scanner(System.in);
        double hw = reader.nextDouble();
        int totalreg = reader.nextInt();
        int totalover = reader.nextInt();
        
        double totalpay;
        totalpay = hw * totalreg + (totalover * (1.5 * hw));
        System.out.print(totalpay);
    }
}
