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
		System.out.println("�̸�: " + s.Name);
		System.out.println("�а�: " + s.Dept);
		System.out.println("�г�: " + s.Grade);
	}
}

public class LabAssignment8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> SuT = new ArrayList<Student>();
		Scanner key = new Scanner(System.in);
		int User_num = 0;
		Student s = null; // �л� ��ü �ʱ�ȭ

		System.out.println("�й�: 201804037");
		System.out.println("�̸�: Ȳ���");
		System.out.println("==================");

		System.out.println(">> �л����� �ý��� <<");

		do {
			System.out.println("1.�л� �߰�\t2.�л� ����\t3.�л� ����Ʈ����\t0.����");
			User_num = key.nextInt();
			key.nextLine();

			switch (User_num) {
			case 1:
				System.out.println("�̸�:");
				String name = key.nextLine();
				System.out.println("�а�:");
				String dept = key.nextLine();
				System.out.println("�г�:");
				int grade = key.nextInt();

				s = new Student(name, dept, grade);
				SuT.add(s);

				break;
			case 2:
				System.out.println("������ �л� ��ȣ");
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
				System.out.println("�߸� �������ϴ�.");
				break;
			}
		} while (User_num != 0);
		System.out.println("����");
	}

}
