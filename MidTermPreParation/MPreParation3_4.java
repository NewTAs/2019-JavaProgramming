import java.util.Scanner;
public class MPreParation3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("�л� ���� �Է����ּ���.");
		int student = key.nextInt();
		
		if (student <= 0) {
			System.out.println("�л� ���� �߸� �Է��ϼ̽��ϴ�.");
			System.out.println("�ý����� ����˴ϴ�.");
		}
		
		else {
			int score[] = new int[student];
			
			System.out.println(student + "���� ���α׷��� ������ �Է����ּ���. (0 ~ 100)");
			for (int i = 0 ; i < student ; i++) {
				System.out.print((i+1) + ":");
				score[i] = key.nextInt();
				
				if (score[i] < 0 || score[i] > 100) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					System.out.println((i+1) + "��° �л��� ������ 0������ ó�� �˴ϴ�.");
					score[i] = 0;
				}
			}
			
			System.out.println("���");
			for (int i = 0 ; i < student ; i++) {
				System.out.print((i+1) + "��" + score[i] + "�� :");
				
				if (score[i] / 10 == 0)
					System.out.print("*");
				
				else {
					for (int j = 0 ; j < score[i] / 10 ; j++)
						System.out.print("*");
				}
				System.out.println();
			}
		}
		
		key.close();
	}

}
