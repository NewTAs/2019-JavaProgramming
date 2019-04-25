import java.util.Scanner;

class MPreParation5_1_Music {
	private String song, singer;
	
	public MPreParation5_1_Music(String song, String singer) {
		this.song = song;
		this.singer = singer;
	}
	
	public void result() {
		System.out.println("노래 이름 : " + song + "\t가수 : " + singer);
	}
}
public class MPreParation5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("Music Player");
		
		MPreParation5_1_Music music[] = null;
		int num = 0, n = 0;
		
		do {
			System.out.println("1.음악 리스트 보기\t2.음악 리스트 만들기\t0.끝내기");
			n = key.nextInt();
			
			if (n == 0) {
				System.out.println("시스템 종료");
			}
			
			else if (n == 1) {
				try {
					for (int i = 0 ; i < music.length; i++)
						music[i].result();
				}
				catch (NullPointerException e) {
					System.out.println("음악이 없습니다.");
				}
			}
			
			else if (n == 2) {
				System.out.println("추가할 음악의 개수 :");
				num = key.nextInt();
				key.nextLine();
				
				if (num <= 0)
					System.out.println("음악을 추가하지 않습니다.");
				else {
					music = new MPreParation5_1_Music[num];
					System.out.println("음악 추가");
					
					for (int i = 0 ; i < music.length ; i++) {
						System.out.println((i+1) + ". 노래 제목 :");
						String song = key.nextLine();
						System.out.println((i+1) + ". 가수 :");
						String singer = key.nextLine();
						music[i] = new MPreParation5_1_Music(song, singer);
					}
				}
			}
			else
				System.out.println("잘못 입력하셨습니다.");
		} while (n != 0);
		
		key.close();
	}

}
