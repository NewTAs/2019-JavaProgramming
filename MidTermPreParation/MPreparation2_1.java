import java.util.Scanner;
public class MPreparation2_1 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.print("학번을 입력해주세요. :");
		String str = key.nextLine();
		
		if (str.length() == 9 && str.charAt(5) == '4') {
			System.out.println("당신은 컴퓨터웨어학과 학생이시네요.");
		}
		else
			System.out.println("당신은 컴퓨터웨어학과 학생이 아니시네요.");
		
		key.close();
	}
}
