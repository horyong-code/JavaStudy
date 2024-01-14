package abstract_;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Flyer 클래스를 상속받은 SuperMan, Bird, Airplane 인스턴스 생성
		SuperMan s = new SuperMan();
		s.takeOff();
		s.fly();
		s.land();
		System.out.println("--------------------");
		
		Bird b = new Bird();
		b.takeOff();
		b.fly();
		b.land();
		System.out.println("--------------------");
		
		Airplane a = new Airplane();
		a.takeOff();
		a.fly();
		a.land();
		System.out.println("====================");
		
		// SuperMan, Bird, Airplain -> Flyer 타입으로 업캐스팅하여 타형성 활용
		Flyer f = new SuperMan(); // 변수 선언
		f.takeOff();
		f.fly();
		f.land();
		System.out.println("--------------------");
		
		f = new Bird(); // 변수 재사용
		f.takeOff();
		f.fly();
		f.land();
		System.out.println("--------------------");
		
		f = new Airplane(); // 변수 재사용
		f.takeOff();
		f.fly();
		f.land();
		System.out.println("====================");

		
		Flyer[] f2 = {new SuperMan(), new Bird(), new Airplane()};
		
		f2[0].takeOff();
		f2[0].fly();
		f2[0].land();
		System.out.println("--------------------");
		
		f2[1].takeOff();
		f2[1].fly();
		f2[1].land();
		System.out.println("--------------------");
		
		f2[2].takeOff();
		f2[2].fly();
		f2[2].land();
		System.out.println("====================");
		
	} // main() 메서드 끝
} // Ex 클래스 끝

/*
 * 슈퍼맨, 새, 비행기의 공통점 : 비행 가능
 * => 공통점을 추출하여 상위 클래스로 정의하되,
 *    각 서브클래스에서 비행 기능을 반드시 구현하도록 강제성을 부여
 * Flyer 추상 클래스 정의
 * => 이륙(takeOff), 비행(fly), 착륙(land) 추상 메서드 정의
 * => 슈퍼맨, 새, 비행기 서브 클래스 생성
 *    ex) "슈퍼맨 이륙!", "슈퍼맨 비행!", "슈퍼맨 착륙!" 출력
 */

abstract class Flyer{
	
	// 모든 날아다니는 것에 대한 이륙, 비행, 착륙 메서드 정의
	// => 슈퍼클래스로 사용할 Flyer 클래스의 메서드들에는
	//    실행할 코드가 불필요하므로 추상메서드로 정의하고
	//    추상메서드를 포함하는 Flyer 클래스를 추상클래스로 정의
	public abstract void takeOff(); // 이륙
	public abstract void fly(); // 비행
	public abstract void land(); // 착륙
}

// Flyer 클래스를 상속받는 SuperMan, Bird, Airplane 클래스 정의
class SuperMan extends Flyer{

	@Override
	public void takeOff() {
		System.out.println("슈퍼맨 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("슈퍼맨 비행!");
	}

	@Override
	public void land() {
		System.out.println("슈퍼맨 착륙!");
	}
}

class Bird extends Flyer{

	@Override
	public void takeOff() {
		System.out.println("새 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("새 비행!");
	}

	@Override
	public void land() {
		System.out.println("새 착륙!");
	}
}

class Airplane extends Flyer{

	@Override
	public void takeOff() {
		System.out.println("비행기 이륙!");
	}

	@Override
	public void fly() {
		System.out.println("비행기 비행!");
	}

	@Override
	public void land() {
		System.out.println("비행기 착륙!");
	}
}
