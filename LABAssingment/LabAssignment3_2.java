import java.util.Scanner; //��ĳ�� ��� �ҷ�����
public class LabAssignment3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* ��ĳ�� ��� �����ϱ� */
		Scanner key = new Scanner(System.in); //��ĳ�� ��� �����ϱ�
		
		/* �ʱ� ȭ�� */
		System.out.println("�й�: **********");  //��°�
		System.out.println("�̸�: ***"); //��°�
		System.out.println("============"); //���
		
		System.out.println("����� ũ�⸦ �Է����ּ���."); //���
		int width = key.nextInt(), height = key.nextInt(); //����ڿ��� ����� ũ�⸦ �Է¹޾Ƽ� ���� �����ϱ�
		
		int first_matrix[][] = new int[width][height]; //�迭�� �迭�� ũ�� �����ϱ�
		int second_matrix[][] = new int[width][height]; //�迭�� �迭�� ũ�� �����ϱ�
		int result_matrix[][] = new int[width][height]; //�迭�� �迭�� ũ�� �����ϱ�
		
		/* ù��° �迭 �����ϱ�  */
		System.out.println("ù ��° matrix"); //���
		for (int i = 0 ; i < width ; i++) { //�࿡ ���� �ݺ���
			for (int j = 0 ; j < height ; j++) { //���� ���� �ݺ���
				System.out.print("(" + i + ", " + j + ") :"); //���
				first_matrix[i][j] = key.nextInt(); //����ڿ��� ���� �Է¹޾Ƽ� ����
			}
		}
		for (int i = 0 ; i < width ; i++) { //�࿡ ���� �ݺ���
			for (int j = 0 ; j < height ; j++) { //���� ���� �ݺ���
				System.out.print(first_matrix[i][j]); //�迭 ���
				System.out.print('\t'); //���
			}
			System.out.println(); //���� ���
		}
		
		/* �ι�° �迭 �����ϱ� */
		System.out.println("�� ��° matrix"); //���
		for (int i = 0 ; i < width ; i++) { //�࿡ ���� �ݺ���
			for (int j = 0 ; j < height ; j++) { //���� ���� �ݺ���
				System.out.print("(" + i + ", " + j + ") :"); //���
				second_matrix[i][j] = key.nextInt(); //����ڿ��� ���� �Է¹޾Ƽ� ����
			}
		}
		for (int i = 0 ; i < width ; i++) { //�࿡ ���� �ݺ���
			for (int j = 0 ; j < height ; j++) { //���� ���� �ݺ���
				System.out.print(second_matrix[i][j]); //�迭 ���
				System.out.print('\t'); //���
			}
			System.out.println(); //���� ���
		}
		
		/* �迭 ���ϱ� */
		for (int i = 0 ; i < width ; i++) { //�࿡ ���� �ݺ���
			for (int j = 0 ; j < height ; j++) //���� ���� �ݺ���
				result_matrix[i][j] = first_matrix[i][j] + second_matrix[i][j]; //ù��° ��İ� �ι�° ����� ���Ͽ� ����
		}
		
		/* ����� ��� */
		System.out.println("\n���"); //���
		for (int i = 0 ; i < width ; i++) { //�࿡ ���� �ݺ���
			for (int j = 0 ; j < height ; j++) { //���� ���� �ݺ���
				System.out.print(result_matrix[i][j]); //�迭 ���
				System.out.print('\t'); //���
			}
			System.out.println(); //���� ���
		}
		/* ��ĳ�� ��� ���� */
		key.close(); //��ĳ�� ��� ����
	}

}
