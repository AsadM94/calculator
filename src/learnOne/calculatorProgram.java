package learnOne;

import java.util.Scanner;

public class calculatorProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		for (int n = 0; n < 100; ++n)
			{	
				System.out.println("**************** Calculator Program ********************");
					System.out.print("1) Add\n2) Subtract\n3) Multiply\n4) Divide\nEnter Choice: ");
						int option =in.nextInt();
						switch(option)
							{
								case 1 :
									System.out.println("********* Add *********");
									System.out.print("First Number     ");
									a=in.nextInt();
									System.out.println("               +");
									System.out.print("Second Number    ");
									b=in.nextInt();
									c= a + b;
									System.out.println( "----------------------\n" +"Total sum is     "+ c);
								break;
								case 2 :
									System.out.println("********* Subtract *********");
									System.out.print("First Number     ");
									a=in.nextInt();
									System.out.println("               -");
									System.out.print("Second Number    ");
									b=in.nextInt();
									c= a - b;
									System.out.println( "----------------------\n" +"Total sum        "+ c);
									break;
								case 3 :
									System.out.println("********* Multiply *********");
									System.out.print("First Number     ");
									a=in.nextInt();
									System.out.println("               x");
									System.out.print("Second Number    ");
									b=in.nextInt();
									c= a * b;
									System.out.println( "----------------------\n" +"Total sum        "+ c);
									break;
								case 4 :
									System.out.println("******** Divide ********");
									System.out.print("First Number     ");
									a=in.nextInt();
									System.out.println("               /");
									System.out.print("Second Number    ");
									b=in.nextInt();
									c= a / b;
									System.out.println( "----------------------\n" +"Total sum        "+ c);
									break;
								default :
									System.out.println("Something has gone wrong");
							}
					//this starts another iteration of block of code above.
					Thread.sleep(2000);
					continue;
			}
	}
}
