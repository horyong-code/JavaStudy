package array;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 배열의 최대값을 구하는 코드
		 * number = {3, 2, 14, 21, 100, 4, 2, 1}
		 * int max; int min; int sum; int avg;
		 * 
		 * 출력 결과
		 * 최대값 : 100
		 * 최소값 : 1
		 * 합계 :
		 * 평균 :
		 * 
		 */
		
		// 배열 선언, 생성, 초기화
		int[] number = {3, 2, 14, 21, 100, 4, 2, 1};
		
		// 변수 선언 및 초기화
		int max; int min; int sum; double avg;
		max = number[0]; min = number[0]; sum = 0; avg = 0.0;	
		
		// 반복문 (for)을 통해 비교 및 대입
		for(int i = 0; i < number.length; i++) {
			// 최대값
			if(number[i] > max) {
				max = number[i];
			}
			
			if(number[i] < min) {
				min = number[i];
			}
			
			sum += number[i];

			avg = (double)sum/number.length;
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);		
		
	}

}
