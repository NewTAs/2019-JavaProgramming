import java.util.Scanner;

class MPreParation5_1_Music {
	private String song, singer;
	
	public MPreParation5_1_Music(String song, String singer) {
		this.song = song;
		this.singer = singer;
	}
	
	public void result() {
		System.out.println("�뷡 �̸� : " + song + "\t���� : " + singer);
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
			System.out.println("1.���� ����Ʈ ����\t2.���� ����Ʈ �����\t0.������");
			n = key.nextInt();
			
			if (n == 0) {
				System.out.println("�ý��� ����");
			}
			
			else if (n == 1) {
				try {
					for (int i = 0 ; i < music.length; i++)
						music[i].result();
				}
				catch (NullPointerException e) {
					System.out.println("������ �����ϴ�.");
				}
			}
			
			else if (n == 2) {
				System.out.println("�߰��� ������ ���� :");
				num = key.nextInt();
				key.nextLine();
				
				if (num <= 0)
					System.out.println("������ �߰����� �ʽ��ϴ�.");
				else {
					music = new MPreParation5_1_Music[num];
					System.out.println("���� �߰�");
					
					for (int i = 0 ; i < music.length ; i++) {
						System.out.println((i+1) + ". �뷡 ���� :");
						String song = key.nextLine();
						System.out.println((i+1) + ". ���� :");
						String singer = key.nextLine();
						music[i] = new MPreParation5_1_Music(song, singer);
					}
				}
			}
			else
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} while (n != 0);
		
		key.close();
	}

}
