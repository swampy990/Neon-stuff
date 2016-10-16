
/*
 * This creates a conversion table for Gallons to Litres
 */

public class GalToLit {
	public static void main(String[] args) {
		
	double Gals, Litres, conv; 	//Holds Gallons and Liters values
	int counter;				// Integer to do counting
	
	counter = 0;
	conv = 3.7854; 	//The number of Litres in a Gallon
	
	for (Gals = 1; Gals <=100; Gals ++ ) {
			Litres = Gals * conv;
			System.out.println(Gals + "Gallons is " + Litres + " Litres");
		
			counter ++;
			
			if (counter == 10) {
			
				System.out.println("...");
				counter = 0;
			}
		}
	}
}
	
