import java.util.Scanner;
public class Helptest { 
   public static void main(String[]args){
	   
	   Scanner kbd=new Scanner(System. in); 
	      System. out.println("=======================");
	      System. out.println("201804036");
	      System. out.println("ȫ����");
	      System. out.println("=======================");
	      System. out.println("���� ���α׷� �Դϴ�. ���� ���� �� �����ϼ���.");
	      System. out.println("1. ���ϱ� 2. ���� 3. ���ϱ�  4.������");
	      int n = kbd.nextInt();
	      switch(n) {
	      case 1:
	         System. out.println("ù��° ���ڸ� �Է��ϼ���.");
	         int a = kbd.nextInt();
	         System. out.println("�ι�° ���ڸ� �Է��ϼ���.");
	         int b = kbd.nextInt();
	         System.out.println("���: " + (a+b));
	         break;
	      case 2:
	         System. out.println("ù��° ���ڸ� �Է��ϼ���.");
	         int c = kbd.nextInt();
	         System. out.println("�ι�° ���ڸ� �Է��ϼ���.");
	         int d = kbd.nextInt();
	         System.out.println("���: " + (c-d));
	         break;
	      case 3:
	         System. out.println("ù��° ���ڸ� �Է��ϼ���.");
	         int e = kbd.nextInt();
	         System. out.println("�ι�° ���ڸ� �Է��ϼ���.");
	         int f = kbd.nextInt();
	         System.out.println("���: " + (e*f));
	         break;
	      case 4:
	         System. out.println("ù��° ���ڸ� �Է��ϼ���.");
	         double g = kbd.nextDouble();
	         System. out.println("�ι�° ���ڸ� �Է��ϼ���.");
	         double h = kbd.nextDouble();
	         System.out.println("���: " + (g/h));
	         break; 
	         
	           default:
	            System.out.println("�߸� �Է��ϼ̽��ϴ�.");
	      
	      }
	      
	   }
	}
   