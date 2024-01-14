package class_;

public class Ex2 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.print();
		System.out.println("=============================");
		
		Person p2 = new Person();
		p2.name = "홍길동";
		p2.age = 10;
		p2.print();

	}

}

// 사람 (Person) 클래스 정의
class Person{
	// 멤버 변수 선언
	String name; // 이름
	int age; // 나이
	
	// 메서드 정의
	// 자신의 인스턴스에 저장된 이름, 나이를 출력하는 print() 메서드 정의
	// 매개변수 없음, 리턴값 없음
	
	public void print() {
		// 클래스 내 메서드에서 자신의 클래스 멤버 변수에 자유롭게 접근 가능
		// => 즉 변수명만으로 메모리에 생성된 자신의 인스턴스 내에 멤버 변수 값 사용 가능
		// => 단, 동일한 코드라도 인스턴스에 따라 저장된 값은 달라짐
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		
	};
	
}
