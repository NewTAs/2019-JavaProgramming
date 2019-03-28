import java.util.Scanner;

public class Assignment_Re1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int nums; //사용자에게 정수를 입력받아 대입할 변수 선언
	
	/* 스캐너 기능 선언 부분 */
	Scanner key = new Scanner(System.in); //스캐너 기능 선언
	
	/* 사용자에게 출력&입력받기 */
	System.out.println("정수를 입력해주세요!"); //사용자에게 출력
	nums = key.nextInt(); //사용자에게 값 입력받기
	
	/* 사용자에게 결과 출력하기 */
	System.out.println( nums % 2 == 1 ? "홀수" : "짝수" ); //nums을 2로 나누었을 때 1이면 홀수, 아니면 짝수 출력 
	
	/* 스캐너 기능 종료 */
	key.close(); //스캐너 기능 종료
	}
}
