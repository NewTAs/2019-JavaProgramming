import java.util.*; //util ��� ��� �ҷ�����
public class LabAssignment2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* ���� ���� �κ� */
		int num_user = 0, num_com = 0; //int(����) ���� ����
		
		/* ��� */
		System.out.println("�й�: 201804037");  //��°�
		System.out.println("�̸�: Ȳ���"); //��°�
		System.out.println("============\n"); //��°�
		
		/* ��ĳ�� ��� Ȱ��ȭ */
		Scanner key = new Scanner(System.in); //��ĳ�� ��� Ȱ��ȭ

		/* �ݺ��� */
		do {
			System.out.println("����(1)\t����(2)\t��(3)\t �� �ϳ��� �Է��ϼ���!"); //���
			num_user = key.nextInt(); //����ڿ��� ������ �Է¹޾� �����ϱ�
			num_com = (int)(Math.random()*3) + 1; //���� �Լ��� ������ �����Ͽ� �����ϱ�
			
			if (num_user == 1) { //����ڰ� 1�� �Է����� ��
				System.out.println("����� " + num_user + "��(��) �½��ϴ�."); //���
				System.out.println("��ǻ�ʹ� " + num_com + "��(��) �½��ϴ�."); //���
				
				if (num_com == 1) //��ǻ�Ϳ� ����� ���� 1�� ��
					System.out.println("�����ϴ�."); //���
				else if (num_com == 2) //��ǻ�Ϳ� ����� ���� 2�� ��
					System.out.println("�����ϴ�."); //���
				else //��ǻ�Ϳ� ����� ���� 3�� ��
					System.out.println("�̰���ϴ�."); //���
				}
			
			else if (num_user == 2) { //����ڰ� 2�� �Է����� ��
				System.out.println("����� " + num_user + "��(��) �½��ϴ�."); //���
				System.out.println("��ǻ�ʹ� " + num_com + "��(��) �½��ϴ�."); //���
				
				if (num_com == 1) //��ǻ�Ϳ� ����� ���� 1�� ��
					System.out.println("�̰���ϴ�."); //���
				else if (num_com == 2) //��ǻ�Ϳ� ����� ���� 2�� ��
					System.out.println("�����ϴ�."); //���
				else //��ǻ�Ϳ� ����� ���� 3�� ��
					System.out.println("�����ϴ�."); //���
				}
			
			else if (num_user == 3) { //����ڰ� 3�� �Է����� ��
				System.out.println("����� " + num_user + "��(��) �½��ϴ�."); //���
				System.out.println("��ǻ�ʹ� " + num_com + "��(��) �½��ϴ�."); //���
				
				if (num_com == 1) //��ǻ�Ϳ� ����� ���� 1�� ��
					System.out.println("�����ϴ�."); //���
				else if (num_com == 2) //��ǻ�Ϳ� ����� ���� 2�� ��
					System.out.println("�̰���ϴ�."); //���
				else //��ǻ�Ϳ� ����� ���� 3�� ��
					System.out.println("�����ϴ�."); //���
				}

			else if (num_user != 0) //����ڰ� 1, 2, 3�� �ƴ� �ٸ� ���� �Է����� ��
				System.out.println("�Է� ������ �ƴմϴ�."); //���
			
		} while(num_user != 0); //����ڰ� 0�� �Է����� ���� �ݺ��� ����
		System.out.println("����˴ϴ�."); //���
		
		/* ��ĳ�� ��� ���� */
		key.close(); //��ĳ�� ��� ����
	}

}
