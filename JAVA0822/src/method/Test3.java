package method;

public class Test3 {

	public static void main(String[] args) {
		// 5. 파라미터가 2개 이상인 메서드 호출 연습
		// => 정수 2개를 전달하면 두 정수의 합을 리턴하는 메서드를 호출하고
		//    리턴값을 출력 (ex. 10, 20 전달 시 10 + 20 결과인 30 리턴)
		
		System.out.println(plus(10, 20));
		System.out.println("----------------------------------------------------");
		
		int sum = plus(10, 20);
		System.out.println(sum);

		System.out.println("====================================================");
		
		// => 연산자 문자 1개와 정수 2개를 전달하면
		//    두 정수에 대한 어떤 연산을 수행한 후
		//    결과값을 리턴하는 메서드 호출하고 리턴되는 값을 출력
		//    ex) '+', 10, 20 전달 시 10 + 20 결과인  30 리턴
		//    ex) '-', 10, 20 전달 시 10 - 20 결과인 -10 리턴
		
		System.out.println("연산 결과 : " + math('*', 10, 20));
		
		
	} // main() 메서드 끝
	
	
	public static int plus(int num1, int num2) {
		return num1 + num2;
	};
	
	
	// 5. 파라미터가 2개 이상인 메서드 정의 연습
	// => 연산자 문자 1개와 정수 2개를 전달 받아
	//    두 정수에 대한 어떤 연산을 수행한 후 결과값을 리턴하는 메서드 정의
	
	public static int math(char ope, int num1, int num2) {
		// 연산자 문자 (char 타입) 판별 (== 사용)
		if(ope == '+') {
			return (num1 + num2);
		}else if(ope == '-'){
			return (num1 - num2);
		}
			// 잘못된 연산자가 입력되었을 경우
			// 오류 메세지 출력 후 0 리턴 (가정)
			System.out.println("연산자가 올바르지 않습니다");
			return 0;
		
	};
	

} // class 끝
