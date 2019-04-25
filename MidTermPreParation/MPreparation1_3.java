import java.util.Scanner;
public class MPreparation1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("정수를 입력해주세요. :");
		int num = key.nextInt();
		System.out.println((num % 2 == 0) ? "짝수":"홀수");
		
		key.close();
	}

}
