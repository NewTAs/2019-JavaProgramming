import java.util.Scanner;
public class MPreparation2_1 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("�й��� �Է����ּ���. :");
		String str = key.nextLine();
		
		if (str.length() == 9 && str.charAt(5) == '4') {
			System.out.println("����� ��ǻ�Ϳ����а� �л��̽ó׿�.");
		}
		else
			System.out.println("����� ��ǻ�Ϳ����а� �л��� �ƴϽó׿�.");
		
		key.close();
	}
}
