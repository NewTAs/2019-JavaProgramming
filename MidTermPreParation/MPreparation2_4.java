import java.util.Scanner;
public class MPreparation2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("계산기 프로그램입니다.");
		System.out.println("다음 숫자 중 선택해주세요.");
		System.out.println("1. 더하기\t2. 빼기\t3. 곱하기\t4. 나누기");
		int num = key.nextInt();
		
		int a, b;
		
		switch (num) {
		case 1:
			System.out.print("첫 번째 숫자: ");
			a = key.nextInt();
			System.out.print("두 번째 숫자: ");
			b = key.nextInt();
			System.out.println("결과 :" + (a + b));
			break;
			
		case 2:
			System.out.print("첫 번째 숫자: ");
			a = key.nextInt();
			System.out.print("두 번째 숫자: ");
			b = key.nextInt();
			System.out.println("결과 :" + (a - b));
			break;
			
		case 3:
			System.out.print("첫 번째 숫자: ");
			a = key.nextInt();
			System.out.print("두 번째 숫자: ");
			b = key.nextInt();
			System.out.println("결과 :" + (a * b));
			break;
			
		case 4:
			System.out.print("첫 번째 숫자: ");
			a = key.nextInt();
			System.out.print("두 번째 숫자: ");
			b = key.nextInt();
			System.out.println("결과 :" + (a / b));
			break;
			
		default :
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
		key.close();
	}

}
