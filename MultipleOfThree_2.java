import java.util.Scanner;
public class MultipleOfThree_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ�: ");
		int number = key.nextInt();
		
		System.out.println((number % 3 == 0) ? "3�� ����Դϴ�." : "3�� ����� �ƴմϴ�.");
		
		key.close();
	}

}
