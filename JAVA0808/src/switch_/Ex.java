package switch_;

public class Ex {

	public static void main(String[] args) {
		/*
		 * switch(-case)문
		 * - if문처럼 특정 조건에 대해 여러가지 판별을 수행하는 조건문
		 * => 단, if문과는 달리 범위에 대한 판별 등이 불가능하며
		 *    값에 대한 동등 비교만 가능함
		 * - switch문의 조건식에는 연산식 또는 변수, 리터럴 등이 올 수 있으나
		 *   반드시 정수 또는 문자열 (또는 enum 타입 변수)만 사용 가능
		 *   => 이 중 정수는 chart, byte, short, int만 사용 가능
		 * - switch문에서 지정한 조건에 맞는 값을 case문에서 탐색하여
		 *   일치하는 값을 갖는 case문의 문장을 실행함
		 *   이 때, case문에는 조건식 결과를 비교할 리터럴 1개만 명시함
		 * - 일치하는 case문이 없을 경우 default문을 찾아서 실행함
		 *   => else문과 유사하며, 생략도 가능함
		 * - case문의 문장 실행 후, break문을 만나면 switch문을 빠져나감
		 *   단, break문이 없을 경우 다음 break문을 만나거나
		 *   switch문이 종료될 때까지 현재 문장의 아래쪽 모든 실행 문장을 실행
		 *   
		 * <기본 문법>
		 * switch(조건문){ // 조건식에는 정수, 문자열 (또는 enum 타입 변수) 사용
		 *        case 값1 :
		 *             // 조건식 결과가 값1과 일치하는 경우 실행할 문장들
		 *             [break;] // [대괄호] : 있어도 되고 없어도 됨
		 *        case 값2 :
		 *             // 조건식 결과가 값2와 일치하는 경우 실행할 문장들
		 *             [break;]
		 *        case 값n :
		 *             // 조건식 결과가 값n과 일치하는 경우 실행할 문장들   
		 *             [break;] 
		 *        [default : // case문 중 일치하는 값이 없을 경우 실행할 문장들]
		 *         
		 * 
		 * }
		 * 
		 */
		
		int num = 2;
		switch(num) {
		    case 1 : System.out.println("num = 1"); break;
		    case 2 : System.out.println("num = 2"); break;
		    // num이 2일 때 case 2의 문장을 실행하고 break문이 없기 때문에
		    // 아래쪽 case 3의 문장도 모두 실행한다.
		    case 3 : System.out.println("num = 3"); break;
		};
		
		System.out.println("---------------------------------------");
		num = 1;
		switch(num) {
		    case 1 : System.out.println("num = 1");
		    case 2 : System.out.println("num = 2");
		    case 3 : System.out.println("num = 3");
		    default : System.out.println("일치하는 case문이 없음!");
		    // break문이 없을 때 case문과 default문 모두 실행 대상에 포함됨
		};
		
		System.out.println("---------------------------------------");
		num = 2;
		switch(num) {
		case 1 : System.out.println("num = 1");
		break;
		case 2 : System.out.println("num = 2");
		break;
		// num이 2일 때 case 2의 출력문 실행 후 break를 만나므로
		// 아래쪽 나머지 문장을 실행하지 않고 switch문을 빠져나감
		case 3 : System.out.println("num = 3");
		break;
		default : System.out.println("일치하는 case문이 없음!");
		// default문 아래쪽에는 다른 실행문이 없으므로 break문 생략 가능
		};
		
		System.out.println("---------------------------------------");
		// switch문에 문자열 데이터 전달 시
		switch("KOREA") {
		case "대한민국" : System.out.println("대한민국!"); break;
		case "KOREA" : System.out.println("KOREA!"); break;
		case "한국" : System.out.println("한국!"); break;
		default : System.out.println("다른 나라!");
		};
		
		System.out.println("---------------------------------------");
		// switch 문에는 연산식도 사용 가능하지만
		// 연산 결과가 정수, 문자열 타입이어야 한다
		
		// switch(10 / 2) {} // 10 / 2는 결과가 정수이므로 사용 가능
		// switch(10 * 3.14) {}

	}

}
