package continue_break;

public class Ex2 {

	public static void main(String[] args) {
		
//		for(int dan = 2; dan <= 9; dan++) {
//			System.out.println("< " + dan + "단 >");
////			if(dan == 5) { // 현재 단이 5단일 때 반복문 종료
////				break;
////			};
//			
//			for(int i = 1; i <= 9; i++) {
//				if(dan == 5) { // 현재 단이 5단일 때 반복문을 종료하는 것이 아니라
//					break;     // 안쪽 for문을 빠져나가고 바깥쪽 for문의 다음 반복 진행
//				};
//				System.out.println(dan + " * " + i + " = " + (dan * i));	
//			};
//			System.out.println();
	
//		};
		
		/*
		 * Label 기능
		 * - 반복문의 앞에 위치하여 break 또는 continue의 동작 지점을 지정
		 * - break문 또는 continue문 뒤에 해당 레이블의 이름을 지정할 경우
		 *   Label 위치의 다음 반복문에 break 또는 continue문이 적용
		 * - 주로, 중첩 반복문에서 반복문을 한꺼번에 빠져나가기 위해서 사용
		 * - 반복문 앞 또는 위로 주로 대문자 된 문자를 작성하고 콜른을 붙임
		 * 
		 * <기본 문법>
		 * 레이블명 :
		 * 바깥쪽 반복문(){
		 *       안쪽 반복문(){
		 *              if(조건식){
		 *              break 레이블명; // 또는 continue 레이블명;
		 *       }
		 * }
		 */
		
        EXIT_FOR :
		for(int dan = 2; dan <= 9; dan++) {
			System.out.println("< " + dan + "단 >");

			for(int i = 1; i <= 9; i++) {
				if(dan == 5) {
					break EXIT_FOR;
				};
				System.out.println(dan + " * " + i + " = " + (dan * i));	
			};
			System.out.println();

		};
		
	}

}
