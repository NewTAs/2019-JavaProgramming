class Point {
	int x, y;
	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void showPoint() {
		System.out.println("(" + x + " , " + y + ")");
	}
}
public class ColorPoint extends Point {

	String color;
	void setColor(String color) {
		this.color = color;
	}
	
	void showColorPoint() {
		System.out.print(color);
		showPoint(); //non-static�� �����Ӱ� �ҷ��� �� ����(��ӹޱ⿡ �ڽ��� ��ó�� ��� ����)
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}
