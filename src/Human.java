
public class Human {

	// instance Variables
	public int age;
	public String name;
	public int food; 
	public double wealth;
	public double hunger;
	public boolean hasVehicle;
	Vehicle[] vehicles;


	public Human()  { //Constructor new Human();
		this.age        = 0;
		this.name       ="";
		this.wealth     =0.0;
		this.hasVehicle = false;
		this.hunger     = 5.0;
		this.food       = 5;
		this.vehicles   = new Vehicle[100];

	}
	public int numberOfVehicles() {
		int total = 0;
		for (int i=0; i<vehicles.length; i++) {
			if(vehicles[i]!=null)
				total++;

			else
				break;
		}
		return total;

	}



	public void eat() {
		if (food>0) {
			hunger--;
			hunger -= 1.0;
			food  -= 1.5;
			System.out.println("Yummy, I ate all");
		}


		else System.out.println("Not enough please buy food");  
	}


	public void grow() {
		age++;

	}
	public void work() {
		if(hunger<5) {
			wealth += 10.5;
			hunger +=0.5;
			System.out.println("Whoah, I worked a lot");  
		}

		else
			System.out.println("Too hungry to work");
	}


	public void buyfood() { 
		if(wealth>5) {
			wealth -= 4.5;
			food++;

		}
		else {
			System.out.println("not enough money, please work");
		}
	}
}
