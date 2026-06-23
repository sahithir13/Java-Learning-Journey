package programmingessentials;
import java.util.Scanner;
public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		checkMultipleOfFive(number);
		scanner.close();
	}
	public static void checkMultipleOfFive(int number) {
		if(number % 5== 0) {
			System.out.println("Multiple of 5");
		}
		System.out.println("Program ended");
	}
}
