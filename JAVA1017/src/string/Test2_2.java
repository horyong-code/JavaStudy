package string;

import java.util.Arrays;

public class Test2_2 {

	public static void main(String[] args) {
		/*
		 * 문자열을 char[] 배열에 분리하여 저장 후
		 * 해당 문자열에 대한 간단한 암호화 작업
		 * - 문자열을 분리하여 저장한 배열을 encrypt()에 전달
		 * - 전달받은 배열의 문자에 대해 아스키코드 값 3만큼 증가한 문자를
		 *   별도의 배열에 저장한 후 문자열로 변환하여 리턴
		 *   ex) 'A' (65) => 'D' (68)
		 *   ex) "Hello" -> 'H', 'e', 'l', 'l', 'o' 형태로 배열에 저장됨
		 *       암호화 작업 결과물 : 'K', 'h', 'o', 'o', 'r'
		 *       리턴되는 데이터 : "Khoor"
		 */
		
		// String 타입 문자열을 char 타입 배열로 변환 : toCharArray() 사용
		// "admin123" 문자열 사용
		String str = "admin123";
		char[] arr = str.toCharArray();
		System.out.println("암호화 전 : " + Arrays.toString(arr));
		System.out.println("암호화 후 : " + encrypt(arr));
		

	} // main() 메서드 끝
	
	// encrypt() 메서드 정의
	// => 인스턴스 생성없이 사용할 수 있도록 정의
	// => 암호화 작업 수행
	// => 전달받은 배열 내의 모든 문자 값을 +3을 수행하여 새 배열에 저장한 후
	//    문자열로 결합하여 리턴
	// => 전달받은 배열의 크기를 새 배열의 크기로 지정
	//    (hint : new 키워드 사용, 배열의 크기는 기존 배열의 개수)
	// => 암호화 후 배열 내의 모든 문자를 문자열로 결합하여 리턴
	//    => Arrays 클래스의 toString() 메서드 활용
	
	public static String encrypt(char[] arr) {
		char[] arr2 = new char[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = (char) (arr[i] + 3);
		}
		
//		String str2 = Arrays.toString(arr2);
//		return str2;
		
		// 출력 형태를 문자열 형태로 출력하고 싶다면
		// 1. String 생성자 활용
//		String str2 = new String(arr2);
//		return str2;
		
		// 2. String.valueOf() 메서드 활용
//		String str2 = String.valueOf(arr2);
//		return str2;
		
		
		// 3. StringBuilder 활용
		StringBuilder buffer = new StringBuilder();
		for(char ch : arr2) { // 향상된 for문 -> 데이터타입 변수명 = 배열명
			buffer.append(ch);
		}
		String str2 = buffer.toString();
		return str2;
	}

} // Test2_2 클래스 끝
