import java.util.Scanner;
public class MPreparation2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int user = 0, com = 0;
		
		do {
			System.out.println("(1) ����\t(2) ����\t(3) ��  �� �ϳ��� �Է����ּ���. :");
			user = key.nextInt();
			
			if (user > 0 && user < 4) {
				com = (int)(Math.random()*3) + 1;
				System.out.println("����� " + user + "�½��ϴ�.");
				System.out.println("��ǻ�ʹ� " + com + "�½��ϴ�.");
				
				int result = user - com;
				
				if (result == 0)
					System.out.println("��ǻ�Ϳ� �����ϴ�.");
				
				else if (result == -2 || result == 1)
					System.out.println("��ǻ�͸� �̰���ϴ�.");
				
				else if (result == -1 || result == 2)
					System.out.println("��ǻ�Ϳ��� �����ϴ�.");
			}
			
			else if (user == 0)
				System.out.println("����˴ϴ�.");
			
			else {
				System.out.println("�Է� ������ �ƴմϴ�.");
			}
		}while (user != 0);
		
		key.close();
	}

}
