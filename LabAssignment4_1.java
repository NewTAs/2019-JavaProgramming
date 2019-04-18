import java.util.Scanner; //Scanner ��� �ҷ�����

/* Circle Ŭ���� */
class Circle { //Circle Ŭ���� ����
	final double PI = 3.14159;  //PI ��� ����
	private double radius; //������ ������ ���������� ����
	
	public void setRadius(double radius) { //setRadius��� �޼ҵ� ����(������ �� ����)
		this.radius = radius; //��ȣ ���� ���� �������� �������� ����
	}
	public double getRadius() {return radius;} //getRadius��� �޼ҵ� ���� {�������� ����}
	
	public double area() { //area��� �޼ҵ� ����
		double large = PI * radius * radius; //���̰� ���
		return large; //����� ���̰��� ����
	}
	
	public void showCircle() { //showCircle �޼ҵ� ����
		System.out.print(area()); //���
	}
}

public class LabAssignment4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* ��ĳ�� ��� �ҷ����� */
		Scanner key = new Scanner(System.in); //��ĳ�� ��� �ҷ�����
		
		/* Circle Ŭ���� �ҷ����� */
		Circle aCircle = new Circle(); //Circle Ŭ������ aCircle�� �ҷ����� ����
		
		/* �ʱ�ȭ�� */
		System.out.println("�й�: 201804037"); //���
		System.out.println("�̸�: Ȳ���"); //���
		System.out.println("============\n"); //���
		
		System.out.println("�������� �Է����ּ���."); //���
		double num_radius = key.nextDouble(); //����ڿ��� ������ ���� �Է¹���
		
		/* ����� ��� */
		aCircle.setRadius(num_radius); //������ ���� Circle Ŭ���� �ȿ� ����
		
		System.out.println("������: " + aCircle.getRadius()); //������ �� ���
		System.out.print("����: "); //���
		aCircle.showCircle(); //���� �� ���
		
		/* ��ĳ�� ��� ���� */
		key.close(); //��ĳ�� ��� ����
	}

}
