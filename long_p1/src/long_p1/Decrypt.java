package long_p1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userInput, i;
		int tempInt = 0;
		int[] array = new int[4];
		
		System.out.println("Enter your encrypted number: ");
		userInput = scnr.nextInt();
		
		for(i = 3; i >= 0; i--)
		{
			array[i] = userInput%10;
			userInput /= 10;
		}
		
		tempInt = array[0];
		array[0] = array[2];
		array[2] = tempInt;
		tempInt = array[1];
		array[1] = array[3];
		array[3] = tempInt;
		tempInt = 0;
		
		for(i = 0; i < 4; i++)
		{
			if(array[i] + 10 > 16)
			{
				array[i] -= 7;
			}
			else
			{
				array[i] +=10;
				array[i] -= 7;
			}
		}
		
		System.out.println("Your decrypted number is: ");
		
		for(i = 0; i < 4; i++)
		{
			System.out.print(array[i]);
		}
	}
}
