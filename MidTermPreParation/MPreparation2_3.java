import java.util.*;
public class MPreparation2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("(1) 가위\t(2) 바위\t(3)보 중 하나를 입력해주세요. :");
		int user = key.nextInt();
		
		if (user > 0 && user < 4) {
			int com = (int)(Math.random()*3) + 1;
			System.out.println("당신은 " + user + "냈습니다.");
			System.out.println("컴퓨터는 " + com + "냈습니다.");
		}
		else
			System.out.println("입력 범위가 아닙니다.");
		
		key.close();
	}

}
