import java.util.Scanner;
public class MPreParation3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("학생 수를 입력해주세요.");
		int student = key.nextInt();
		
		if (student <= 0) {
			System.out.println("학생 수를 잘못 입력하셨습니다.");
			System.out.println("시스템이 종료됩니다.");
		}
		
		else {
			int score[] = new int[student];
			
			System.out.println(student + "명의 프로그래밍 점수를 입력해주세요. (0 ~ 100)");
			for (int i = 0 ; i < student ; i++) {
				System.out.print((i+1) + ":");
				score[i] = key.nextInt();
				
				if (score[i] < 0 || score[i] > 100) {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println((i+1) + "번째 학생의 점수는 0점으로 처리 됩니다.");
					score[i] = 0;
				}
			}
			
			System.out.println("결과");
			for (int i = 0 ; i < student ; i++) {
				System.out.print((i+1) + "번" + score[i] + "점 :");
				
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
