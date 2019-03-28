import java.util.Scanner;
public class Helptest { 
   public static void main(String[]args){
	   
	   Scanner kbd=new Scanner(System. in); 
	      System. out.println("=======================");
	      System. out.println("201804036");
	      System. out.println("홍정현");
	      System. out.println("=======================");
	      System. out.println("계산기 프로그램 입니다. 다음 숫자 중 선택하세요.");
	      System. out.println("1. 더하기 2. 빼기 3. 곱하기  4.나누기");
	      int n = kbd.nextInt();
	      switch(n) {
	      case 1:
	         System. out.println("첫번째 숫자를 입력하세요.");
	         int a = kbd.nextInt();
	         System. out.println("두번째 숫자를 입력하세요.");
	         int b = kbd.nextInt();
	         System.out.println("결과: " + (a+b));
	         break;
	      case 2:
	         System. out.println("첫번째 숫자를 입력하세요.");
	         int c = kbd.nextInt();
	         System. out.println("두번째 숫자를 입력하세요.");
	         int d = kbd.nextInt();
	         System.out.println("결과: " + (c-d));
	         break;
	      case 3:
	         System. out.println("첫번째 숫자를 입력하세요.");
	         int e = kbd.nextInt();
	         System. out.println("두번째 숫자를 입력하세요.");
	         int f = kbd.nextInt();
	         System.out.println("결과: " + (e*f));
	         break;
	      case 4:
	         System. out.println("첫번째 숫자를 입력하세요.");
	         double g = kbd.nextDouble();
	         System. out.println("두번째 숫자를 입력하세요.");
	         double h = kbd.nextDouble();
	         System.out.println("결과: " + (g/h));
	         break; 
	         
	           default:
	            System.out.println("잘못 입력하셨습니다.");
	      
	      }
	      
	   }
	}
   