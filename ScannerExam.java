import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner alapa = new Scanner(System.in);
				
		System.out.println("���̿� ü��, ������ ��ĭ���� �и��Ͽ� ������� �Է����ּ���.");
		System.out.println("����� ���̴� " + alapa.nextInt() + "�� �Դϴ�.");
		System.out.println("����� ü���� " + alapa.nextDouble() + "kg �Դϴ�.");
		System.out.println("����� ������ " + alapa.nextDouble() + "cm �Դϴ�.");
		
		alapa.close(); //Scanner ����
	}
}
