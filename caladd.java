import java.util.Scanner;

public class caladd{
	private static Scanner scan;
	public static void main(String[] args){
		float a, b, res;
		char choice, ch;
		scan = new Scanner(System.in);
		
		do{
			System.out.println("1.Add two numbers");
			System.out.println("2.Subtract");
			System.out.print("3.Multiply");
			System.out.print("4.Exit\n");
			System.out.print("Enter your choice : ");
			
			choice = scan.next().charAt(0);
			switch(choice){
				case '1': System.out.print("Enter two number : ");
					a = scan.nextFloat();
					b = scan.nextFloat();
					res = a + b;
					System.out.print("Result = " + res);
					break;
				
				case '2': System.out.print("Enter Two Numbers :");
					a = scan.nextFloat();
					b = scan.nextFloat();
					res = a - b;
					System.out.print("Result = " + res);
					break;
				
				case '3': System.out.print("Enter Two Numbers :");
					a = scan.nextFloat();
					b = scan.nextFloat();
					res = a * b;
					System.out.print("Result = " + res);
					break;
				case '4': System.exit(0);
					break;
				
				default: System.out.print("Invalid Choice!!");
					break;
			}
			System.out.print("\n______________________________\n");
		}while(choice != '4');
	}
}
