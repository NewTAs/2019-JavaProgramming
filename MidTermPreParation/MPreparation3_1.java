import java.util.Scanner;
public class MPreparation3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("���� ���� �� ã��");
		System.out.println("���ڸ� 5�� �Է����ּ���.");
		
		int num[] = new int[5];
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println((i+1) + ":");
			num[i] = key.nextInt();
		}
		
		System.out.print("���� ���� ���� :");
		
		int temp = num[0];
		
		for (int i = 0 ; i < 5 ; i++) {
			if (num[0] >= num[i]) {
				temp = num[0];
				num[0] = num[i];
				num[i] = temp;
			}
		}
		
		System.out.println(num[0]);
		
		key.close();
	}

}
