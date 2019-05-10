interface Clock {
	public static final int ONEDAY = 24; // 상수 필드 선언 
	abstract public int getMinute();
	abstract public int getHour();
	abstract void setMinute(int i);
	abstract void setHour(int i);
}
interface Car {
	int MAXIMUM_SPEED = 260; // static final 생략
	int moveHandle(int degree); // abstract public 생략 
	int changeGear(int gear); // abstract public 생략 }
}
new Clock(); // 오류. 인터페이스의 객체 생성 불가 
new Car(); // 오류. 인터페이스의 객체 생성 불가
Clock clock; // 인터페이스 Clock의 레퍼런스 변수 선언 가능
Car car; // 인터페이스 Clock의 레퍼런스 변수 선언 가능