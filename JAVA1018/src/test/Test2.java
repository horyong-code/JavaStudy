package test;

public class Test2 {

	public static void main(String[] args) {
		
		/* 문항 2 */
		// 입력 문자에 따른 판별 결과
		char ch = 'R';
		if(ch >= 'A' && ch <= 'Z') { // 대문자 ['A' ~ 'Z']
			System.out.println(ch + " : 대문자");
		}else if(ch >= 'a' && ch <= 'z') { // 소문자 ['a' ~ 'z']
			System.out.println(ch + " : 소문자");
		}else if(ch >= '0' && ch <= '9') { // 숫자 ['0' ~ '9']
			System.out.println(ch + " : 숫자");
		}else { // 기타
			System.out.println(ch + " : 기타 문자");
		}

	} // main() 메서드 끝
} // 클래스 끝
