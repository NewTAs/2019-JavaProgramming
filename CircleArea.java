
public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.141592; // 원주율 파이 상수 선언
		double radius = 10; // 원의 반지름
		double circleArea = 0; // 원의 면적 초기화
		
		circleArea = radius * radius * PI;  // 원의 면적 계산
		
		//원의 면적을 화면에 출력
		System.out.print("원의 면적 = ");
		System.out.println(circleArea);
	}
}