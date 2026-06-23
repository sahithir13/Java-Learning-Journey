package programmingessentials;
import java.util.Scanner;
public class IfElseIfLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(number<10) {
			System.out.println("Small");
		}
		else if(number>=10 && number<100) {
			System.out.println("Medium");
		}
		else {
			System.out.println("Large");
		}
		scanner.close();
	}

}
