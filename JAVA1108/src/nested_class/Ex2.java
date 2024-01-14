package nested_class;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer2 outer = new Outer2();
		outer.method();

	} // main() 메서드 끝

} // Ex2 클래스 끝

class Outer2{
	private int num = 10; // 인스턴스 멤버 변수
	
	public void method() {
		System.out.println(num);
		
		// 로컬 내부 클래스에 접근하기 위해서는
		// 클래스 선언부보다 아래쪽에서 접근 해야함
//		LocalInner localInner = new LocalInner(); // 컴파일 에러 발생!
		// => 아직 존재하지 않는 클래스
		
//		public int num2 = 20; // 컴파일 에러 발생
		// => 로컬 변수에서는 접근 제한자를 사용할 수 없다!
		//    => 외부에서 접근이 불가능하므로 접근제한자 의미가 없기 때문
		
//		static int num3 = 30; // 컴파일 에러 발생
		// => 로컬 변수에는 static 키워드를 사용할 수 없다!
		// => Illegal modifier for parameter num3; only final is permitted
		
		// 로컬 내부 클래스 정의
		// => 메서드 내에서 정의하며, 특정 메서드에서만 사용 가능한 클래스 [호출될 때만 사용 가능]
		// => 로컬 변수와 마찬가지로 접근 제한자 사용 불가, 또한 static 키워드 사용 불가
		class LocalInner{
			String name = "LocalInnerClass"; // 로컬 내부 클래스의 인스턴스 변수
			
//			static int staticMember;
			// => 로컬 내부 클래스에서는 static 변수를 사용할 수 없음
			// = The field staticMember cannot be declared static in a non-static inner type, 
			//   unless initialized with a constant expression
			
//			public static void staticMethod() {
			// => 마찬가지로 로컬 내부 클래스에서는 static 메서드를 사용할 수 없음
//			}
			
			public LocalInner() {
				System.out.println("LocalInner() 생성자 호출 됨!");
			}
			
			public void print() {
				System.out.println("로컬 내부 클래스의 인스턴스 멤버 메서드!");
			}
		} // LocalInner 클래스 끝
		
		// 로컬 내부 클래스 인스턴스 생성 [메서드와 내부클래스 사이]
		// => 로컬 내부 클래스는 메서드 내에서 객체를 생성하고 사용해야 한다!
		LocalInner localInner = new LocalInner();
		System.out.println(localInner.name);
		
	} // method() 끝
	
} // Outer2 끝
