package type_conversion;

public class Ex {

	public static void main(String[] args) {
		/*
		 *  자바에서의 데이터타입간의 형변환 (타입 변환)
		 *  - 어떤 데이터타입이 다른 데이터타입으로 변환하는 것
		 *  - 기본 데이터타입 중 boolean 타입을 제외한 나머지 타입 간의 변환
		 *  
		 *  자바 데이터타입 크기 관계
		 *  byte < short < int < long < float < double
		 *  (    char    )
		 *  
		 *  1. 자동 형변환 (= 묵시적, 암시적 형변환)
		 *  - 작은 데이터타입의 데이터를 큰 데이터타입으로 변환하는 것
		 *  - 자바 컴파일러에 의해 자동으로 형변환이 일어남
		 *  => 아무런 문제가 생기지 않으므로 개발자가 신경쓸 필요없이
		 *     자바에 의해 자동으로 변환
		 *     ex) byte -> int, int -> long, long -> float 등
		 *  - 정수 타입보다 실수 타입이 무조건 큰 타입으로 취급되기 때문에
		 *    메모리 크기가 long이 float 타입보다 크더라도 float 타입이 큼
		 *    
		 *  2. 강제 형변환 (= 명시적 형변환)
		 *  - 큰 데이터타입 데이터를 작은 데이터타입으로 변환하는 것
		 *  - 작은 데이터타입 허용치보다 커서 Overflow (넘침)가 발생할 수 있다
		 *  => 따라서, 자바가 자동으로 형변환을 수행해주지 않음 (코드 상에 오류가 발생함)
		 *  - 반드시 우변의 데이터 앞에 '형변환 연산자'를 사용하여 강제 형변환을 수행해야 함
		 *  (형변환 연산자에는 좌변의 작은 데이터타입 명시)
		 *  => '(작은 데이터타입명) 우변의 데이터' 형식으로 지정
		 *  - 강제 현봔으로 인해 오류가 없어지더라도 형변환 후의 데이터는 원본 데이터와 다를 수 있음 (= Overflow)
		 *  => 따라서, 형변환 후의 책임을 개발자에 맡김 
		 *  - 작은 데이터타입 허용치 이내의 데이터일 경우, 강제 형변환 후에도 원본 데이터가 유지될 수 있다
		 *  
		 *  
		 */
		
		int a1 = 32768; // 큰 데이터 타입
		short a2 = 32767; // 작은 데이터타입
//		System.out.println("변환 전 a1(int) :" + a1 + ", a2(short) :" +a2);
		System.out.printf("변환 전 a1(int) :%d, a2(short) :%d\n", a1, a2);
		// => 위의 두 출력문은 동일
		
		// 자동 형변환
		// 작은 데이터타입 (a2)을 큰 데이터타입 (a1)으로 변환
		a1 = a2; // 컴파일러에 의해 자동으로 형변환이 일어남
		// => 변환 후에도 원본 데이터에는 변화가 없다
//		int a1 = (int) short a2 : (형변환 연산자)
		System.out.printf("변환 후 a1(int) :%d, a2(short) :%d\n", a1, a2);
		
		System.out.println("==================================================");
		
		int b1 = 99999;
		short b2 = 32767;
		System.out.printf("변환 전 b1(int) :%d, b2(short) :%d\n", b1, b2);
		
		// 강제 형변환
		// 큰 데이터타입 (b1)을 작은 데이터타입 (b2)로 변환
//		b2 = b1; // 오류 발생!
		// => Type mismatch: cannot convert from int to short
		// 큰 데이터타입을 작은 데이터타입으로 변환할 때 자동 형변환이 일어나지 않음
		// 넘침 (Overflow)의 위험성때문에 자동으로 변환해주지 않음
		// => 개발자 강제로 '형변환 연산자'를 사용하여 강제 형변환 수행
		// 우변의 데이터 앞에 ( )를 쓰고, 좌변의 작은 데이터타입을 명시
		b2 = (short) b1; // 형변환 연산자를 통해 작은 데이터타입 (short) 이름을 명시
		System.out.printf("변환 후 b1(int) :%d, b2(short) :%d\n", b1, b2);
        // => 강제 형변환 후에는 Overflow에 의해 원본 데이터와
        //    실제 변환되어 저장된 데이터가 다를 수 있다.
		
		System.out.println("==================================================");
		
		int c1 = 100;
//		short c2 = c1; // 오류 발생 - 강제 형변환 필수
		short c2 = (short) c1;
		System.out.printf("변환 후 c1(int) :%d, c2(short) :%d\n", c1, c2);
		// => short 타입에 저장 가능한 범위 내의 데이터이기 때문에
        //    강제 형변환 후에도 Overflow 발생이 없으므로 원본 데이터가 유지
		
		System.out.println("==================================================");
		// 정수 -> 실수로 변환하는 경우
		int d1 = 100;
		double d2 = 3.14;
		System.out.printf("변환 전 d1(int) :%d, d2(double) :%.2f\n", d1, d2);
		
		d2 = d1; // 자동 형변환 (= 묵시적, 암시적 형변환)
		// int < double
//		=> double 타입이 int 타입보다 크므로 컴파일러에 의해 자동으로 변환됨
		System.out.printf("변환 후 d1(int) :%d, d2(double) :%.0f\n", d1, d2);
		
		int e1 = 100;
		double e2 = 3.14;
		System.out.printf("변환 전 e1(int) :%d, e2(double) :%.2f\n", e1, e2);
//		e1 = e2;
		// => int 타입이 double 타입보다 작으므로 자동으로 변환되지 않음
		e1 = (int) e2;
		System.out.printf("변환 후 e1(int) :%d, e2(double) :%.2f\n", e1, e2);
		// => 정수형 데이터타입 e1에는 소수점을 제외한 정수 부분만 저장
		
		System.out.println("==================================================");
		
		// long 타입 (8Byte) vs float타입 (4Byte)
		long l = 100L;
		float f = l; // long < float, long -> float 변환 시 자동 형변환 일어남
		
//		l = f; // 오류 발생 : float -> long 변환 시 자동 형변환 불가
		l = (long) f; // 형변환 연산자 (long)을 통해 long 타입으로 강제 형변환 필수
		
	}

}
