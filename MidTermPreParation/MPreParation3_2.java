import java.util.Scanner;
public class MPreParation3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		int array[] = new int[5];
		
		System.out.println("숫자를 5개 입력해주세요.");
		
		for (int i = 0 ; i < 5 ; i++) {
			System.out.println((i+1) + ":");
			array[i] = key.nextInt();
		}
		
		int temp = 0;
		
		for (int i = 0 ; i < 5 ; i++) {
			for (int j = (i+1) ; j < 5 ; j++) {
				if (array[i] >= array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("결과");
		for (int i = 0 ; i < 5 ; i++)
			System.out.print(array[i] + "\t");
		
		key.close();
	}

}
