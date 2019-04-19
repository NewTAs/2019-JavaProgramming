import java.util.Scanner; //Scanner 기능 불러오기
public class LabAssignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 변수 선언 부분 */
		int num_fir = 0, num_sec = 0, results = 0; //int(정수) 변수 선언
		double result_s = 0;  //double(실수) 변수 선언

		/* 스캐너 기능 선언 부분 */
		Scanner key = new Scanner(System.in);
		
		/* 출력 */
		System.out.println("학번: **********");  //출력값
		System.out.println("이름: ***"); //출력값
		System.out.println("============\n"); //출력값
		
		System.out.println("계산기 프로그램입니다."); //출력값
		System.out.println("다음 숫자 중 선택 하세요."); //출력값
		System.out.println("1.더하기\t2.빼기\t3.곱하기\t4.나누기"); //출력값
		int num_switch = key.nextInt(); //사용자에게 정수값 입력받아 선언하기

		/* 계산기 프로그램 */
		switch(num_switch) {  //사용자에게 입력받은 값으로 switch문 실행
		case(1) : //사용자가 1을 입력했을 때
			System.out.print("첫 번째 숫자 :"); //출력값
			num_fir = key.nextInt(); //사용자에게 정수값 입력받아 선언하기
			System.out.print("두 번째 숫자 :"); //출력값
			num_sec = key.nextInt(); //사용자에게 정수값 입력받아 선언하기
			results = num_fir + num_sec; //사용자에게 받은 정수 두개를 더하여 선언하기
			System.out.println("결과: " + results); //출력값
			break; //switch문 빠져 나오기
			
		case(2) : //사용자가 2을 입력했을 때
			System.out.print("첫 번째 숫자 :"); //출력값
			num_fir = key.nextInt(); //사용자에게 정수값 입력받아 선언하기
			System.out.print("두 번째 숫자 :"); //출력값
			num_sec = key.nextInt(); //사용자에게 정수값 입력받아 선언하기
			results = num_fir - num_sec; //사용자에게 받은 정수 두개를 빼서 선언하기
			System.out.println("결과: " + results); //출력값
			break; //switch문 빠져 나오기
			
		case(3) : //사용자가 3을 입력했을 때
			System.out.print("첫 번째 숫자 :"); //출력값
			num_fir = key.nextInt(); //사용자에게 정수값 입력받아 선언하기
			System.out.print("두 번째 숫자 :"); //출력값
			num_sec = key.nextInt(); //사용자에게 정수값 입력받아 선언하기
			results = num_fir * num_sec; //사용자에게 받은 정수 두개를 곱하여 선언하기
			System.out.println("결과: " + results); //출력값
			break; //switch문 빠져 나오기
			
		case(4) : //사용자가 4을 입력했을 때
			System.out.print("첫 번째 숫자 :"); //출력값
			num_fir = key.nextInt(); //사용자에게 정수값 입력받아 선언하기
			System.out.print("두 번째 숫자 :"); //출력값
			num_sec = key.nextInt(); //사용자에게 정수값 입력받아 선언하기
			result_s = (double)num_fir / (double)num_sec;
			//사용자에게 받은 정수 두개를 나누어 실수로 선언하기
			System.out.println("결과: " + result_s); //출력값
			break; //switch문 빠져 나오기
			
		default : //사용자가 1, 2, 3, 4를 입력하지 않았을 때
			System.out.println("잘못 입력하셨습니다."); //출력값
		}
		
		/* 스캐너 기능 종료 */
		key.close(); //스캐너 기능 종료
	}

}
