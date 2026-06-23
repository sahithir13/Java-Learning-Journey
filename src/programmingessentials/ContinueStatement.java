package programmingessentials;
import java.util.Scanner;
public class ContinueStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int maxNumber = scanner.nextInt();
		for(int i = 1;i <= maxNumber;i++) {
			if(i%2 ==0) {
				continue;
			}
			System.out.println(i);
		}
		scanner.close();
	}

}
