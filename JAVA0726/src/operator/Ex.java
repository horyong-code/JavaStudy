package operator;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 산술연산자 (+, -, *, /, %)
		 * - 일반적인 사칙연산과 동일
		 * - % 연산자 : 나머지 연산자 (퍼센트 연산자)라고 하며
		 *              나눗셈 결과에 대한 나머지를 계산하는 연산자
		 *              (/ 연산자는 나눗셈 결과에 대한 몫을 계산하는 연산자)
		 */
		
		// 출력문에 연산식을 기술하면 연산 결과를 출력
		System.out.println(10 + 2); 
		System.out.println(10 - 2);
		System.out.println(10 * 2);
		System.out.println(10 / 2); // 몫
		System.out.println(10 % 2); // 나머지
		System.out.println("==================================");
		
		// int형 변수 a에 10을 저장하고, b에 2를 저장
		int a = 10, b = 2;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); // 몫
		System.out.println(a % b); // 나머지
		
		// 연산 결과를 변수에 저장 후 출력
		int c; // 연산 결과를 저장할 변수 c 선언
		
		// a와 b의 덧셈 결과를 변수 c에 저장
		c = (a + b);
		System.out.println(a + " + " + b + " = " + c);
		System.out.printf("%d + %d = %d\n", a, b, c);
		
		c = a - b; // 뺄셈
		System.out.println(a + " - " + b + " = " + c);
		System.out.printf("%d - %d = %d\n", a, b, c);
		
		c = a * b; // 곱셈
		System.out.println(a + " * " + b + " = " + c);
		System.out.printf("%d * %d = %d\n", a, b, c);
		
		c = a / b; // 몫
		System.out.println(a + " / " + b + " = " + c);
		System.out.printf("%d / %d = %d\n", a, b, c);
		
		c = a % b; // 나머지
		System.out.println(a + " % " + b + " = " + c);
		System.out.printf("%d %% %d = %d\n", a, b, c);
	}

}
