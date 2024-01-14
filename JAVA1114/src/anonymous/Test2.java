package anonymous;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * run() 메서드를 가지는 인터페이스 Vehicle을 정의하고
		 * 익명 구현 객체를 이용하여 필드, 로컬변수의 초기값과
		 * 메서드의 매개값으로 사용. 아래 내용을 출력
		 * 필드 : 자전거가 달립니다!
		 * 로컬변수의 초기값 : 승용차가 달립니다!
		 * 메서드의 매개변수 : 트럭이 달립니다!
		 */
		
		Run r = new Run();
		r.bicycle.run();
		r.method1();
		r.method2(new Vehicle() {
			@Override
			public void run() {
				System.out.println("트럭이 달립니다!");
			}
		});

	} // main() 메서드 끝
	
} // Test2 클래스 끝

interface Vehicle{
	void run();
}

class Run{
	// 멤버 변수
	Vehicle bicycle = new Vehicle() {
		
		@Override
		public void run() {
			System.out.println("자전거가 달립니다!");
		}
	};
	
	// 로컬 변수
	public void method1() {
		Vehicle car = new Vehicle() {
			@Override
			public void run() {
				System.out.println("승용차가 달립니다!");
			}
		};
		car.run();
	}
	
	// 매개 변수
	public void method2(Vehicle truck) {
		truck.run();
	}
}
