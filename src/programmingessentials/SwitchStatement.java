package programmingessentials;
import java.util.Scanner;
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		char lightColor = scanner.next().charAt(0);
		performAction(lightColor);
		scanner.close();
	}
	public static void performAction(char lightColor) {
		switch (lightColor) {
		case 'R' : System.out.println("Stop");
		break;
		
		case 'Y' : System.out.print("Wait");
		break;
		
		case 'G' : System.out.println("Go");
		break;
		}
	}

}
