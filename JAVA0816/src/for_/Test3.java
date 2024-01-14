package for_;

public class Test3 {

	public static void main(String[] args) {
		// 바깥쪽 for문 i값이 1 ~ 10까지 반복할 동안
		// 안쪽 for문 j값을 1 ~ 5까지 반복하면서 i와 j 값을 출력
		
		
		
		for(int i = 1; i <= 10; i++) {
			System.out.println("i = " + i);
			
			for(int j = 1; j <= 5; j++) {
			System.out.println("----> j = " + j);
			};
			System.out.println("----------- 안쪽 for문 반복 종료!");
		};
		
		
		System.out.println("====================================");
		
		/*
		 * 타이머 (XX분 XX초)
		 * - 시 (hour) : 0 ~ 23시
		 * - 분  (min) : 0 ~ 59분
		 * - 초  (sec) : 0 ~ 59초
		 * 
		 * 출력 예시
		 * 0분 0초
		 * 0분 1초
		 * ... 생략 ...
		 * 0분 59초
		 * 1분 0초
		 * 1분 1초
		 * ... 생략 ...
		 * 59분 58초
		 * 59분 59초
		 */
		

		for(int i = 0; i <= 59; i++) {
			for(int j = 0; j <= 59; j++)
			{//System.out.println(i+"분 "+j+"초");};
			System.out.printf("%02d분 %02d초\n", i, j);
			}
		};
		
		/*
		 * 중첩 for문 활용한 구구단 전체 출력 (2단 ~ 9단)
		 * 
		 * < 2단 >
		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * ... 생략 ...
		 * < 3단 >
		 * 3 * 1 = 3
		 * 3 * 2 = 6
		 * ... 생략 ...
		 * < 9단 >
		 * 9 * 1 = 9
		 * 9 * 2 = 18
		 * ... 생략 ...
		 * 9 * 9 = 81
		 * 
		 * => 단 (dan)이 2 ~ 9까지 1씩 증가 (바깥쪽 for문)
		 *    이 때, 각 단마다 i값이 1 ~ 9까지 1씩 증가 (안쪽 for문)
		 *   
		 */
		
		
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("< "+dan+"단 >");
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			};
			System.out.println();
			
		};
		
		
		/*
		 * 주사위 2개를 굴려서 주사위 눈의 합이 6일 때, 두 주사위 값을 출력
		 * ex) 주사위1      주사위2       합계
		 *      1       +       5     =     6
		 *      2       +       4     =     6
		 */
		
		
		for(int dice1 = 1; dice1 <= 6; dice1++) {
			for(int dice2 = 1; dice2 <= 6; dice2++) {
				if(dice1 + dice2 == 6) {
					System.out.println(dice1 + " + " + dice2 + " = " + (dice1+dice2));
				};	
			};
		};
		
		System.out.println("============================");
		
		// 방정식 4x + 5y = 60의 해를 구해서 출력하기
		// 단, x와 y는 0 <= x, y <= 10
		// 출력 예시) x = , y = 일 때 4x + 5y = 60
		
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
			     if((4*x) + (5*y) == 60) {
			    	 //System.out.println("x = " + x + ", y = "+ y + "일 때 4x + 5y = 60");
			    	 System.out.printf("x = %d, y = %d일 때 4x + 5y = 60\n", x, y);
			     };
			     
			};
			
		};

		
		

	}

}
