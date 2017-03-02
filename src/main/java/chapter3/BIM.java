package chapter3;

import java.util.Scanner;
public class BIM {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight in pounds and height in inches");

		String userInput = input.nextLine();

		System.out.println(userInput);

		String[] splitInputs = userInput.split(" ");

		double weight = Double.valueOf(splitInputs[0]);
		double height = Double.valueOf(splitInputs[1]);
		double bmi = weight / (height * height);

		System.out.println(bmi);

/*
		double pound = input.nextDouble();
	final double KILOGRAMS_PER_POUND = 0.45359237; //Constant
	
	double weightInKilograms = pound * KILOGRAMS_PER_POUND;
			
	System.out.println("Enter height in inches");
	double height = input.nextDouble();
	final double METERS_PER_INCH = 0.0254; //Constant


	double heightInMeters = height * METERS_PER_INCH;
	
	double bmi = weightInKilograms / (heightInMeters * heightInMeters);
	
	if (bmi < 18.5)
	{
	 System.out.println("Underweight");
	}
	 else if (bmi < 25)
	 {
	 System.out.println("Normal");
	 }
	else if (bmi < 30)
	{
		System.out.println("Overweight");
	}
	else
	{
			System.out.println("Obese");
	}
		
	}*/
	}
}

