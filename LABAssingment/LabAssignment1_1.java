import java.util.Scanner;

public class LabAssignment1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* ���� ����  �κ� */
		String name, dept; //����ڿ��� �Է¹��� �̸� ������ �а� ������ 'String'���� ����
		int numb, gender, kor, eng, mat;
		//����ڿ��� �Է¹��� ���� ����, ���� ����, �������� ����, �������� ����, �������� ������ 'int'�� ����
		double avg; //���������� ��������, ���������� ��հ��� ������ ������ 'double'�� ����
		
		/* ��ĳ�� ��� ���� �κ� */
		Scanner key = new Scanner(System.in); //��ĳ�� ��� ����
		
		/* ������ ����ϰ�, ����ڿ��� �Է¹޴� �Լ� */
		System.out.println("�̸� : "); //"�̸� : "�� ����ڿ��� ���
		name = key.nextLine(); //�̸��� ���� ���� �Է¹���
		
		System.out.println("�й� : "); //"�й� : "�� ����ڿ��� ���
		numb = key.nextInt(); //���̿� ���� ���� �Է¹���
		
		key.nextLine(); //nextLine() ���� �ʱ�ȭ
		System.out.println("�а� : "); //"�а� : "�� ����ڿ��� ���
		dept = key.nextLine(); //�а��� ���� ���� �Է¹���
		
		System.out.println("����(1.�� 2.��)"); //"����(1.�� 2.��)"�� ����ڿ��� ���
		gender = key.nextInt(); //������ ���� ���� �Է¹���
		
		System.out.println("���� : "); //"���� : "�� ����ڿ��� ���
		kor = key.nextInt(); //���� �������� �Է¹���
		
		System.out.println("���� : "); //"���� : "�� ����ڿ��� ���
		eng = key.nextInt(); //���� �������� �Է¹���
		
		System.out.println("���� : "); //"���� : "�� ����ڿ��� ���
		mat = key.nextInt(); //���� �������� �Է¹���
		
		/* ����ڿ��� ��� �����ֱ� */
		System.out.println("============"); //����ڿ��� ���
		System.out.println("�̸� : " + name); //����ڿ��� ���
		System.out.println("�й� : " + numb); //����ڿ��� ���
		System.out.println("�а� : " + dept); //����ڿ��� ���
		
		System.out.println(gender == 1 ? "���� : ����" : "���� : ����" ); //����ڿ��� ���
		
		int hap = kor+eng+mat; //���� ������ ���� ����, ���� �������� ����
		System.out.println("���� : " + hap); //����ڿ��� ���
		avg = (kor + eng + mat) / 3.0; //��հ� ���ϱ�
		System.out.printf("��� : %.2f", avg); //����ڿ��� ���

		/* ��ĳ�� ��� ���� */
		key.close(); //��ĳ�� ��� ����
	}
}
