package array;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 2차원 배열
		 * - 1차원 배열 여러개의 묶음을 관리하는 배열
		 * - 행과 열로 이루어진 테이블 (표) 구조와 유사한 구조의 배열
		 *  => 행과 열의 인덱스는 1차원 배열과 동일 (0부터 시작)
		 * 
		 * < 2차원 배열 선언 및 생성 기본 문법 >
		 * 데이터타입[][] 변수명 = new 데이터타입[행크기][열크기];
		 * 
		 * < 2차원 배열 접근 기본 문법 >
		 * 변수명[행 인덱스][열 인덱스];
		 * 
		 * < 2차원 배열 선언, 생성, 초기화를 한꺼번에 수행하는 문법 >
		 * 데이터타입[][] 변수명 = {
		 * 		{값1, 값2, ..., 값n}, // 0행 (0열, 1열, ..., n열)
		 * 		{값1, 값2, ..., 값n}, // 1행 (0열, 1열, ..., n열)
		 * 		... 생략 ...
		 * 		{값1, 값2, ..., 값n} // n행 (0열, 1열, ..., n열)
		 * };
		 * 
		 * < 2차원 배열 크기 >
		 * 1. 행의 크기 : 변수명.length
		 * 2. 열의 크기 : 변수명[행번호].length
		 * 
		 * < 2차원 배열의 모든 요소를 차례대로 접근하는 문법 >
		 * for(int i = 0; i < 변수명.length; i++){ // 행 반복
		 * 
		 * 		for(int j = 0; j < 변수명[i].length; j++){ // 열 반복
		 * 			System.out.println(변수명[i][j]); // 배열의 각 요소 접근
		 * 		}
		 * 
		 * }
		 * 
		 */
		
		// int형 2차원 배열 arr 생성 (3행 2열 크기)
//		int[][] arr;
//		arr = new int[3][2];
		
		// 위의 두 문장을 한 문장으로 결합 (선언 및 생성 동시에 수행)
		int[][] arr = new int[3][2];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[2][0] = 5;
		arr[2][1] = 6;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		
		// 배열 크기 알아내기
		// 1. 배열의 행 크기 알아내기 : 배열명.length
		System.out.println("배열 arr의 행 크기 : " + arr.length);
		// 2. 배열의 각 행에 대한 열 크기 알아내기 : 배열명[행번호].length
		System.out.println("배열 arr의 0번 행의 열 크기 : " + arr[0].length);
		System.out.println("배열 arr의 1번 행의 열 크기 : " + arr[1].length);
		System.out.println("배열 arr의 2번 행의 열 크기 : " + arr[2].length);
		
		// 반복문을 사용하여 2차원 배열의 모든 요소에 차례대로 접근
		// 1. 바깥쪽 for문을 사용하여 행 크기만큼 반복 (1차원 배열 접근과 동일)
		for(int i = 0; i < arr.length; i++) {
//			// 2. 안쪽 for문을 사용하여 각 행의 열 크기만큼 반복
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================");
		
		int[][] arr2 = {
				// 전체 블록 내의 중괄호 (블록) 개수 = 행 개수
				// 내부 중괄호 (블록) 내의 데이터 개수 = 열 개수
				{1, 2}, // 0행 (0열, 1열)
				{3, 4}, // 1행 (0열, 1열)
				{5, 6}  // 2행 (0열, 1열)
		};
		
		// 중첩 for문을 사용하여 2차원 배열 차례대로 접근
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================");
		
		/*
		 * 이름을 저장하는 배열 names 생성하고 다음과 같이 초기화
		 * -------------------------------------------------------
		 * 0행 : 윤종현 권영찬 변치욱
		 * 1행 : 손보성 정수아 서현정
		 * 2행 : 박가경 신승민 김효린
		 * -------------------------------------------------------
		 */
		
		String[][] names = {
				{"윤종현", "권영찬", "변치욱"},	
				{"손보성", "정수아", "서현정"},
				{"박가경", "신승민", "김효린"}
		};
		
		for(int i = 0; i < names.length; i++) {
			for(int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================");
		
		// 2차원 배열은 행을 먼저 생성한 후, 별도로 열을 각각 생성 가능하다!
		// 데이터타입[][] 배열명 = new 데이터타입[행크기][];
		int[][] arr3 = new int[3][]; // 3행의 공간이 먼저 생성됨
		
		// 각 행에 접근하여 열을 생성하는 코드 작성
		arr3[0] = new int[3];
		// => 정수형 배열 3개를 저장하는 공간을 생성 후 0번 행에 주소 저장
		arr3[1] = new int[2];
		// => 정수형 배열 2개를 저장하는 공간을 생성 후 1번 행에 주소 저장
		arr3[2] = new int[4];
		// => 정수형 배열 4개를 저장하는 공간을 생성 후 2번 행에 주소 저장
		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[1][0] = 1;
//		arr[1][2] = 2;
//		arr[2][0] = 1;
//		arr[2][1] = 2;
//		arr[2][2] = 3;
//		arr[2][3] = 4;
		
		arr3[0] = new int[] {1, 2, 3};
		arr3[1] = new int[] {1, 2};
		arr3[2] = new int[] {1, 2, 3, 4};
		
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("===================================");
	}
}
