import java.util.Scanner; //스캐너 기능 불러오기

class music { //music 클래스 선언
	String song; //string 형태의 변수 선언
	String singer; //string 형태의 변수 선언
	int count; //int 형태의 변수 선언
	String arrays[][]; //string 배열 선언

	public music() { //music() 생성자를 선언
	}

	public void input_array(String array[][]) { //input_array이라는 함수 선언
		this.arrays = array; //array 값을 class 내의 배열에 선언
		}
	
	public String[][] input(String song, String singer, int count) { //input이라는 함수 선언: 매개변수는 song, singer, count
		this.song = song; //song 매개변수를 class 내의 변수에 선언
		this.singer = singer; //song 매개변수를 class 내의 변수에 선언
		this.count = count; //song 매개변수를 class 내의 변수에 선언
		
		arrays[count][0] = song; //배열에 선언
		arrays[count][1] = singer; //배열에 선언
		
		return arrays; //배열을 선언
	}

	public void result() { // result라는 함수 선언
		for (int i = 0; i < count+1; i++) { //for 반복문(0부터 count까지)
			for (int j = 0; j < 1; j++) { //for 반복문(0부터 1까지)
				System.out.print("노래 이름: " + arrays[i][j] + "\t\t"); //노래 이름 출력
				System.out.println("가수: " + arrays[i][j+1]); //가수 출력
			}
		}
	}
}

class LabAssignment5_2 {

	int check_number; //int 변수 선언
	
	public void checking(int numbering) { //checking이라는 함수 선언
		this.check_number = numbering; //numbering을 클래스 내의 변수에 대입
		
		if (check_number == 0 || check_number < 0) { //만약 check_number가 0이거나 0 미만이라면
			System.out.println("음악을 추가하지 않습니다."); //출력
		}
	}
}

public class LabAssignment5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 선언 */
		int first_int, music_count, k = 0; //int 함수 선언
		String aarary[][]; //String 배열 선언
		Scanner key = new Scanner(System.in); //스캐너 기능 선언
		music aMusic = new music(); //music 클래스 선언
		LabAssignment5_2 aLab5_2 = new LabAssignment5_2(); //LabAssignment5_2 클래스 선언

		/* 초기 화면 */
		System.out.println("학번: **********");  //출력값
		System.out.println("이름: ***"); //출력값
		System.out.println("===================="); //출력

		System.out.println("Music Player"); //출력
		
		/* 사용자의 입력 프로그램  */
		do { //do~while 반복문 사용
			System.out.println("1. 음악 리스트 보기\t 2.음악 리스트 만들기\t 0. 끝내기"); //출력
			first_int = key.nextInt(); //사용자에게 숫자 입력받기
			
			switch (first_int) { //switch~case 문 사용
			
			case 0: //만약 사용자가 0을 입력했다면
				break; //do~while문 종료
				
			case 1: //만약 사용자가 1을 입력했다면
				if (k == 0) { //만약 Music 클래스의 count 변수가 0이라면
					System.out.println("음악이 없습니다."); //출력
					break; //do~while문 종료
				}
				else { //만약 Music 클래스의 count 변수가 0이 아니라면
					aMusic.result(); //Music의 클래스의 result 함수 실행
					break; //do~while문 종료
				}
				
			case 2: //만약 사용자가 2를 입력했다면
				System.out.println("추가할 음악의 개수 :"); //출력
				music_count = key.nextInt(); //사용자에게 정수를 입력받음
				key.nextLine(); //버퍼 초기화
				aLab5_2.checking(music_count); //LabAssignment5_2 클래스의 checking() 함수 사용
				
				if (music_count != 0 && music_count > 0) {//만약 music_count가 1 이상일 때
					System.out.println("음악 추가"); //출력
				
					aMusic.count = music_count; //Music 클래스의 count 변수에 music_count 값 선언
					aarary = new String[music_count][2]; //aarary라는 변수 선언
					aMusic.input_array(aarary);
				
					for (k = 0; k < music_count; k++) { //for 반복문 (0부터 music_count 까지)
						System.out.println((k + 1) + ". 노래제목 :"); //출력
						String song = key.nextLine(); //사용자에게 String값을 입력받음
						System.out.println((k + 1) + ". 가수 :"); //출력
						String singer = key.nextLine(); //사용자에게 String값을 입력받음
						
						aMusic.input(song, singer, k); //입력값을 class에 넣음
					}
					break; //do~while문 종료
				}
				
			default: //만약 사용자가 0, 1, 2 이외의 숫자를 입력했다면
				System.out.println("잘못 입력하셨습니다."); //출력
				break; //do~while문 종료
			}
		} while (first_int != 0); //만약 first_int 값이 0이라면 종료, 아니면 다시 반복
		System.out.println("시스템 종료"); //출력
		
		/* 스캐너 기능 종료 */
		key.close(); //스캐너 기능 종료
	}

}