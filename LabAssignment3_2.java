import java.util.Scanner; //스캐너 기능 불러오기
public class LabAssignment3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 스캐너 기능 선언하기 */
		Scanner key = new Scanner(System.in); //스캐너 기능 선언하기
		
		/* 초기 화면 */
		System.out.println("학번: *********");  //출력값
		System.out.println("이름: ***"); //출력값
		System.out.println("============"); //출력
		
		System.out.println("행렬의 크기를 입력해주세요."); //출력
		int width = key.nextInt(), height = key.nextInt(); //사용자에게 행렬의 크기를 입력받아서 각각 선언하기
		
		int first_matrix[][] = new int[width][height]; //배열과 배열의 크기 선언하기
		int second_matrix[][] = new int[width][height]; //배열과 배열의 크기 선언하기
		int result_matrix[][] = new int[width][height]; //배열과 배열의 크기 선언하기
		
		/* 첫번째 배열 선언하기  */
		System.out.println("첫 번째 matrix"); //출력
		for (int i = 0 ; i < width ; i++) { //행에 대한 반복문
			for (int j = 0 ; j < height ; j++) { //열에 대한 반복문
				System.out.print("(" + i + ", " + j + ") :"); //출력
				first_matrix[i][j] = key.nextInt(); //사용자에게 값을 입력받아서 선언
			}
		}
		for (int i = 0 ; i < width ; i++) { //행에 대한 반복문
			for (int j = 0 ; j < height ; j++) { //열에 대한 반복문
				System.out.print(first_matrix[i][j]); //배열 출력
				System.out.print('\t'); //출력
			}
			System.out.println(); //공백 출력
		}
		
		/* 두번째 배열 선언하기 */
		System.out.println("두 번째 matrix"); //출력
		for (int i = 0 ; i < width ; i++) { //행에 대한 반복문
			for (int j = 0 ; j < height ; j++) { //열에 대한 반복문
				System.out.print("(" + i + ", " + j + ") :"); //출력
				second_matrix[i][j] = key.nextInt(); //사용자에게 값을 입력받아서 선언
			}
		}
		for (int i = 0 ; i < width ; i++) { //행에 대한 반복문
			for (int j = 0 ; j < height ; j++) { //열에 대한 반복문
				System.out.print(second_matrix[i][j]); //배열 출력
				System.out.print('\t'); //출력
			}
			System.out.println(); //공백 출력
		}
		
		/* 배열 합하기 */
		for (int i = 0 ; i < width ; i++) { //행에 대한 반복문
			for (int j = 0 ; j < height ; j++) //열에 대한 반복문
				result_matrix[i][j] = first_matrix[i][j] + second_matrix[i][j]; //첫번째 행렬과 두번째 행렬을 합하여 선언
		}
		
		/* 결과문 출력 */
		System.out.println("\n결과"); //출력
		for (int i = 0 ; i < width ; i++) { //행에 대한 반복문
			for (int j = 0 ; j < height ; j++) { //열에 대한 반복문
				System.out.print(result_matrix[i][j]); //배열 출력
				System.out.print('\t'); //출력
			}
			System.out.println(); //공백 출력
		}
		/* 스캐너 기능 종료 */
		key.close(); //스캐너 기능 종료
	}

}
