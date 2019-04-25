
public class MPreParation4_2 {

	int x, y;
	
	public MPreParation4_2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public double getDistance(int x2, int y2) {
		double distance = (x-x2)*(x-x2) + (y-y2)*(y-y2);
		return Math.sqrt(distance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MPreParation4_2 p = new MPreParation4_2(1, 1);
		System.out.println("두 점 사이의 거리: " + p.getDistance(2, 2));
	}

}
