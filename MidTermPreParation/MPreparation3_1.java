import java.util.Scanner;
public class MPreparation3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("가장 작은 수 찾기");
		System.out.println("숫자를 5개 입력해주세요.");
		
		int num[] = new int[5];
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println((i+1) + ":");
			num[i] = key.nextInt();
		}
		
		System.out.print("가장 작은 수는 :");
		
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
