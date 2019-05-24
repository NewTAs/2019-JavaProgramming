import java.util.ArrayList;
import java.util.Scanner;

class Student {
	String Name, Dept;
	int Grade;

	Student(String Name, String Dept, int Grade) {
		this.Name = Name;
		this.Dept = Dept;
		this.Grade = Grade;
	}

	public void list(Student s) {
		System.out.println("이름: " + s.Name);
		System.out.println("학과: " + s.Dept);
		System.out.println("학년: " + s.Grade);
	}
}

public class LabAssignment8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> SuT = new ArrayList<Student>();
		Scanner key = new Scanner(System.in);
		int User_num = 0;
		Student s = null; // 학생 객체 초기화

		System.out.println("학번: 201804037");
		System.out.println("이름: 황재민");
		System.out.println("==================");

		System.out.println(">> 학생관리 시스템 <<");

		do {
			System.out.println("1.학생 추가\t2.학생 삭제\t3.학생 리스트보기\t0.종료");
			User_num = key.nextInt();
			key.nextLine();

			switch (User_num) {
			case 1:
				System.out.println("이름:");
				String name = key.nextLine();
				System.out.println("학과:");
				String dept = key.nextLine();
				System.out.println("학년:");
				int grade = key.nextInt();

				s = new Student(name, dept, grade);
				SuT.add(s);

				break;
			case 2:
				System.out.println("삭제할 학생 번호");
				int num = key.nextInt();
				SuT.remove(num - 1);
				break;
			case 3:
				for (int i = 0; i < SuT.size(); i++) {
					System.out.println("====== " + (i + 1) + " ======");
					s.list(s);
				}
				break;
			case 0:
				break;
			default:
				System.out.println("잘못 눌렀습니다.");
				break;
			}
		} while (User_num != 0);
		System.out.println("종료");
	}

}
