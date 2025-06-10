import java.util.Scanner;

public class KiloMetersToMiles {
     public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
	   double KiloMeters = sc.nextDouble();
	   double miles = KiloMeters * 0.621371;
	   System.out.println("Distance in miles is" + miles);
  }
}
