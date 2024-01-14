package method;

public class Test2 {

	public static void main(String[] args) {
		// 3. 파라미터만 있고, 리턴값은 없는 메서드 호출 연습
		// => 문자열을 1개 전달하면 해당 문자열을 출력하는 print() 메서드 호출
		print("아이티윌 부산교육센터");
		
		System.out.println("------------------------------------------");
		
		// => 정수를 1개 전달하면 해당 정수에 대해 "홀수", "짝수" 판별하는
		//    checkNumber() 메서드 호출
		checkNumber(1);
		
		System.out.println("===========================================");
		
		// 4. 파라미터도 있고, 리턴값도 있는 메서드 호출 연습
		// => 정수 1개를 전달하면 해당 정수에 대해 "홀수", 짝수"를 판별하고
		//    판별 결과 문자열을 리턴하는 checkNumber2() 메서드 호출
		String result = checkNumber2(1);
		System.out.println("판별 결과 : " + result);

	} // main() 메서드 끝
	
	// 3. 파라미터만 있고, 리턴값은 없는 메서드 정의
	// => 파라미터가 있으므로 선언부 소괄호() 안에 매개변수 선언
	// => 리턴값은 없으므로 리턴 타입에 void 선언
	// 문자열을 1개 전달 받아 해당 문자열을 출력하는 print() 메서드 정의
	
	
	public static void print(String str) { // String str = "아이티윌 부산교육센터"
		System.out.println(str);
		
	};
	
	
	// => 정수 1개를 전달하면 정수에 대해 "홀수", "짝수" 판별하는 checkNumber() 메서드 정의
	
	public static void checkNumber(int num) { // int num = 1과 동일
		if(num % 2 == 0) {
			System.out.println(num + " : 짝수");
		}else {
			System.out.println(num + " : 홀수");
		};
		
	};
	
	
	public static String checkNumber2(int num) {
//		if(num % 2 == 0) {
//			return "짝수";
//		}else {
//		    return "홀수";
//		}
//		
		String result = "";
		if(num % 2 == 0) {
			result = "짝수";
		}else if(num % 2 != 0) {
			result = "홀수";
		} return result;
		
	};
	
	// if문과 else if문 내에서 직접 리턴하지 않고
	// 리턴 데이터를 별도의 변수에 저장만 한 뒤, if문 종료 return 수행
	
	

} // Class 끝
