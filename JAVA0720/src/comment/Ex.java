package comment;

public class Ex {
	
	public static void main(String[] args) {
		/*
		 * 주석(Comment)
		 * - 프로그램 실행과 관계없는 문장으로
		 *   주로 프로그램 코드에 대한 설명 등을 작성하거나
		 *   기존의 코드를 실행 대상에서 제외시키는 용도로 사용
		 * - 크게 세 가지로 분류됨
		 * 
		 * 1. 한 줄 주석(라인 주석) : // 주석 처리할 문장
		 *  => 주석 처리하고자 하는 문장의 앞쪽에 // 기호를 사용하여
		 *     주석 처리
		 *  => 해당 주석 표시 뒤의 한 문장을 실행 대상에서 제외시킴
		 *  => 단축키 : 주석 처리할 문장의 라인 아무 위치에서
		 *              1) Ctrl + Shift + C
		 *              2) Ctrl + /
		 *     해체 단축키 : 주석 설정 단축키와 동일
		 *  => 범위 주석 대신 사용 가능하며
		 *     특정 범위의 문장들을 블록 처리한 뒤 주석 처리 시
		 *     각각 주석 처리
		 *     => 해제 시에도 특정 범위 블록 지정 후 해제
		 *     
		 * 2. 여러 줄 주석(범위 주석) : /* 주석 처리할 문장 */
		/*  => 주석 처리하고자 하는 범위의 문장 앞 뒤에 주석 기호를 
		 *     둘러쌈
		 *  => 한 줄 또는 여러 줄에 걸친 주석 처리가 가능하며
		 *     주로 긴 문장의 설명을 작서하거나, 여러 줄에 코드를
		 *     주석 처리하는 용도로 사용
		 *  => 단축키 : Ctrl + Shift + /
		 *     해제 단축키 : Ctrl + Shift + \
		 *     
		 * 3. JavaDoc 주석 : /** 주석 처리할 문장 */
		/*  => 일반적인 주석 처리 용도로는 사용하지 않고
		 *     자바 클래스 설명서를 작성하는 용도의 주석
		 * 
		*/
		
		/*
		 * 이 곳은 범위 주석 공간으로
		 * 여러 줄에 걸친 프로그램 설명을 작성하는 용도로 사용
		 */
		
		/**
		 * 이 곳은 JavaDoc 주석 공간으로
		 * 자바 클래스 설명서를 제작하는 용도의 주석입니다.
		 */
				
		// 숫자 1부터 10까지 한 줄씩 출력
		System.out.println("1"); // 숫자 1을 콘솔(화면)에 출력
		System.out.println("2");
		System.out.println("3"); 
		System.out.println("4"); 
		System.out.println("5");
		System.out.println("6"); 
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
		
		
	}
	
}




