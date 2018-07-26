package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String str[]= new String[5];
		//2. print the third element in the array
System.out.println(str[3]);
		//3. set the third element to a different value
str[3]="a different value";
		//4. print the third element again
System.out.println(str[3]);

		//5. use a for loop to set all the elements in the array to a string of your choice
for (int i=0; i<str.length;i++) {
	str[i]="a string of your choice";
}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (String string : str) {
			System.out.println(str);
		}
		//7. make an array of 50 integers
		Integer ok[]= new Integer[50];

		//8. use a for loop to make every value of the integer array a random number
		for (int i=0; i<ok.length;i++) {
			Random rand = new Random(42);
			ok[i]=rand.nextInt(10);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int temp =43;
		for (int i=0; i<ok.length;i++) {
			if(ok[i]<temp) {
				temp=ok[i];
			}
			
		}
		System.out.println(temp);
		//10 print the entire array to see if step 8 was correct
		for (int i=0; i<ok.length;i++) {
		
			System.out.println(ok[i]);
		}
		//11. print the largest number in the array.
		int tempo =0;
		for (int i=0; i<ok.length;i++) {
			if(ok[i]>temp) {
				temp=ok[i];
			}
			
		}
		System.out.println(tempo);

		//12. print only the last element in the array
		System.out.println(ok.length-1);
	}
}
