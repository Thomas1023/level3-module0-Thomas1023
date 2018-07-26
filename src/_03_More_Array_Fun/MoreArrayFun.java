package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String ar[]= new String[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=""+i;
		}
		up(ar);
		down(ar);
		left(ar);
		right(ar);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static String[] up(String[] arry ) {
		for (String string : arry) {
					System.out.println(string);

		}
		return null;
		
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static String[] down(String[] arry ) {
		for (int i = arry.length-1; i > 0; i--) {
							System.out.println(arry[i]);
		}
	

		
		return null;
		
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static String[] left(String[] arry ) {
		boolean temp=true;
		for (String string : arry) {
			if (temp) {
						System.out.println(string);
						temp=false;
			}else {
				temp=true;
			}
			

		}
		return null;
		
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static String[] right(String[] arry ) {	
		Random rand = new Random(5);
		Integer ar[]= new Integer[arry.length];
	boolean done=false;
		for (int i = 0; i < arry.length; i++) {
			int temp =rand.nextInt(5);
			done=false;
			System.out.println(temp);
			
			
		}
			
			
				
				
			
			
		
		return null;
		
	}
}
