import java.util.Scanner;
public class MPreParation4_3 {

	final double PI = 3.141592;
	private double radius;
	
	public MPreParation4_3() {}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double area() {
		return PI * radius * radius;
	}
	
	public void showCircle() {
		System.out.println("������ : " + getRadius());
		System.out.println("���� : " + area());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("�������� �Է��ϼ���. :");
		double radius = key.nextInt();
		
		MPreParation4_3 c = new MPreParation4_3();
		c.setRadius(radius);
		c.showCircle();
		
		key.close();
	}

}
