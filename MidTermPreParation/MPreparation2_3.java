import java.util.*;
public class MPreparation2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("(1) ����\t(2) ����\t(3)�� �� �ϳ��� �Է����ּ���. :");
		int user = key.nextInt();
		
		if (user > 0 && user < 4) {
			int com = (int)(Math.random()*3) + 1;
			System.out.println("����� " + user + "�½��ϴ�.");
			System.out.println("��ǻ�ʹ� " + com + "�½��ϴ�.");
		}
		else
			System.out.println("�Է� ������ �ƴմϴ�.");
		
		key.close();
	}

}
