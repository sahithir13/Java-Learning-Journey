package programmingessentials;
import java.util.Scanner;
public class IfelseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		checkSeniorCitizen(age);
		scanner.close();
	}
	public static void checkSeniorCitizen(int age) {
		if(age>60) {
			System.out.println("Senior Citizen");
		}
		else {
			System.out.println("Not a Senior Citizen");
		}
	}

}
