import java.util.Scanner;

/* Author: Jose Fernandez
  * Project: Age
  * Date: 2.21.19
  */
public class age {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		System.out.println("what is your age");
		int age = scnr.nextInt();
		
		if(age > 25)
		{
			System.out.println("Adult");
		}
		else if (age>= 19 && age<= 25) {
			System.out.println("Younge Adult");
		}
		else {
			System.out.print("teen");
		}
		
	}
}

