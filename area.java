import java.util.Scanner;

/*
 * Area.java
 * Jose Fernadez
 * THis program implements area functions/method
 *  modified: 3.14.19
 */
public class area {
	                        // Scanner object
	static Scanner keyboard = new Scanner(System.in);
	/*
	 * getRecArea : int
	 * params : width: int, length: int
	 * calculates rectangle area
	 */

	public static int getRecArea(int width, int length)  {
		return width = length;
	}
	
	/*
	 * circArea
	 * inputs: radius
	 * process: area= pi*r*r
	 * output: area
	 */
	public static double getcircArea(double radius ) {
		return Math.PI * (radius * radius);
	}
		

	/*
	 * TriArea
	 * inputs: base, heights
	 * process: area= base * height/ 2
	 * output: area
	 */

     public static int getTriArea(int base, int height)  {
    	 return (base * height) /2;
     }



 	public static void main(String[] args) {
     
      System.out.println("Enter width and length");
      int width = keyboard.nextInt();   
 	}
}