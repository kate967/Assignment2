package long_p2;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userChoice;
		int userHeight;
		int userWeight;
		double userBMI;
		
		System.out.println("Enter (1) for pounds/inches or (2) for kilograms/meters");
		userChoice = scnr.nextInt();
		
		if(userChoice == 1)
		{
			//pounds
			System.out.println("Enter height(in inches): ");
			userHeight = scnr.nextInt();
			System.out.println("Enter weight(in pounds): ");
			userWeight = scnr.nextInt();
			
			userBMI = (703 * userWeight) / (Math.pow(userHeight, 2));
			
			System.out.println();
			System.out.printf("Your BMI: %.1f\n", userBMI);
		}
		else if(userChoice == 2)
		{
			//kilograms
			System.out.println("Enter height(in meters): ");
			userHeight = scnr.nextInt();
			System.out.println("Enter weight(in kilograms): ");
			userWeight = scnr.nextInt();
			
			userBMI = userWeight / (Math.pow(userHeight, 2));
			
			System.out.println();
			System.out.printf("Your BMI: %.2f\n", userBMI);
		}
		else
		{
			System.out.println("Invalid input");
		}
		
		System.out.println();
		System.out.println("BMI Categories:");
		System.out.println("Underweight = < 18.5");
		System.out.println("Normal weight = 18.5 - 24.9");
		System.out.println("Overweight = 25 - 29.9");
		System.out.println("Obesity = BMI of 30 or greater");

	}

}
