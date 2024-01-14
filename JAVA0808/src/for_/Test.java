package for_;

public class Test {

	public static void main(String[] args) {
		// 1 ~ 9까지 1씩 증가하면서 출력
		// for문으로 표현
		for(int i = 1;i <= 9; i++) {
			System.out.println(i);
		};
		System.out.println("==================================");
		
		// for문을 사용하여 특정 단에 해당하는 구구단 출력
		// <2단>
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 9 = 18
		
		int dan = 5;
		//System.out.println("<"+dan+"단>");
		System.out.printf("<%d단>\n", dan);
		for(int i = 1; i <= 9; i++) {
			//System.out.println(dan + " * " + i + " = " + (dan * i));
			System.out.printf("%d * %d = %d\n", dan, i, (dan * i));
		};
		
	
	
	
	
	}
		
		

	}

