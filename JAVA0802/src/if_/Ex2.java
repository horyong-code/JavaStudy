package if_;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * if-else문
		 * - 조건식 판별 결과가 true일 때와 false일 때 서로 다른 블록을 실행
		 * - 삼항 (조건) 연산자와 유사한 형태로 수행되나 삼항 연산자보다 유연함
		 *   (조건식 판별 결과에 따라 실행 가능한 문장이 더 다양함)
		 * - if문 블록은 조건식 결과가 true일 때 실행하고,
		 *   else문 블록은 조건식 결과가 false일 때 실행함
		 * => 둘 중 하나의 블록만 실행  
		 * 
		 * <기본 문법>
		 * 문장1;
		 * if(조건식){
		 *      문장2; // 조건식 결과가 true일 때 실행할 문장들
		 * }else{
		 *      문장3; // 조건식 결과가 false일 때 실행할 문장들
		 * }
		 * 문장4;
		 * 
		 * => 조건식 판별 결과 true
		 *    문장1 -> 조건식 (true) -> 문장2 -> 문장4
		 *    
		 * => 조건식 판별 결과 false   
		 *    문장1 -> 조건식 (false) -> 문장3 -> 문장4
		 */
		
		// 정수 num에 대한 절대값 계산
		int num = 5; // 문장1
		
		if(num < 0) { // 조건식 
			// 조건식 결과가 true일 때 실행할 문장들
			System.out.println("음수이므로 양수로 변환!"); // 문장2
			num = -num;
		}else {
			// 조건식 결과가 false일 때 실행할 문장들
			System.out.println("양수이므로 변환 생략!"); // 문장3
			
		}
		System.out.println("num의 절대값 : " + num); // 문장4
		
		System.out.println("======================================");
		
		// 정수 num2에 대해 홀수, 짝수 (0 포함) 판별
		
		int num2 = 0;
		if((num2 % 2) == 0 || num2 == 0) {
			System.out.println("정수 " + num2 + "은(는) 짝수입니다!");
		}else {
			System.out.println("정수 " + num2 + "은(는) 홀수입니다!");
		}
		
		System.out.println("======================================");
		
		// 문자 ch가 대문자일 때 "대문자!" 출력, 아니면 "대문자 아님!" 출력
		// 대문자란? 'A' (65) 이상이고 'Z' (90) 이하인 문자
		
		char ch = 'R';
		if(ch >= 65 && ch <= 90) {
			System.out.println(ch + "은(는) 대문자!");
		}else {
			System.out.println(ch + "은(는) 대문자 아님!");
		}
		System.out.println("======================================");
		
		// 문자 ch2가 소문자일 때 "소문자!"를 출력하고 대문자로 변환 후 출력
		// 아니면, "소문자가 아님!" 출력
		// => 소문자 : 'a' (97) 이상이고 'z' (122) 이하인 문자
		// => 대문자 : 'A' (65) 이상이고 'Z' ( 90) 이하인 문자
		// 차이는 32만큼 난다
		
		char ch2 = 'D';
		if(ch2 >= 97 && ch2 <= 122) {
		System.out.println(ch2 + " : 소문자! ");
		ch2 -= 32; // ch2 = (char)(ch2 - 32);
		System.out.println("변환 결과 : " + ch2);
		}else {
			System.out.println(ch2 + " : 소문자가 아님!");
			
		}
		

	}

}
