import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int intArray[] = new int[5];
		double sum = 0;
		
		for (int i = 0 ; i < intArray.length ; i++) {
			System.out.print((i+1) + "��° ������ �Է����ּ���. :");
			intArray[i] = key.nextInt();
		}
		for (int i = 0 ; i < intArray.length ; i++)
			sum += intArray[i];
		
		System.out.println("�迭 ������ ����� " + sum/intArray.length + "�Դϴ�.");
		
		key.close();
	}

}
