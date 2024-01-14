package print_method;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 화면에 데이터를 출력하는 print(), printf(), println()
		 * '() 안에 있는 걸 출력해달라'
		 * - System.out.XXX() 형태로 사용
		 * 
		 * 1. println()
		 * - 소괄호 내부에 출력할 데이터를 전달하면 화면에 출력
		 * - 화면에 데이터를 출력한 뒤에 줄 바꿈 수행
		 * => 출력 후 엔터키를 입력한 것과 동일한 결과
		 * - 아무런 데이터도 전달하지 않을 경우 단순 줄바꿈 기능 수행
		 * 
		 * 2. print()
		 * - 소괄호 내부에 출력할 데이터를 전달하면 화면에 출력
		 * - 화면에 데이터를 출력한 뒤에 줄바꿈을 수행하지 않음
		 * - 아무런 데이터도 전달하지 않을 경우 오류 발생
		 * 
		 * 3. printf()
		 * - 출력할 데이터가 변수 및 여러가지 타입이 복합적으로 사용될 경우
		 *   출력할 데이터의 모양을 유지하기 위한 용도로 사용
		 * - 소괄호 내부에 출력할 데이터를 전달하면 화면에 출력
		 * - 화면에 데이터를 출력한 뒤에 줄바꿈을 수행하지 않음
		 * 
		 * <특징>
		 * - 소괄호 내부에 문자열 데이터를 첫 번째로 사용하고
		 *   화면에 출력할 데이터 형식을 문자열 내부에서 지정함
		 *   이 때, 변수 등을 사용할 경우 해당 변수가 표시될 자리를 
		 *   '형식 지정 문자'를 사용하여 표시만 하고,
		 *   문자열이 끝난 후 콤마 (,) 기호 뒤에 형식 지정 문자에 들어갈
		 *   데이터를 각각 명시함
		 *   ex) printf("출력할 데이터 형식", 데이터1, 데이터2, ..., 데이터n)
		 */
		System.out.println("Hello, World!"); // "Hello, World!" 출력 + 줄바꿈
		System.out.println("강호룡"); // "강호룡" 출력 후 줄바꿈
		
		int age = 21;
		System.out.println("나이는 age세입니다.");
		// => age가 문자열로 취급됨
		// => 만약, age라는 변수를 사용하여 데이터를 활용해야하는 경우,
//		      문자열 바깥에 '+' 기호를 사용하여 변수를 문자열에 연결해야함
		      
        System.out.println(); // 줄바꿈
        System.out.println("나이는 " + age + "세 입니다.");
        
        System.out.println("-----------------------------");
        
        System.out.print("Hello, World!");
        System.out.print("강호룡");
        System.out.println(); // 줄바꿈 (엔터키 역할)
        System.out.print("Hello, World!");
        System.out.print("강호룡");
        System.out.print(1);
        System.out.println(); // 줄바꿈 (엔터키 역할)
//        System.out.print();
        // () 안에 내용을 반드시 넣어야 함. 그렇지 않으면 오류 발생
        
        System.out.println("-----------------------------");
        
        System.out.printf("Hello, World!");
        System.out.printf("강호룡");
//        System.out.printf(1);
        // 오류 발생 : The method printf(String, Object...) in the type PrintStream 
        //             is not applicable for the arguments (int)
       
        
        // 형식 지정 문자를 사용한 printf() 메서드
        // %d : 10진수 1개를 표현
        // %xd : x자리수만큼의 자리를 차지
        // %0xd : x자리수만큼의 자리를 차지하고 빈자리를 0으로 채움
        // ex) ...printf("%02d", 2) : 02
        System.out.printf("%d", 1);
        System.out.printf("%2d", 1);
        System.out.println();
//        System.out.println("나이는 " + age + "세 입니다.");
        System.out.printf("나이는 %d세 입니다.\n", 20);
        System.out.printf("나이는 %d세 입니다.", age);
        System.out.println();
        System.out.printf("현재 시간은 \n %d시 %d분 %02d초입니다.\n", 12, 16, 00);
        System.out.printf("오늘 날짜는 %d월 %02d월 %d일입니다", 2023, 7, 25);
        // => %d 기호가 3개이므로, 데이터 3개가 순서대로 대입됨
        System.out.println();
        // %f : 실수 표현
        // %.xf : 실수 표현 (소수점 x자리까지)
        System.out.printf("평균 나이는 %f세입니다.\n", 27.50);
        System.out.printf("평균 나이는 %.1f세입니다.\n", 27.50);
        // %c : 문자 표현
        System.out.printf("정수 65에 해당하는 문자는 %c입니다.\n", 'A');
        System.out.printf("정수 65에 해당하는 문자는 %c입니다.\n", 65);
        
        // char 타입 변수 ch에 문자 'r' 저장
        char ch = 'r';
        System.out.printf("%c\n", ch);
        
        // %s : 문자열 표현
        // String 타입 변수 str에 문자열 "아이티윌 부산교육센터" 저장
        String str = "아이티윌 부산교육센터";
        System.out.printf("교육기관명 : %s\n", str);
       
	}

}
