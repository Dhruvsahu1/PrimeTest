import java.util.Scanner;

public class perimeterOfRectangle {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
	  double length = sc.nextDouble();
	  double width = sc.nextDouble();
	  double peri = 2*(length+width);
	  System.out.println("Perimeter is " + peri);
   }
}
