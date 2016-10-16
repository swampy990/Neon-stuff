
public class IFDemo {

	public static void main(String[] args) {
		int a,b,c;
		
		a = 2;
		b = 3;
		
		if (a<b) System.out.println("A is less than B");
		
		//This won't do anything
		
		if (a == b) System.out.println("You won't see this");
		
		c = a - b; // C now contains -1
		
		if (c >= 0) System.out.println("C is non negative");
		if (c < 0 ) System.out.println("C is negative");
		
		c = b - a; //C Now contains 1
		
		if (c >= 0) System.out.println("C is non negative");
		if (c < 0 ) System.out.println("C is negative");
		

	}

}
