package learnOne;

import java.util.Scanner;

public class calculator{

	public static void main(String[] args)
	{
		//initialising calculator class
		new calculator();
		
		//Variables declaration
		int x,y;
		int sum;
		int choice;
		
		//Display Menu
		System.out.print("*****  Calculator Program  *****\n1. Add\n2. Subtract\n3. Multiply\n4. Divide\nEnter choice: ");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		choice =in.nextInt();
		
		if(choice == 1)
			{
				System.out.print("\n-------------\nAdd function\n-------------\n");
			}
		else if(choice == 2)
			{
				System.out.print("\n-------------\nSubtract function\n-------------\n");
			}
		else if(choice == 3)
			{
				System.out.print("\n-------------\nMultiply function\n-------------\n");
			}
		else if(choice == 4)
			{
				System.out.print("\n-------------\nDivide function\n-------------\n");
			}
			
		//User Input
		x = in.nextInt();
		y = in.nextInt();
			
		switch(choice)
			{
				case 1 : 
					{
						sum = calculator.add(x, y);
						System.out.println("\nTotal: " + sum);
					}
					break;
				case 2 :
					{
						sum = calculator.subtract(x, y);
						System.out.println("\nTotal: " + sum);
					}
					break;
				case 3 :
					{
						sum = calculator.multiply(x, y);
						System.out.println("\nTotal: " + sum);
					}
					break;
				case 4 :
					{
						sum = calculator.subtract(x, y);
						System.out.println("\nTotal: " + sum);
					}
				default :
					{
						System.out.println("Incorrect options, Try again!");
					}
			}
	}
	
	public static int add(int num1, int num2)
	{
		int num3;
		num3 = num1 + num2;
		
		return num3;
	}
	public static int subtract(int num1, int num2)
	{
		int num3;
		num3 = num1 - num2;
		
		return num3;
	}
	public static int multiply(int num1, int num2)
	{
		int num3;
		num3 = num1 * num2;
		
		return num3;
	}
	public static int divide(int num1, int num2)
	{
		int num3;
		num3 = num1 / num2;
		
		return num3;
	}
}
