import java.util.ArrayList;
import java.util.Vector;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문자열만 삽입가능한 ArrayList 컬렉션 생성
		ArrayList<String> a = new ArrayList<String>();
		
		//키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
		Scanner key = new Scanner(System.in);
		
		for (int i = 0 ; i < 4 ; i++) {
			System.out.print("이름을 입력하세요 >> ");
			String string = key.nextLine();
			a.add(string);
		}
		
		//ArrayList에 들어 있는 모든 이름 출력
		for (int i = 0 ; i <a.size() ; i++) {
			//ArrayList의 i 번째 문자열 얻어오기
			String name = a.get(i);
			System.out.print(name + "\t");
		}
		
		//가장 긴 이름 출력
		int LongestIndex = 0;
		for (int i = 1 ; i <a.size() ; i++) {
			if (a.get(LongestIndex).length() < a.get(i).length())
				LongestIndex = i;
		}
		System.out.println("\n가장 긴 이름은: " + a.get(LongestIndex));
	}

}
