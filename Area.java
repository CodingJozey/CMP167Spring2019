import java.util.Scanner;

/*Area.Java
 //* Author: Jose Fernandez
 *This program implements area functions/method
  */
  public class Area {
     static Scanner keyboard = new Scanner(System.in);
     
    
 
	/*
	 * rectArea : void
	 * inputs: width and length
	 * process: area= width*length
	 * output: area
	 */

	public static void rectArea() {
		int width, length, area;
		System.out.println("Let's calculate rectangle area");
		//input
		System.out.println("Enter width:");
		width = keyboard.nextInt();
		System.out.println("Enter length");
		length = keyboard.nextInt();
		//process/calculation
		area = width *length;
		//output
		System.out.println("The rect area is:" +area);
	}
	
	
	/*
	 * CircaArea : void
	 * inputs: radius
	 * process: area= pi*r*r
	 * output: area
	 */
	public static void circArea() {
		double radius, area;
		System.out.println("Area of a circle");
		
		System.out.println("Enter radius");
		radius = keyboard.nextDouble();
		
		area = Math.PI *radius * radius;
		
		System.out.println("The circle area is:"+area);
	}
    

	//for debugging
	public static void main(String[] args) {
        
	}

	/*
	 * TriArea : void
	 * inputs: base and height
	 * process: area= (base * height)/2
	 * output: area
	 */
	public static void TriArea() {
		int base, height, area;
		System.out.println(" Area of triangle");
		
		System.out.println ("Enter base");
		base = keyboard.nextInt();
		System.out.println("Enter height");
		height = keyboard.nextInt();
		
		area = base * height / 2;
		
		System.out.println("The triangle area is: "+area);
		}
  
  
  }

	
