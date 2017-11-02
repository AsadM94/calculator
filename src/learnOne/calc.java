package learnOne;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) throws InterruptedException 
	{
		for (int n = 0; n < 100; ++n)
		{
			calc.run();
			Thread.sleep(1000);;
		}
	}
	
	public static void run()
	{
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("******** Calculator Program ********");
		System.out.print("First Number:  ");
		int num1 = in.nextInt();
		System.out.print("Operator:     ");
		String operator = in.next();
		System.out.print("Second Number: ");
		int num2 = in.nextInt();
		
		
		
		if(operator.equals("+"))
		{
			System.out.println("\n------------------\nTotal: " + add(num1,num2) + "\n------------------");
		} 
		else if(operator.equals("-"))
		{
			System.out.println("\n------------------\nTotal: " + subtract(num1,num2) + "\n------------------");
		}
		else if(operator.equals("*"))
		{
			System.out.println("\n------------------\nTotal: " + multiply(num1,num2) + "\n------------------");
		}
		else if(operator.equals("/"))
		{
			System.out.println("\n------------------\nTotal: " + divide(num1,num2) + "\n------------------");
		}
	}
	
	public static int add(int num1, int num2)
	{
		return (int)num1 + num2;
	}
	public static int subtract(int num1, int num2)
	{
		return (int)num1 - num2;
	}
	public static int multiply(int num1, int num2)
	{
		return (int)num1 * num2;
	}
	public static int divide(int num1, int num2)
	{
		return (int)num1 / num2;
	}
}

//https://codereview.stackexchange.com/questions/84293/using-methods-and-constructors-to-construct-a-basic-calculator
