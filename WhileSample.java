import java.util.Scanner;
public class WhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		int n = 0, i = 0;
		double sum = 0;
		
		while((i = key.nextInt()) != 0) {
			sum += i;
			n++;
		}
		System.out.println("�Էµ� ���� ������ " + n + "���̸� ����� " + sum / n + "�Դϴ�.");
		
		key.close();
	}

}
