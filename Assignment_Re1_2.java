import java.util.Scanner;

public class Assignment_Re1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int nums; //����ڿ��� ������ �Է¹޾� ������ ���� ����
	
	/* ��ĳ�� ��� ���� �κ� */
	Scanner key = new Scanner(System.in); //��ĳ�� ��� ����
	
	/* ����ڿ��� ���&�Է¹ޱ� */
	System.out.println("������ �Է����ּ���!"); //����ڿ��� ���
	nums = key.nextInt(); //����ڿ��� �� �Է¹ޱ�
	
	/* ����ڿ��� ��� ����ϱ� */
	System.out.println( nums % 2 == 1 ? "Ȧ��" : "¦��" ); //nums�� 2�� �������� �� 1�̸� Ȧ��, �ƴϸ� ¦�� ��� 
	
	/* ��ĳ�� ��� ���� */
	key.close(); //��ĳ�� ��� ����
	}
}
