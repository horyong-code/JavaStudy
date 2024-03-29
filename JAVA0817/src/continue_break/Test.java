package continue_break;

public class Test {

	public static void main(String[] args) {
		/*
		 * 1 ~ 100까지 정수의 합을 계산 (total 변수에 저장)
		 * => 단, 합계가 1000보다 클 경우 반복문을 종료하고 빠져나간 뒤
		 *    1000보다 커지는 시점의 정수 (x)를 출력
		 * 
		 */
		
		int total = 0;
		int x;
		for(x = 1;x <= 100; x++) {
			total += x;
			if(total > 1000) {
				System.out.println(x);
				break;
				
			};
		};
		System.out.println("정수 1부터 " + x + "까지의 합 : " + total);
		
		
		
		System.out.println("================================================");
		
		/*
		 * 1 + (-2) + 3 + (-4) + 5 + (-6) + ...
		 * 총합이 100 이상이 되는 x값을 출력 (break문 사용)
		 * <힌트> 정수가 짝수일 때는 음수 형태로 변환하여 합계 누적 
		 */
		
		// while문 사용
//		x = 0;
//		total = 0;
//		while(total < 100) { // 합계가 100보다 작을 동안 반복 (= 100 이상 종료)
//			x++;
//			if(x % 2 == 0) {
//				System.out.println(-x);
//				total += -x; // 음수값으로 변환하여 누적
//			}else {
//				System.out.println(x);
//				total += x; // 양수값 그대로 누적
//			};
//		};
//		System.out.println();
//		System.out.println("x = " + x);
//		System.out.println("total = " + total);
//		
//		System.out.println("================================================");
		
		total = 0;
		x = 1;
		
		while(true) {
			if(x % 2 == 0) {
				System.out.println(-x);
				total += -x;
			}else {
				System.out.println(x);
				total += x;};
			if(total >= 100) {
				break;
			};
			x++;
		};
		System.out.println();
		System.out.println("x = " + x);
		System.out.println("total = " + total);
		System.out.println("================================================");
		
		total = 0;
		
		for(x = 1;;x++) {
			if(x % 2 == 0) {
				System.out.println(-x);
				total += -x;
			}else {
				System.out.println(x);
				total += x;
			};
			if(total >= 100) {
				break;
			};
			
		};
		System.out.println();
		System.out.println("x = " + x);
		System.out.println("total = " + total);
		
		// 초기식을 생략한 for문
		// for(;조건식;증감식) [for문 밖에 변수 초기화가 되어있으면]
		
		x = 1;
		total = 0;
		for(; total < 100; x++) {			
			if(x % 2 == 0) {
			System.out.println(-x);
			total += -x;
		}else {
			System.out.println(x);
			total += x;};
		if(total >= 100) {
			break;
		};
		};
		System.out.println();
		System.out.println("x = " + x);
		System.out.println("total = " + total);
			

		// 조건식을 생략한 for문
		
		total = 0;
		for(x = 1; ; x++) {
			if(x % 2 == 0) {
			System.out.println(-x);
			total += -x;
		}else {
			System.out.println(x);
			total += x;};
		if(total >= 100) {
			break;
		};
		};
		System.out.println();
		System.out.println("x = " + x);
		System.out.println("total = " + total);
		

		
		// 증감식을 생략한 for문
		total = 0;
		for(x = 1; total < 100; ) {			
			if(x % 2 == 0) {
			System.out.println(-x);
			total += -x;
		}else {
			System.out.println(x);
			total += x;};
		if(total >= 100) {
			break;
		};
		x++;
		};
		System.out.println();
		System.out.println("x = " + x);
		System.out.println("total = " + total);
		
		// 전부 생략
		
		x = 1; // for문 이전에 변수 초기화
		total = 0;
		
		for (; ; ) { // 무한 루프
			if(x % 2 == 0) {
			System.out.println(-x);
			total += -x;
		}else {
			System.out.println(x);
			total += x;};
		if(total >= 100) {
			break;
		};
		x++; // 실행문 마지막에 증감식	
		};
		
		System.out.println();
		System.out.println("x = " + x);
		System.out.println("total = " + total);
		


				




		
		

	}

}
