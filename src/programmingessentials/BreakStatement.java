package programmingessentials;

public class BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		do {
			System.out.println("Java is cool");
			i--;
			if(i==5) {
				break;
		}
		}
			while(i>0);
}
}