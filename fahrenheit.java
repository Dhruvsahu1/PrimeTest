import java.util.Scanner;

public class fahrenheit {
    public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
		double cel = sc.nextDouble();
		double fahrenit = (cel *9/5)+32;
		System.out.println(fahrenit);
	}
}
