import java.util.Scanner;
public class Grading_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade;
		Scanner key = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ���. :");
		while(key.hasNext()) {
			int score = key.nextInt();
			
			if (score >= 90)
				grade = 'A';
			else if (score >= 80)
				grade = 'B';
			else if (score >= 70)
				grade = 'C';
			else if (score >= 60)
				grade = 'D';
			else
				grade = 'F';
			
			System.out.println("������ " + grade +"�Դϴ�.");
			System.out.println("������ �Է����ּ���. :");
		}
		key.close();
	}

}
