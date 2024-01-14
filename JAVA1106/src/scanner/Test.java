package scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		 * Scanner 클래스를 활용하여
		 * 사용자의 이름 (inputName)을 입력받고 "000님 환영합니다!"
		 * 를 출력해보자
		 * (사용자의 이름을 입력하지 않고 엔터키를 입력하면 "이름을 입력해주세요!" 출력)
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("이름을 입력해주세요 : ");
		String inputName = scan.next();
		if(!inputName.equals("")) {
		System.out.println(inputName + "님 안녕하세요");
		}else {
			System.out.println("이름을 입력해주세요!");
		}
		
		String sysId = "admin";
		// if(inputName == sysId) // 주소값 비교
		if(inputName.equals(sysId)) { // 문자열 비교
			System.out.println("관리자 로그인!");
		}else {
			System.out.println("ID 입력 오류!");
		}
		
	}
}
