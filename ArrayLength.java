import java.util.Scanner;
public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		int intArray[] = new int[5];
		double sum = 0;
		
		for (int i = 0 ; i < intArray.length ; i++) {
			System.out.print((i+1) + "번째 정수를 입력해주세요. :");
			intArray[i] = key.nextInt();
		}
		for (int i = 0 ; i < intArray.length ; i++)
			sum += intArray[i];
		
		System.out.println("배열 원소의 평균은 " + sum/intArray.length + "입니다.");
		
		key.close();
	}

}
