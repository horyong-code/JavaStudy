package if_;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 다중 if - else if문 (if-else if-else문)
		 * - 두 가지 이상의 조건식을 사용하여 세 가지 이상의 경우의 수 판별
		 * - 기본 if문으로 첫 번째 조건을 설정하고, else if문으로 
		 *   두 번째 이후의 조건을 설정한다.
		 * - 모든 조건이 만족하지 않을 때 실행할 문이 있을 경우
		 *   문장의 마지막에 else문 사용
		 * - if문 비교는 위에서 아래로 차례대로 비교를 수행한다.
		 * => 비교 범위가 좁은 조건식부터 비교를 수행해야 한다.
		 * 
		 * <기본 문법>
		 * if(조건식1){
		 *         // 조건식1의 결과가 true일 때
		 * }else if(조건식2){
		 *         // 조건식1의 결과가 false이고, 조건식2의 결과가 true일 때
		 * }else if(조건식n){
		 *         // 조건식1 ~ n-1의 결과가 false이고, 조건식n의 결과가 true일 때
		 * }else{
		 *         // 위의 모든 조건식 (n까지) 결과가 false일 때
		 *         // 마지막 실행 문장
		 *         // 마지막 else문은 생략 가능
		 * }
		 */
		
		// 정수 num이 양수 (0보다 클 경우)일 때 "양수!" 출력하고
		// 아니면, 정수 num이 음수 (0보다 작을 경우)일 때 "음수!" 출력하고
		// 둘 다 아닐 경우 (0일 경우) "0" 출력!
		
		int num = 0;
		if(num > 0) { // 양수일 때
			System.out.println(num + " : 양수!");
		}else if(num < 0) { // 음수일 때
			System.out.println(num + " : 음수!");
		}else { // 양수도 아니고 음수도 아닐 때 (0일 때)
			System.out.println(num + " : 0");
		}
		
		System.out.println("======================================");
		// 정수형 변수 num2에 대해 홀수, 짝수 판별
		// 단, 홀수와 짝수가 아닌 0을 별도로 판별
		
		int num2 = 0;
		
		// if문은 위에서부터 차례대로 조건을 검사한다
		if((num % 2) != 0) {
			System.out.println("홀수!");
		}else if ((num % 2) == 0) {
			System.out.println("짝수!");
		}else {
			System.out.println("0");
		};
		System.out.println("======================================");
        // => 주의! 0은 2로 나눈 나머지가 0이므로 짝수 판별식에서 true가 됨
		//       따라서, 0을 출력하는 문장은 실행될 수 없다
		// => 해결책 : 최소한 0을 판별하는 문장이 짝수 판별 문장보다 윗쪽에 위치해야함
		
		int num3 = 5;
		if((num3 % 2) != 0) {
			System.out.println(num3 + " : 홀수!");
		}else if (num3 == 0) {
			System.out.println(num3 + " : 0");
		}else {
			System.out.println(num3 + " : 짝수!");
		};
		
		System.out.println("======================================");
		
		
		int num4 = 20;
		// num4이  5보다 클 경우  "5보다 크다!"
		// num4이 10보다 클 경우 "10보다 크다!"
		
		if(num4 > 5) {
			System.out.println("5보다 크다!");
		}else if(num4 > 10) {
			// num > 5 조건식 범위 안에 num > 10 조건식이 포함
			// num > 10 조건식은 실행될 수 없는 문장
			System.out.println("10보다 크다!");
		}
		// 만약, 6 ~ 9의 숫자를 판단하려면?
		// else if문 작성 시에는 조건식의 범위가 좁은 조건식부터 판별
		
		if(num4 > 10) {
			System.out.println("10보다 크다!");
		}else if(num4 > 5) {
			System.out.println("5보다 크다!");
		}
	}

}
