import java.util.Scanner;
public class MPreparation1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("이름: ");
		String name = key.nextLine();
		
		System.out.println("학번: ");
		int std_num = key.nextInt();
		key.nextLine(); //버퍼 초기화
		
		System.out.println("학과: ");
		String dept = key.nextLine();
		
		System.out.println("결과");
		System.out.println("이름: " + name);
		System.out.println("학번: " + std_num);
		System.out.println("학과: " + dept);
		
		key.close();
	}

}
