import java.util.Scanner;
public class MPreparation2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int user = 0, com = 0;
		
		do {
			System.out.println("(1) 가위\t(2) 바위\t(3) 보  중 하나를 입력해주세요. :");
			user = key.nextInt();
			
			if (user > 0 && user < 4) {
				com = (int)(Math.random()*3) + 1;
				System.out.println("당신은 " + user + "냈습니다.");
				System.out.println("컴퓨터는 " + com + "냈습니다.");
				
				int result = user - com;
				
				if (result == 0)
					System.out.println("컴퓨터와 비겼습니다.");
				
				else if (result == -2 || result == 1)
					System.out.println("컴퓨터를 이겼습니다.");
				
				else if (result == -1 || result == 2)
					System.out.println("컴퓨터에게 졌습니다.");
			}
			
			else if (user == 0)
				System.out.println("종료됩니다.");
			
			else {
				System.out.println("입력 범위가 아닙니다.");
			}
		}while (user != 0);
		
		key.close();
	}

}
