import java.util.Scanner; //��ĳ�� ��� �ҷ�����

class music { //music Ŭ���� ����
	String song; //string ������ ���� ����
	String singer; //string ������ ���� ����
	int count; //int ������ ���� ����
	String arrays[][]; //string �迭 ����

	public music() { //music() �����ڸ� ����
	}

	public void input_array(String array[][]) { //input_array�̶�� �Լ� ����
		this.arrays = array; //array ���� class ���� �迭�� ����
		}
	
	public String[][] input(String song, String singer, int count) { //input�̶�� �Լ� ����: �Ű������� song, singer, count
		this.song = song; //song �Ű������� class ���� ������ ����
		this.singer = singer; //song �Ű������� class ���� ������ ����
		this.count = count; //song �Ű������� class ���� ������ ����
		
		arrays[count][0] = song; //�迭�� ����
		arrays[count][1] = singer; //�迭�� ����
		
		return arrays; //�迭�� ����
	}

	public void result() { // result��� �Լ� ����
		for (int i = 0; i < count+1; i++) { //for �ݺ���(0���� count����)
			for (int j = 0; j < 1; j++) { //for �ݺ���(0���� 1����)
				System.out.print("�뷡 �̸�: " + arrays[i][j] + "\t\t"); //�뷡 �̸� ���
				System.out.println("����: " + arrays[i][j+1]); //���� ���
			}
		}
	}
}

class LabAssignment5_2 {

	int check_number; //int ���� ����
	
	public void checking(int numbering) { //checking�̶�� �Լ� ����
		this.check_number = numbering; //numbering�� Ŭ���� ���� ������ ����
		
		if (check_number == 0 || check_number < 0) { //���� check_number�� 0�̰ų� 0 �̸��̶��
			System.out.println("������ �߰����� �ʽ��ϴ�."); //���
		}
	}
}

public class LabAssignment5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ���� */
		int first_int, music_count, k = 0; //int �Լ� ����
		String aarary[][]; //String �迭 ����
		Scanner key = new Scanner(System.in); //��ĳ�� ��� ����
		music aMusic = new music(); //music Ŭ���� ����
		LabAssignment5_2 aLab5_2 = new LabAssignment5_2(); //LabAssignment5_2 Ŭ���� ����

		/* �ʱ� ȭ�� */
		System.out.println("�й�: **********");  //��°�
		System.out.println("�̸�: ***"); //��°�
		System.out.println("===================="); //���

		System.out.println("Music Player"); //���
		
		/* ������� �Է� ���α׷�  */
		do { //do~while �ݺ��� ���
			System.out.println("1. ���� ����Ʈ ����\t 2.���� ����Ʈ �����\t 0. ������"); //���
			first_int = key.nextInt(); //����ڿ��� ���� �Է¹ޱ�
			
			switch (first_int) { //switch~case �� ���
			
			case 0: //���� ����ڰ� 0�� �Է��ߴٸ�
				break; //do~while�� ����
				
			case 1: //���� ����ڰ� 1�� �Է��ߴٸ�
				if (k == 0) { //���� Music Ŭ������ count ������ 0�̶��
					System.out.println("������ �����ϴ�."); //���
					break; //do~while�� ����
				}
				else { //���� Music Ŭ������ count ������ 0�� �ƴ϶��
					aMusic.result(); //Music�� Ŭ������ result �Լ� ����
					break; //do~while�� ����
				}
				
			case 2: //���� ����ڰ� 2�� �Է��ߴٸ�
				System.out.println("�߰��� ������ ���� :"); //���
				music_count = key.nextInt(); //����ڿ��� ������ �Է¹���
				key.nextLine(); //���� �ʱ�ȭ
				aLab5_2.checking(music_count); //LabAssignment5_2 Ŭ������ checking() �Լ� ���
				
				if (music_count != 0 && music_count > 0) {//���� music_count�� 1 �̻��� ��
					System.out.println("���� �߰�"); //���
				
					aMusic.count = music_count; //Music Ŭ������ count ������ music_count �� ����
					aarary = new String[music_count][2]; //aarary��� ���� ����
					aMusic.input_array(aarary);
				
					for (k = 0; k < music_count; k++) { //for �ݺ��� (0���� music_count ����)
						System.out.println((k + 1) + ". �뷡���� :"); //���
						String song = key.nextLine(); //����ڿ��� String���� �Է¹���
						System.out.println((k + 1) + ". ���� :"); //���
						String singer = key.nextLine(); //����ڿ��� String���� �Է¹���
						
						aMusic.input(song, singer, k); //�Է°��� class�� ����
					}
					break; //do~while�� ����
				}
				
			default: //���� ����ڰ� 0, 1, 2 �̿��� ���ڸ� �Է��ߴٸ�
				System.out.println("�߸� �Է��ϼ̽��ϴ�."); //���
				break; //do~while�� ����
			}
		} while (first_int != 0); //���� first_int ���� 0�̶�� ����, �ƴϸ� �ٽ� �ݺ�
		System.out.println("�ý��� ����"); //���
		
		/* ��ĳ�� ��� ���� */
		key.close(); //��ĳ�� ��� ����
	}

}