import java.util.Scanner;
public class MPreparation1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("�̸�: ");
		String name = key.nextLine();
		
		System.out.println("�й�: ");
		int std_num = key.nextInt();
		key.nextLine(); //���� �ʱ�ȭ
		
		System.out.println("�а�: ");
		String dept = key.nextLine();
		
		System.out.println("���");
		System.out.println("�̸�: " + name);
		System.out.println("�й�: " + std_num);
		System.out.println("�а�: " + dept);
		
		key.close();
	}

}
