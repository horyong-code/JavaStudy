package java_util_function;

import java.util.function.Consumer;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 자바에서 제공하는 함수형 인터페이스 [익명 객체] -> 람다식
		 * java.util.fuction 패키지
		 * 
		 * 					파라미터		리턴
		 * Consumer  계열		O			  X
		 * Supplier  계열		X			  O
		 * Function  계열		O			  O
		 * Operator  계열		O			  O
		 * Predicate 계열		O			  boolean
		 * 
		 * 1. Consumer 계열 (소비자)
		 * - 파라미터를 받아서 소비한다
		 * - 리턴하지 않음
		 * 
		 * 2. Supplier 계열 (공급자)
		 * - 파라미터를 받지 않는다
		 * - 자체적으로 리턴할 값을 생성한다
		 * 
		 */
		
		// 익명 내부 클래스 방식
		Consumer<String> consumer = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				
			}
		};
		
		consumer.accept("Hello");
				
		// 람다식 형태
		Consumer<String> consumer2 = 
			t -> System.out.println(t); // 화살표 : 람다식 [왼쪽 매개변수 -> 오른쪽 중괄호 : 익명 내부 객체 자동 생성]
			
		System.out.println("-----------------------------------------------------------------------------");
		
		Student s1 = new Student("홍길동", 80);
		// 람다식 : 심플하게 표현될 때 주로 사용하므로
		// 보통 한 줄로 표기 가능할 때 사용됨
		
		// 한 줄씩 표현
		printStudent(s1, s -> System.out.println(s.name));
		printStudent(s1, s -> System.out.println(s.score *= 1.5));
		printStudent(s1, s -> System.out.println(s.name + " : " + s.score));
		
		Consumer<Student> printer = new Consumer<Student>() {
			@Override
			public void accept(Student s) {
				System.out.println(s.name);
			}
		};
		
		// 여러 줄 표현
		printStudent(s1, s -> {
			System.out.println(s.name);
			System.out.println(s.score *= 1.5);
			System.out.println(s.name + " : " + s.score);
		});
	
	} // main() 메서드 끝
	
	// 학생을 출력하려고 하는데 방식은 아직 미정.
	// 출력 방식을 전달 받음 (Consumer<Student> printer)
	public static void printStudent(Student s, Consumer<Student> printer) {
		printer.accept(s);
	}

} // Ex 클래스 끝

class Student{
	String name;
	double score;
	
	public Student(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}
}
