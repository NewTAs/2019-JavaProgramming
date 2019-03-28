import java.util.Scanner;
public class MultipleOfThree_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		System.out.print("수를 입력하시오: ");
		int number = key.nextInt();
		
		System.out.println((number % 3 == 0) ? "3의 배수입니다." : "3의 배수가 아닙니다.");
		
		key.close();
	}

}
