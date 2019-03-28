import java.util.Scanner;

public class ScannerExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner alapa = new Scanner(System.in);
				
		System.out.println("나이와 체중, 신장을 빈칸으로 분리하여 순서대로 입력해주세요.");
		System.out.println("당신의 나이는 " + alapa.nextInt() + "살 입니다.");
		System.out.println("당신의 체중은 " + alapa.nextDouble() + "kg 입니다.");
		System.out.println("당신의 신장은 " + alapa.nextDouble() + "cm 입니다.");
		
		alapa.close(); //Scanner 종료
	}
}
