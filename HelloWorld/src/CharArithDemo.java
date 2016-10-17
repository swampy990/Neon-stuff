
public class CharArithDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			char ch;
			int counter;
			ch = 'X';
			
			System.out.println("ch contains " + ch);
			
			ch++; //increment ch by 1
			System.out.println("ch is now " + ch);
			
			ch = 90; // Do crazy weird  by using an integer 
			System.out.println("ch is now " + ch);
			
			
			ch = 0;
			
			for (counter = 0 ; counter <= 256; counter++) {
										
			System.out.println(counter + " Ch is currently " + ch);
			ch++;
			
			}
			
			
	}

}
