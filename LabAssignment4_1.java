import java.util.Scanner; //Scanner 기능 불러오기

/* Circle 클래스 */
class Circle { //Circle 클래스 선언
	final double PI = 3.14159;  //PI 상수 선언
	private double radius; //반지름 변수를 전역변수로 선언
	
	public void setRadius(double radius) { //setRadius라는 메소드 선언(반지름 값 대입)
		this.radius = radius; //괄호 안의 값을 전역변수 반지름에 선언
	}
	public double getRadius() {return radius;} //getRadius라는 메소드 선언 {반지름값 리턴}
	
	public double area() { //area라는 메소드 선언
		double large = PI * radius * radius; //넓이값 계산
		return large; //계산한 넓이값을 리턴
	}
	
	public void showCircle() { //showCircle 메소드 선언
		System.out.print(area()); //출력
	}
}

public class LabAssignment4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 스캐너 기능 불러오기 */
		Scanner key = new Scanner(System.in); //스캐너 기능 불러오기
		
		/* Circle 클래스 불러오기 */
		Circle aCircle = new Circle(); //Circle 클래스를 aCircle로 불러옴을 선언
		
		/* 초기화면 */
		System.out.println("학번: 201804037"); //출력
		System.out.println("이름: 황재민"); //출력
		System.out.println("============\n"); //출력
		
		System.out.println("반지름을 입력해주세요."); //출력
		double num_radius = key.nextDouble(); //사용자에게 반지름 값을 입력받음
		
		/* 결과물 출력 */
		aCircle.setRadius(num_radius); //반지름 값을 Circle 클래스 안에 선언
		
		System.out.println("반지름: " + aCircle.getRadius()); //반지름 값 출력
		System.out.print("넓이: "); //출력
		aCircle.showCircle(); //넓이 값 출력
		
		/* 스캐너 기능 종료 */
		key.close(); //스캐너 기능 종료
	}

}
