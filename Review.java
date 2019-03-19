import java.util.Scanner;

public class Review {
	
		 static Scanner kb= new Scanner(System.in);
		
		public static void greet() {
			System.out.println("Hello,");
			
		}
		public static void title() {
			
			
			System.out.println("Whats your name");
			String name = kb.next();
			greet();
			if(name.endsWith("e") ||name.endsWith("a")) {
				System.out.println("Miss"+name);
			}else {
				System.out.println("Mister"+name);
			}
			
		}
		public static void greetPeople(int numOfPeople) {
			  for(int i=0; i<numOfPeople; i++) {
				   title();
			  }
		}
		public static void main(String[] args) {
			System.out.println("Enter number of People");
			int num = kb.nextInt();
			greetPeople(num);
		}
	}

	  


	

