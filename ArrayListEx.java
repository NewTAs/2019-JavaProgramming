import java.util.ArrayList;
import java.util.Vector;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ڿ��� ���԰����� ArrayList �÷��� ����
		ArrayList<String> a = new ArrayList<String>();
		
		//Ű����κ��� 4���� �̸��� �Է¹޾� ArrayList�� ����
		Scanner key = new Scanner(System.in);
		
		for (int i = 0 ; i < 4 ; i++) {
			System.out.print("�̸��� �Է��ϼ��� >> ");
			String string = key.nextLine();
			a.add(string);
		}
		
		//ArrayList�� ��� �ִ� ��� �̸� ���
		for (int i = 0 ; i <a.size() ; i++) {
			//ArrayList�� i ��° ���ڿ� ������
			String name = a.get(i);
			System.out.print(name + "\t");
		}
		
		//���� �� �̸� ���
		int LongestIndex = 0;
		for (int i = 1 ; i <a.size() ; i++) {
			if (a.get(LongestIndex).length() < a.get(i).length())
				LongestIndex = i;
		}
		System.out.println("\n���� �� �̸���: " + a.get(LongestIndex));
	}

}
