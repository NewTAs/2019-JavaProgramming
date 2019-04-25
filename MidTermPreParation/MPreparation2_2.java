import java.util.Scanner;
public class MPreparation2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("현재 월을 입력해주세요. :");
		int nums = key.nextInt();
		
		switch(nums) {
		case 12: case 1: case 2:
			System.out.println("현재의 계절은 겨울 입니다.");
			break;
		
		case 3: case 4: case 5:
			System.out.println("현재의 계절은 봄 입니다.");
			break;
			
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름 입니다.");
			break;
		
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을 입니다.");
			break;
		
		default :
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
		key.close();
	}

}
