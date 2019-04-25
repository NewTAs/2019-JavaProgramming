import java.util.Scanner;
public class MPreparation1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner key = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = key.nextLine();
		
		System.out.println("학번 : ");
		int std_num = key.nextInt();
		key.nextLine();
		
		System.out.println("학과 : ");
		String dept = key.nextLine();
		
		System.out.println("성별 (1. 남 2. 여 ) :");
		int gender =key.nextInt();
		
		int ko, eng,math, sum; double avg;
		
		System.out.println("국어 :");
		ko = key.nextInt();
		
		System.out.println("영어 :");
		eng = key.nextInt();
		
		System.out.println("수학 :");
		math = key.nextInt();

		sum = ko+eng+math;
		
		System.out.println("결과 ");
		System.out.println("이름 :" + name + "\n학번 :" + std_num + "\n학과 :" + dept);
		System.out.println("성별 :"+((gender==1)?"남자 ":"여자 "));
		avg =sum/3.0; System.out.println("총점수 :"+sum);
		System.out.printf("평균 : %.2f",avg);

		key.close();
	}

}
