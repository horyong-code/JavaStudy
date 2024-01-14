package array;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 정수를 저장하는 2차원 배열 array 생성
		 * 0행 : 95, 86
		 * 1행 : 83, 92, 96
		 * 2행 : 78, 83, 93, 87, 88로 초기화
		 * 
		 * 모든 정수를 합한 sum과 평균 avg 구하고 출력
		 */
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		int count = 0;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		
		// 평균은 합계 계산이 완료된 후 계산하면 되기 때문에 for문 종료 후 계산
		avg = (double)sum / (double)count;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println();
		
		
		/*
		 * 학생 이름을 1차원 배열(names)에 저장하고
		 * 학생 점수를 2차원 배열(score)에 다음과 같이 저장 후 출력
		 * 
		 * 출력 예시 :
		 * 					<학생 점수표>
		 * 				국어     영어    수학
		 * 홍길동        80       70      80
		 * 이순신        90       90      90
		 * 강감찬        50       60      77
		 * 최윤지       100      100     100
		 * 정윤정        80       80      60
		 * 
		 * 학생별 총점을 계산하여 1차원 배열(studentTotal)에 다음과 같이 저장 후 출력
		 * <학생별 총점>
		 * 홍길동 : 230점 = 0행(0열, 1열, 2열) => studentTotal[0]
		 * 이순신 : 270점 = 1행(0열, 1열, 2열) => studentTotal[1]
		 * 강감찬 : 187점 = 2행(0열, 1열, 2열) => studentTotal[2]
		 * 최윤지 : 300점 = 3행(0열, 1열, 2열) => studentTotal[3]
		 * 정윤정 : 220점 = 4행(0열, 1열, 2열) => studentTotal[4]
		 */
		
		// 1차원 배열 names에 이름 저장
		String[] names = {"홍길동", "이순신", "강감찬", "최윤지", "정윤정"};
		
		// 2차원 배열 score에 점수 저장
		int[][] score = {
				{80, 70, 80},
				{90, 90, 90},
				{50, 60, 77},
				{100, 100, 100},
				{80, 80, 60}
		};
		
		System.out.println("           < 학생 점수표 >");
		System.out.println("           국어 영어 수학");
		for(int i = 0; i < score.length; i++) {
			// 점수를 저장한 2차원 배열의 행크기(score.length)와
			// 이름을 저장한 1차원 배열의 크기(name.length)가 같다.
			// 행크기 반복문의 제어변수로 이름 인덱스 사용 가능
				System.out.print(names[i] + "    ");
			for(int j = 0; j < score[i].length; j++) {
				System.out.printf("%5d", score[i][j]);	
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[] studentTotal = new int[5];
		
		System.out.println("< 학생별 총점 >");
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				// 학생 점수 인덱스 중 행번호에 해당하는 인덱스가
				// 학생 총점의 인덱스로 사용될 수 있다
				// => 즉, 각 학생의 행번호를 사용하여 학생의 3과목 점수를
				//    총점 배열의 인덱스 행번호를 사용하여 누적
				studentTotal[i] += score[i][j];
			}
			// 한 명의 점수 누적이 끝난 시점에서 이름과 총점을 출력
			System.out.println(names[i] + " : " + studentTotal[i] + "점 = " + i + "행(0열, 1열, 2열) => studentTotal[" + i + "]");
		}
	}
}
