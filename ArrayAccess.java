import java.util.Scanner;
public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int intArray[] = new int[5];
		int max = 0;
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.print((i+1) + "��° ������ �Է����ּ���. :");
			intArray[i] = key.nextInt();
			if (intArray[i] > max)
				max = intArray[i];
		}
		System.out.println("�Էµ� ������ ���� ū ���� " + max + "�Դϴ�.");
		
		key.close();
	}

}
