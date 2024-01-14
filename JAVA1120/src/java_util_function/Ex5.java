package java_util_function;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 자바에서 제공하는 함수형 인터페이스 [익명 내부 클래스 -> 익명 객체 (Ctrl + Space)] -> 람다식
		 * [추상 메서드 단 1개]
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
		 * 3. Function 계열 [apply]
		 * - 파라미터, 리턴 모두 존재
		 * 
		 * 4. Operator 계열
		 * - Function 계열과 유사하게 파라미터와 리턴을 갖는다.
		 * - 차이점은 Operator 계열은 매개변수 타입이 곧 리턴타입이 된다
		 * - 매개변수를 전달받아 "어떠한 연산" 후 같은 타입을 리턴할 때 사용
		 * 
		 * 5. Predicate 계열
		 * - Function, Operator와 같이 파라미터와 리턴을 갖는다
		 * - 리턴타입이 boolean으로 고정되어 있음
		 * - 매개변수를 전달받아 "어떠한 연산" 후 true / false를 리턴할 때 사용
		 */
		
		// 익명 객체 활용
		Predicate<String> predicate = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.contains("Java");
			}
		};
		System.out.println(predicate.test("javaScript"));

		System.out.println("-------------------------------------------------------------");
		// 람다식
		Predicate<String> predicate2 = t -> t.contains("Java");
		
		System.out.println(predicate2.test("JavaScript"));
		
		System.out.println("==============================================================");
		PredicateTest pt = new PredicateTest();
		
		// 익명 구현 객체
		pt.printSome(new IntPredicate() {
			@Override
			public boolean test(int value) {
				return value % 3 == 0;
			}
		});
		
		// 람다식
		pt.printSome(num -> num % 3 == 0);
		pt.printSome(num -> num > 5);
		// 람다식 왼쪽 : 매개변수, 오른쪽 : 중괄호 -> 익명 구현 객체 생성
	}
}


class PredicateTest{
	int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public void printSome(IntPredicate pred) {
		for(int num : nums) {
			if(pred.test(num)) {
				System.out.println(num + "\t");
			}
		}
	}
}