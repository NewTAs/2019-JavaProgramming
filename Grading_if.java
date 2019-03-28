import java.util.Scanner;
public class Grading_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char grade;
		Scanner key = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요. :");
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
			
			System.out.println("학점은 " + grade +"입니다.");
			System.out.println("점수를 입력해주세요. :");
		}
		key.close();
	}

}
