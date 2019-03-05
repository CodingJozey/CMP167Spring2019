import java.util.Scanner;

public class Naturalnumbers {

	public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);
    int n;
    int sum = 0;
    int counter = 0;
    
    System.out.println("Please enter n: ");
    n = keyboard.nextInt();
    
    while (counter < n ) {
    	counter++;
    	System.out.println( counter);
    	sum += +counter;
    	
    }
    	System.out.println( "The sum is " + sum);		
    }
    
	}


