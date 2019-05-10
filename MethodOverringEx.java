class DObject {
	public DObject next;
	
	public DObject() {
		next = null;
	}
	
	public void draw() {
		System.out.println("DObject draw");
	}
}

class Line extends DObject {
	public void draw() { //�޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends DObject {
	public void draw() { //�޼ҵ� �������̵�
		System.out.println("Rect");
	}
}

class Circle extends DObject {
	public void draw() { //�޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class MethodOverringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DObject obj = new DObject();
		Line line = new Line();
		DObject p = new Line();
		DObject r = line;
		
		obj.draw(); // DObject.draw() �޼ҵ� ����. "DObject draw" ���
		line.draw();// Line.draw() �޼ҵ� ����. "Line" ���
		p.draw(); // �������̵��� �޼ҵ� Line.draw() ����, "Line" ���
		r.draw(); // �������̵��� �޼ҵ� Line.draw() ����, "Line" ���
		
		DObject rect = new Rect();
		DObject circle = new Circle();
		rect.draw(); // �������̵��� �޼ҵ� Rect.draw() ����, "Rect" ��
		circle.draw(); // �������̵��� �޼ҵ� Circle.draw() ����, "Circle" ���

	}

}
