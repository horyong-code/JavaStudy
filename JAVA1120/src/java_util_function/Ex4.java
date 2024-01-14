package java_util_function;

import java.util.function.DoubleBinaryOperator;
import java.util.function.UnaryOperator;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Ex4 {

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
		 */
		
		// <Type T> 인자를 하나 받고 동일한 제네럴 타입의 객체를
		// 리턴하는 함수형 인터페이스
		UnaryOperator<Double> op1 = x -> Math.pow(x, 2);
		System.out.println(op1.apply(10.0));
		
		UnaryOperator<Double> op2 = new UnaryOperator<Double>() {
			
			@Override
			public Double apply(Double t) {
				// TODO Auto-generated method stub
				return Math.pow(t, 2);
			}
		};
		
		// Double 타입의 파라미터를 입력받아 Double 타입을 리턴
		DoubleBinaryOperator op3 = new DoubleBinaryOperator() {
			
			@Override
			public double applyAsDouble(double left, double right) {
				return Math.pow(left, right);
			}
		};
		
		DoubleBinaryOperator op4 = (x, y) -> Math.pow(x, y);

	}

}
