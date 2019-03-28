import java.util.Scanner;

public class LabAssignment1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 변수 선언  부분 */
		String name, dept; //사용자에게 입력받을 이름 변수와 학과 변수를 'String'으로 선언
		int numb, gender, kor, eng, mat;
		//사용자에게 입력받을 나이 변수, 성별 변수, 국어점수 변수, 영어점수 변수, 수학점수 변수를 'int'로 선언
		double avg; //국어점수와 영어점수, 수학점수의 평균값을 대입할 변수를 'double'로 선언
		
		/* 스캐너 기능 선언 부분 */
		Scanner key = new Scanner(System.in); //스캐너 기능 선언
		
		/* 문장을 출력하고, 사용자에게 입력받는 함수 */
		System.out.println("이름 : "); //"이름 : "을 사용자에게 출력
		name = key.nextLine(); //이름에 대한 값을 입력받음
		
		System.out.println("학번 : "); //"학번 : "을 사용자에게 출력
		numb = key.nextInt(); //나이에 대한 값을 입력받음
		
		key.nextLine(); //nextLine() 버퍼 초기화
		System.out.println("학과 : "); //"학과 : "를 사용자에게 출력
		dept = key.nextLine(); //학과에 대한 값을 입력받음
		
		System.out.println("성별(1.남 2.여)"); //"성별(1.남 2.여)"을 사용자에게 출력
		gender = key.nextInt(); //성별에 대한 값을 입력받음
		
		System.out.println("국어 : "); //"국어 : "를 사용자에게 출력
		kor = key.nextInt(); //국어 성적값을 입력받음
		
		System.out.println("영어 : "); //"영어 : "를 사용자에게 출력
		eng = key.nextInt(); //영어 성적값을 입력받음
		
		System.out.println("수학 : "); //"수학 : "을 사용자에게 출력
		mat = key.nextInt(); //수학 성적값을 입력받음
		
		/* 사용자에게 결과 보여주기 */
		System.out.println("============"); //사용자에게 출력
		System.out.println("이름 : " + name); //사용자에게 출력
		System.out.println("학번 : " + numb); //사용자에게 출력
		System.out.println("학과 : " + dept); //사용자에게 출력
		
		System.out.println(gender == 1 ? "성별 : 남자" : "성별 : 여자" ); //사용자에게 출력
		
		int hap = kor+eng+mat; //국어 성적과 영어 성적, 수학 성적값을 합함
		System.out.println("총점 : " + hap); //사용자에게 출력
		avg = (kor + eng + mat) / 3.0; //평균값 구하기
		System.out.printf("평균 : %.2f", avg); //사용자에게 출력

		/* 스캐너 기능 종료 */
		key.close(); //스캐너 기능 종료
	}
}
