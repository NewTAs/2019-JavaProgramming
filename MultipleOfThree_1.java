import java.util.Scanner;
public class MultipleOfThree_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ�: ");
		int number = key.nextInt();
		
		if (number % 3 == 0)
			System.out.println("3�� ����Դϴ�.");
		else
			System.out.println("3�� ����� �ƴմϴ�.");
		
		key.close();
	}

}
