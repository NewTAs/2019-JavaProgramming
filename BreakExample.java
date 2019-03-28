import java.util.Scanner;
public class BreakExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner key = new Scanner(System.in);
			int num = 0;
			
			System.out.print("숫자를 입력해주세요(종료: -1) :");
			while (true) {
				if (key.nextInt() == -1)
					break;
				num ++;
				System.out.print("숫자를 입력해주세요(종료: -1) :");
			}
			System.out.println("입력된 숫자의 개수는 " + num + "개 입니다.");
			
			key.close();
	}

}
