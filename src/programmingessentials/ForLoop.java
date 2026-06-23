package programmingessentials;
import java.util.Scanner;
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int sum = 0;
		for(int i = 1; i<=N; i++ ) {
			sum += i;
		}
		System.out.println(sum);
		scanner.close();
	}

}
