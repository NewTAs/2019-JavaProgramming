import java.util.Scanner; //Scanner 기능 선언하기
public class LabAssignment3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 스캐너 기능 선언하기 */
		Scanner key = new Scanner(System.in); //스캐너 선언
		
		/* 초기 화면 */
		System.out.println("학번: *********");  //출력값
		System.out.println("이름: ***"); //출력값
		System.out.println("============\n"); //출력
		
		System.out.println("학생 수를 입력해주세요."); //출력
		int student_number = key.nextInt(); //사용자에게 학생수를 정수로 입력받아 선언하기
		int intArray[] = new int[student_number]; //배열 선언하기
		
		if (student_number == 0) { //사용자가 학생 수를 0명으로 입력했다면
			System.out.println("학생수를 잘못 입력하셨습니다. 시스템이 종료됩니다."); //출력
		}
		
		else { //사용자가 학생 수를 0명이 아닌 다를 수를 입력했다면
			System.out.println(student_number + "명의 프로그래밍 점수를 입력해주세요. (0~100)"); //출력
			for (int i = 1 ; i <= student_number ; i++) { //입력한 학생 수에 대해 점수를 입력받기(반복문)
				System.out.print(i + ": "); //출력
				intArray[(i-1)] = key.nextInt();  //사용자가 입력한 정수를 배열에 선언하기
				
				if (intArray[(i-1)] < 0 || intArray[(i-1)] > 100) { //만약 사용자가 점수를 0 미만, 100 초과 했다면
					System.out.println("잘못 입력하셨습니다."); //출력
					System.out.println(i + "번째 학생의 점수는 0점으로 처리 됩니다."); //출력
					intArray[(i-1)] = 0; //배열 값에 0점을 선언
				}
			}
			
			/* 결과값 표기 */
			System.out.println("\n결과"); //출력
			
			for (int i = 0 ; i < student_number ; i++) { //학생 수에 대한 반복문 선언
				System.out.print((i+1) + "번 " + intArray[i] + "점" + " :"); //출력
				int prints = intArray[i] / 10; //배열에 저장된 값을 10으로 나눈 값을 선언
				
				if (prints == 0 || prints == 1) { //만약 배열에 저장된 값을 10으로 나눈 값이 0 또는 1일 때
					System.out.println('*'); //문자 하나만 출력
					continue; //반복문 처음으로 돌아감
				}
				for (int j = 0 ; j < prints ; j++) //별 출력에 대한 반복문 선언
					System.out.print('*'); //출력
				System.out.println(); //출력
			}
		}
		/* 스캐너 기능 종료 */
		key.close(); //스캐너 기능 종료
	}
}
