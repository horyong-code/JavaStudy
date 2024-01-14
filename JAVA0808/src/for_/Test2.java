package for_;

public class Test2 {

	public static void main(String[] args) {
		// 정수 1 ~ 100까지의 합을 누적 변수 total에 누적 후 출력
		// 누적 변수 선언 및 초기화
		int total = 0;
		// for문
		for(int i = 1; i <= 100; i++) {
			total += i;
		};
		// 누적 변수 출력
		System.out.println("1 ~ 100까지 정수의 합 : "+total);
		
		System.out.println("=================================");
		
		// 1 ~ 10까지 1씩 증가하면서, 정수 중 짝수의 합만 계산
		total = 0;
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {total += i;
			System.out.println("i = " + i + ", total = " + total);}
			else {System.out.println("i = "+ i + " : 홀수이므로 누적 X");};
		};
		System.out.println("1 ~ 10까지 정수 중 짝수의 합 : "+ total);
		
		System.out.println("=================================");
		
		// 1 ~ 10까지의 정 수 중 홀수의 합 계산 후 출력
		total = 0;
		for(int i = 1; i <=10; i++) {
			if(i % 2 != 0) {total += i;
			System.out.println("i = " + i + ", total = " + total);}
			else {System.out.println("i = " + i + " : 짝수이므로 누적 X");};
		};		
		System.out.println("1 ~ 10까지 정수 중 홀수의 합 : "+ total);
	}
}