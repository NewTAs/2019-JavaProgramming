import java.util.Scanner; //Scanner ��� �����ϱ�
public class LabAssignment3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* ��ĳ�� ��� �����ϱ� */
		Scanner key = new Scanner(System.in); //��ĳ�� ����
		
		/* �ʱ� ȭ�� */
		System.out.println("�й�: 201804037"); //���
		System.out.println("�̸�: Ȳ���"); //���
		System.out.println("============\n"); //���
		
		System.out.println("�л� ���� �Է����ּ���."); //���
		int student_number = key.nextInt(); //����ڿ��� �л����� ������ �Է¹޾� �����ϱ�
		int intArray[] = new int[student_number]; //�迭 �����ϱ�
		
		if (student_number == 0) { //����ڰ� �л� ���� 0������ �Է��ߴٸ�
			System.out.println("�л����� �߸� �Է��ϼ̽��ϴ�. �ý����� ����˴ϴ�."); //���
		}
		
		else { //����ڰ� �л� ���� 0���� �ƴ� �ٸ� ���� �Է��ߴٸ�
			System.out.println(student_number + "���� ���α׷��� ������ �Է����ּ���. (0~100)"); //���
			for (int i = 1 ; i <= student_number ; i++) { //�Է��� �л� ���� ���� ������ �Է¹ޱ�(�ݺ���)
				System.out.print(i + ": "); //���
				intArray[(i-1)] = key.nextInt();  //����ڰ� �Է��� ������ �迭�� �����ϱ�
				
				if (intArray[(i-1)] < 0 || intArray[(i-1)] > 100) { //���� ����ڰ� ������ 0 �̸�, 100 �ʰ� �ߴٸ�
					System.out.println("�߸� �Է��ϼ̽��ϴ�."); //���
					System.out.println(i + "��° �л��� ������ 0������ ó�� �˴ϴ�."); //���
					intArray[(i-1)] = 0; //�迭 ���� 0���� ����
				}
			}
			
			/* ����� ǥ�� */
			System.out.println("\n���"); //���
			
			for (int i = 0 ; i < student_number ; i++) { //�л� ���� ���� �ݺ��� ����
				System.out.print((i+1) + "�� " + intArray[i] + "��" + " :"); //���
				int prints = intArray[i] / 10; //�迭�� ����� ���� 10���� ���� ���� ����
				
				if (prints == 0 || prints == 1) { //���� �迭�� ����� ���� 10���� ���� ���� 0 �Ǵ� 1�� ��
					System.out.println('*'); //���� �ϳ��� ���
					continue; //�ݺ��� ó������ ���ư�
				}
				for (int j = 0 ; j < prints ; j++) //�� ��¿� ���� �ݺ��� ����
					System.out.print('*'); //���
				System.out.println(); //���
			}
		}
		/* ��ĳ�� ��� ���� */
		key.close(); //��ĳ�� ��� ����
	}
}
