import java.util.Scanner;
public class MPreparation1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("�̸� : ");
		String name = key.nextLine();
		
		System.out.println("�й� : ");
		int std_num = key.nextInt();
		key.nextLine();
		
		System.out.println("�а� : ");
		String dept = key.nextLine();
		
		System.out.println("���� (1. �� 2. �� ) :");
		int gender =key.nextInt();
		
		int ko, eng,math, sum; double avg;
		
		System.out.println("���� :");
		ko = key.nextInt();
		
		System.out.println("���� :");
		eng = key.nextInt();
		
		System.out.println("���� :");
		math = key.nextInt();

		sum = ko+eng+math;
		
		System.out.println("��� ");
		System.out.println("�̸� :" + name + "\n�й� :" + std_num + "\n�а� :" + dept);
		System.out.println("���� :"+((gender==1)?"���� ":"���� "));
		avg =sum/3.0; System.out.println("������ :"+sum);
		System.out.printf("��� : %.2f",avg);

		key.close();
	}

}
