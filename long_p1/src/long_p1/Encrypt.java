package long_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInput, i;
		int tempInt = 0;
		int[] array = new int[4];
		
		System.out.println("Enter a 4 digit number: ");
		userInput = scnr.nextInt();
		
		//puts userInput into an array
		for(i = 3; i >= 0; i--)
		{
			array[i] = userInput%10;
			userInput /= 10;
		}
		
		for(i = 0; i < 4; i++)
		{
			array[i] += 7;
			array[i] = array[i]%10;
		}
		
		//switching first and third
		tempInt = array[0];
		array[0] = array[2];
		array[2] = tempInt;
		//switching second and fourth
		tempInt = array[1];
		array[1] = array[3];
		array[3] = tempInt;
		tempInt = 0;
		
		System.out.println("Your encrypted number is: ");
		
		for(i = 0; i < 4; i++)
		{
			System.out.print(array[i]);
		}
		
	}	
}
