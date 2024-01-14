package interface_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 인터페이스 (Interface)
		 * - 클래스가 아니므로 선언 시 class 키워드를 사용하지 않고
		 *   interface 키워드를 사용하여 정의
		 * - 인터페이스는 상수와 추상메서드만 가질 수 있다.
		 *   => 모든 멤버변수는 public static final이 붙은 상수로 취급
		 *      (public static final 생략 가능)
		 *      (public으로 인해 누구나 접근 가능,
		 *       static으로 인해 클래스명만으로 접근 가능,
		 *       final로 인해 변수값 변경 불가)
		 *   => 모든 메서드는 public abstract가 붙은 추상 메서드로 취급
		 *      (public abstract 생략 가능)
		 *      (메서드 바디를 가질 수 없으며, public으로 인해 누구나 접근 가능)
		 * - 추상 클래스와 마찬 가지로 추상 메서드를 포함하므로 객체 생성 불가능
		 *   => 단, 참조변수 타입으로는 사용 가능 (= 다형성을 활용한 업캐스팅 가능)
		 * - 서브클래스 (구현클래스)에서 인터페이스를 상속받아 구현해야 하는 경우
		 *   extends 키워드 대신 implements 키워드 사용
		 *   => 클래스는 상속받아 확장 (extends)의 개념이 강하지만,
		 *      인터페이스는 상속받아 추상메서드를 구현 (implement)의 개념이 강함
		 * - 클래스는 서브클래스에서 다중 상속이 불가능하지만,
		 *   인터페이스는 서브클래스에서 다중 상속 (구현)이 가능
		 *   => implements 키워드 뒤에 복수개의 인터페이스 지정 가능
		 * - 인터페이스끼리 상속 받을 경우 implements가 아닌 extends로 상속
		 *   => 추상메서드는 구현(implements)하지 못하기 때문에
		 *   
		 * < 인터페이스 정의 기본 문법 >
		 * [접근제한자] interface 인터페이스명{
		 * 	    // 상수
		 *      // 추상 메서드
		 * }
		 * 
		 * < 인터페이스를 상속 (=구현) 받은 서브클래스 (= 구현클래스) 정의 기본 문법 >
		 * [접근제한자] class 클래스명 implements 인터페이스명{
		 * 
		 * }
		 */

	}

}

// 인터페이스 정의
// => class 키워드 대신 interface 키워드 사용
interface MyExInterface {
	// 인터페이스 내의 모든 멤버변수는 상수 (public static final)이다
	public static final int NUM1 = 10;
	int NUM2 = 20; // 상수 (public static final 생략)
	
	// 인터페이스는 생성자를 가질 수 없다
//	public MyExInterface() {} // 컴파일 에러 발생
	// => Interfaces cannot have constructors
	
	// 인터페이스 내의 모든 메서드는 추상 메서드 (public abstract)이다!
	public abstract void method1();
	
//	public void method2() {} // 일반메서드 (컴파일 에러 발생!)
    // => Abstract methods do not specify a body
	// => 추상메서드여야 하므로 메서드 바디 {} 를 가질 수 없다
	public void method2(); // 추상메서드 (abstract 생략되어 있음)
	void method3(); // 추상메서드 (public abstract 생략되어 있음)
}

// 인터페이스를 상속받아 구현하는 서브클래스 (구현클래스) MySubClass 정의
// => 서브클래스 정의 시 클래스명 뒤에 implements 키워드를 쓰고 인터페이스명 지정
class MySubClass implements MyExInterface{

	@Override
	public void method1() {
		System.out.println("서브클래스에서 구현한 추상메서드 method1()!");
	}

	@Override
	public void method2() {
		System.out.println("서브클래스에서 구현한 추상메서드 method2()!");
	}

	@Override
	public void method3() {
		// 인터페이스 (MyExInterface)에서 method3() 메서드 정의 시 접근제한자를
		// 생략했지만 인터페이스 내의 모든 메서드는 public 접근 제한을 가지므로
		// 오버라이딩을 통한 구현 시 무조건 public 접근 제한자만 사용 가능!
		System.out.println("서브클래스에서 구현한 추상메서드 method3()!");
	}
	
}

abstract class MyClass{
	// 클래스 내의 모든 멤버변수는 상수가 아니며, 선언 방법에 따라 달라짐
	public static final int NUM1 = 10; // 상수
	int num2 = 20; // 멤버 변수 (인스턴스 변수) [상수 X]
	
	public MyClass() { // 생성자
		// TODO Auto-generated constructor stub
	} // => 추상 클래스는 생성자를 가질 수 있다
	
	public abstract void method1(); // 추상메서드
	// => 추상메서드를 갖는 클래스는 반드시 추상클래스로 선언해야 한다!
	
	public void method2() {} // 일반메서드
	// 추상 클래스는 일반 클래스도 가질 수 있다
}
