import java.util.Scanner; //Scanner ��� �ҷ�����
public class LabAssignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ���� ���� �κ� */
		int num_fir = 0, num_sec = 0, results = 0; //int(����) ���� ����
		double result_s = 0;  //double(�Ǽ�) ���� ����

		/* ��ĳ�� ��� ���� �κ� */
		Scanner key = new Scanner(System.in);
		
		/* ��� */
		System.out.println("�й�: **********");  //��°�
		System.out.println("�̸�: ***"); //��°�
		System.out.println("============\n"); //��°�
		
		System.out.println("���� ���α׷��Դϴ�."); //��°�
		System.out.println("���� ���� �� ���� �ϼ���."); //��°�
		System.out.println("1.���ϱ�\t2.����\t3.���ϱ�\t4.������"); //��°�
		int num_switch = key.nextInt(); //����ڿ��� ������ �Է¹޾� �����ϱ�

		/* ���� ���α׷� */
		switch(num_switch) {  //����ڿ��� �Է¹��� ������ switch�� ����
		case(1) : //����ڰ� 1�� �Է����� ��
			System.out.print("ù ��° ���� :"); //��°�
			num_fir = key.nextInt(); //����ڿ��� ������ �Է¹޾� �����ϱ�
			System.out.print("�� ��° ���� :"); //��°�
			num_sec = key.nextInt(); //����ڿ��� ������ �Է¹޾� �����ϱ�
			results = num_fir + num_sec; //����ڿ��� ���� ���� �ΰ��� ���Ͽ� �����ϱ�
			System.out.println("���: " + results); //��°�
			break; //switch�� ���� ������
			
		case(2) : //����ڰ� 2�� �Է����� ��
			System.out.print("ù ��° ���� :"); //��°�
			num_fir = key.nextInt(); //����ڿ��� ������ �Է¹޾� �����ϱ�
			System.out.print("�� ��° ���� :"); //��°�
			num_sec = key.nextInt(); //����ڿ��� ������ �Է¹޾� �����ϱ�
			results = num_fir - num_sec; //����ڿ��� ���� ���� �ΰ��� ���� �����ϱ�
			System.out.println("���: " + results); //��°�
			break; //switch�� ���� ������
			
		case(3) : //����ڰ� 3�� �Է����� ��
			System.out.print("ù ��° ���� :"); //��°�
			num_fir = key.nextInt(); //����ڿ��� ������ �Է¹޾� �����ϱ�
			System.out.print("�� ��° ���� :"); //��°�
			num_sec = key.nextInt(); //����ڿ��� ������ �Է¹޾� �����ϱ�
			results = num_fir * num_sec; //����ڿ��� ���� ���� �ΰ��� ���Ͽ� �����ϱ�
			System.out.println("���: " + results); //��°�
			break; //switch�� ���� ������
			
		case(4) : //����ڰ� 4�� �Է����� ��
			System.out.print("ù ��° ���� :"); //��°�
			num_fir = key.nextInt(); //����ڿ��� ������ �Է¹޾� �����ϱ�
			System.out.print("�� ��° ���� :"); //��°�
			num_sec = key.nextInt(); //����ڿ��� ������ �Է¹޾� �����ϱ�
			result_s = (double)num_fir / (double)num_sec;
			//����ڿ��� ���� ���� �ΰ��� ������ �Ǽ��� �����ϱ�
			System.out.println("���: " + result_s); //��°�
			break; //switch�� ���� ������
			
		default : //����ڰ� 1, 2, 3, 4�� �Է����� �ʾ��� ��
			System.out.println("�߸� �Է��ϼ̽��ϴ�."); //��°�
		}
		
		/* ��ĳ�� ��� ���� */
		key.close(); //��ĳ�� ��� ����
	}

}
