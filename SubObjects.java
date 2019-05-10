class SuperObjects {
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println(name);
	}
}

public class SubObjects extends SuperObjects {
	protected String name;
	public void draw() {
		name = "Sub";
		super.name = "Super";
		super.draw();
		System.out.println(name);
	}
	public static void main(String[] args) {
		SuperObjects b = new SubObjects();
		b.paint();
	}

}
