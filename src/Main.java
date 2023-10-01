import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        boolean done = false;
        do {
            System.out.println("Enter a measurement in Meters: ");
            if (in.hasNextInt()){
                int meter = in.nextInt();
                in.nextLine();
                double mile = meter * 0.000621371;
                double feet = meter * 3.28084;
                double inch = meter * 39.37008;
                System.out.println(meter + " meters is equivalent to " + mile + " miles, " + df.format(feet) + " feet, and " + df.format(inch) + " inches.");
                done = true;
            }
            else {
                String trash = in.nextLine();
                System.out.println("You said " + trash + ". That is not the correct input so try again.");
            }
        }while (!done);
    }
}