package class_;

public class Test {

	public static void main(String[] args) {
		// Person2 클래스의 인스턴스 생성
		// 외부의 다른 클래스에서 Person2 클래스의 인스턴스에 접근하기 위해서는
		// 참조변수를 통해 접근 필수
		
		Person2 per = new Person2();
		per.name = "홍길동";
		per.age = 20;
		per.isHungry = true;
		
		// 참조변수를 통해 메서드까지 접근 가능
		per.showPersonInfo();
		System.out.println("-----------------");
		per.eat("떡볶이");
		System.out.println("-----------------");
		per.talk();
		

	} // main() 메서드 끝

} // 클래스 끝

/*
 * Person2 클래스 정의
 * 
 * [멤버 변수 (인스턴스 변수) 선언]
 * - 이름 (name, 문자열)
 * - 나이 (age, 정수)
 * - 배고픔 (isHungry, boolean)
 * 
 * [메서드 정의]
 * - 이름, 나이, 배고픔을 출력하는 showPersonInfo() 메서드 정의
 *   (매개변수, 리턴값 없음)
 *   
 * - 밥먹는 기능을 수행하는 eat() 메서드
 *   (매개변수 : 음식이름 (foodName, 문자열), 리턴값 없음)
 *   => "XXX 먹기!" 출력
 *   => 멤버 변수 isHungry의 값을 false로 변경
 *   
 * - 말하는 기능을 수행하는 talk() 메서드
 *   (매개변수, 리턴값 없음)
 *   => "말하기!" 출력
 *   => 멤버 변수 isHungry의 값을 true로 변경
 */

class Person2{
	String name;
	int age;
	boolean isHungry;
	
	public void showPersonInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("배고픔 : " + isHungry);
	};
	
	
	public void eat(String foodName) {
		System.out.println(foodName + " 먹기!");
		// isHungry의 값을 false로 변경 (배고프지 않음)
		isHungry = false;
		System.out.println("식사 후 배고픔 : " + isHungry);
	};
	
	public void talk() {
		System.out.println("말하기!");
		// isHungry의 값을 true로 변경 (배고픔)
		isHungry = true;
		System.out.println("말한 후 배고픔 : " + isHungry);
	};
	
}
