import java.util.Scanner;
public class SuccessOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int score = key.nextInt();
		
		if (score >= 80)
			System.out.println("�����մϴ�! �հ��Դϴ�.");
		
		key.close();
	}

}
