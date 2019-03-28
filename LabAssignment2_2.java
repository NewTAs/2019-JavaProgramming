import java.util.*; //util 모든 기능 불러오기
public class LabAssignment2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 변수 선언 부분 */
		int num_user = 0, num_com = 0; //int(정수) 변수 선언
		
		/* 출력 */
		System.out.println("학번: 201804037");  //출력값
		System.out.println("이름: 황재민"); //출력값
		System.out.println("============\n"); //출력값
		
		/* 스캐너 기능 활성화 */
		Scanner key = new Scanner(System.in); //스캐너 기능 활성화

		/* 반복문 */
		do {
			System.out.println("가위(1)\t바위(2)\t보(3)\t 중 하나를 입력하세요!"); //출력
			num_user = key.nextInt(); //사용자에게 정수값 입력받아 선언하기
			num_com = (int)(Math.random()*3) + 1; //랜덤 함수로 정수값 설정하여 선언하기
			
			if (num_user == 1) { //사용자가 1을 입력했을 때
				System.out.println("당신은 " + num_user + "을(를) 냈습니다."); //출력
				System.out.println("컴퓨터는 " + num_com + "을(를) 냈습니다."); //출력
				
				if (num_com == 1) //컴퓨터에 저장된 값이 1일 때
					System.out.println("비겼습니다."); //출력
				else if (num_com == 2) //컴퓨터에 저장된 값이 2일 때
					System.out.println("졌습니다."); //출력
				else //컴퓨터에 저장된 값이 3일 때
					System.out.println("이겼습니다."); //출력
				}
			
			else if (num_user == 2) { //사용자가 2를 입력했을 때
				System.out.println("당신은 " + num_user + "을(를) 냈습니다."); //출력
				System.out.println("컴퓨터는 " + num_com + "을(를) 냈습니다."); //출력
				
				if (num_com == 1) //컴퓨터에 저장된 값이 1일 때
					System.out.println("이겼습니다."); //출력
				else if (num_com == 2) //컴퓨터에 저장된 값이 2일 때
					System.out.println("비겼습니다."); //출력
				else //컴퓨터에 저장된 값이 3일 때
					System.out.println("졌습니다."); //출력
				}
			
			else if (num_user == 3) { //사용자가 3을 입력했을 때
				System.out.println("당신은 " + num_user + "을(를) 냈습니다."); //출력
				System.out.println("컴퓨터는 " + num_com + "을(를) 냈습니다."); //출력
				
				if (num_com == 1) //컴퓨터에 저장된 값이 1일 때
					System.out.println("졌습니다."); //출력
				else if (num_com == 2) //컴퓨터에 저장된 값이 2일 때
					System.out.println("이겼습니다."); //출력
				else //컴퓨터에 저장된 값이 3일 때
					System.out.println("비겼습니다."); //출력
				}

			else if (num_user != 0) //사용자가 1, 2, 3이 아닌 다른 값을 입력했을 때
				System.out.println("입력 범위가 아닙니다."); //출력
			
		} while(num_user != 0); //사용자가 0을 입력했을 때에 반복문 종료
		System.out.println("종료됩니다."); //출력
		
		/* 스캐너 기능 종료 */
		key.close(); //스캐너 기능 종료
	}

}
