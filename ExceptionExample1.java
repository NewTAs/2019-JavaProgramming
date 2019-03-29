import java.util.Scanner;
public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int divisor = 0, dividend = 0;
		
		System.out.print("나뉨수를 입력하세요. :");
		dividend = key.nextInt();
		System.out.print("나눔수를 입력하세요. :");
		divisor = key.nextInt();
		System.out.println(dividend + " / " + divisor + "는 "
		+ dividend/divisor + "입니다.");
		
		key.close();
	}

}
