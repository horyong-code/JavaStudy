package generic;

public class Ex3 {

	public static void main(String[] args) {
		GenericClass3<Integer> gc; // Integer는 Number의 하위 타입이므로 지정 가능
//		GenericClass3<String> gc2; // Number의 하위 타입이 아니므로 지정 불가
//		GenericClass3<Object> gc3; // Number의 상위 타입이므로 지정 불가
		

	}

}

// --------------------------------------------------
// 제네릭 타입의 상속과 구현

class Class1<P> {
	
}

interface Interface1<Q> {
	
}

// 부모 타입에 제네릭 타입이 지정되어 있을 경우
// 서브클래스에서 상속 받을 때 부모의 타입 파라미터를 서브클래스 타입 파라미터로 명시해야함
class SubClass<P, Q, R> extends Class1<P> implements Interface1<Q>{
	// => Class1<P>, Interface<Q>를 상속받으려면 최소한 SubClass 뒤에 P, Q를 명시
	//    또한, 서브클래스 자신만의 제네릭 타입도 추가할 수 있다!
	P var1; // 슈퍼클래스 Class1의 타입 P
	Q var2; // 슈퍼클래스 Interface1의 타입 Q
	R var3; // 자신의 타입 R
	
}

// --------------------------------------------------------------
/*
 * 제네릭 타입에 대한 사용 가능한 파라미터 타입 제한
 * - 제네릭 타입 파라미터 선언시 Object 타입과 그 자식 타입을 모두 사용 가능
 * - 필요에 따라 파라티머 타입에 올 수 있는 데이터타입을제한 할 수 있음
 *
 * < 기본 문법 >
 * 파라미터에 대한 서브클래스 타입으로 제한하는 경우
 * class 클래스명<타입파라미터 extends 클래스타입>{}
 * => 타입 파라미터 (ex. E 또는 T 등)는 extends 뒤의 클래스 타입이거나 하위타입만 지정 가능
 */

//class GenericClass3<E> {} // 타입 파라미터 E는 어떤 타입으로 변경 가능함
class GenericClass3<E extends Number>{}
// => Number 타입 또는 Number 클래스 하위 타입만 (Integer, Double 등)으로만 변환 가능함
