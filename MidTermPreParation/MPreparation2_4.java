import java.util.Scanner;
public class MPreparation2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("���� ���α׷��Դϴ�.");
		System.out.println("���� ���� �� �������ּ���.");
		System.out.println("1. ���ϱ�\t2. ����\t3. ���ϱ�\t4. ������");
		int num = key.nextInt();
		
		int a, b;
		
		switch (num) {
		case 1:
			System.out.print("ù ��° ����: ");
			a = key.nextInt();
			System.out.print("�� ��° ����: ");
			b = key.nextInt();
			System.out.println("��� :" + (a + b));
			break;
			
		case 2:
			System.out.print("ù ��° ����: ");
			a = key.nextInt();
			System.out.print("�� ��° ����: ");
			b = key.nextInt();
			System.out.println("��� :" + (a - b));
			break;
			
		case 3:
			System.out.print("ù ��° ����: ");
			a = key.nextInt();
			System.out.print("�� ��° ����: ");
			b = key.nextInt();
			System.out.println("��� :" + (a * b));
			break;
			
		case 4:
			System.out.print("ù ��° ����: ");
			a = key.nextInt();
			System.out.print("�� ��° ����: ");
			b = key.nextInt();
			System.out.println("��� :" + (a / b));
			break;
			
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
		
		key.close();
	}

}
