import java.util.Scanner;
public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner key = new Scanner(System.in);
			int num = 0;
			
			System.out.print("���ڸ� �Է����ּ���(����: -1) :");
			while (true) {
				if (key.nextInt() == -1)
					break;
				num ++;
				System.out.print("���ڸ� �Է����ּ���(����: -1) :");
			}
			System.out.println("�Էµ� ������ ������ " + num + "�� �Դϴ�.");
			
			key.close();
	}

}
