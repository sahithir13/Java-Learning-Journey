package javabasics;
import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter an integer: ");
		        int i = sc.nextInt();

		        System.out.print("Enter a float: ");
		        float f = sc.nextFloat();

		        System.out.print("Enter a double: ");
		        double d = sc.nextDouble();

		        System.out.print("Enter a character: ");
		        char ch = sc.next().charAt(0);

		        System.out.print("Enter a boolean (true/false): ");
		        boolean b = sc.nextBoolean();

		        sc.nextLine(); // Consume leftover newline

		        System.out.print("Enter a string: ");
		        String str = sc.nextLine();

		        System.out.println("\n--- Output ---");
		        System.out.println("Integer: " + i);
		        System.out.println("Float: " + f);
		        System.out.println("Double: " + d);
		        System.out.println("Character: " + ch);
		        System.out.println("Boolean: " + b);
		        System.out.println("String: " + str);

		        sc.close();
		    }

	}

