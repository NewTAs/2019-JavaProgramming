import java.util.Scanner;
public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int divisor = 0, dividend = 0;
		
		System.out.print("�������� �Է��ϼ���. :");
		dividend = key.nextInt();
		System.out.print("�������� �Է��ϼ���. :");
		divisor = key.nextInt();
		System.out.println(dividend + " / " + divisor + "�� "
		+ dividend/divisor + "�Դϴ�.");
		
		key.close();
	}

}
