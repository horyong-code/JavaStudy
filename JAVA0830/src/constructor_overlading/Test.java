package constructor_overlading;

public class Test {

	public static void main(String[] args) {
		MyDate md = new MyDate();
		md.showMyDate();
		System.out.println("----------------------");
		
		MyDate md2 = new MyDate(2000);
		md2.showMyDate();
		System.out.println("----------------------");
		
		MyDate md3 = new MyDate(2004, 5);
		md3.showMyDate();
		System.out.println("----------------------");
		
		MyDate md4 = new MyDate(2008, 9, 30);
		md4.showMyDate();
	} // main() 메서드 끝
} // 클래스 끝

/*
 * 날짜를 관리하는 MyDate 클래스 정의
 * - 멤버변수 : 연도 (year, 정수), 월 (month, 정수), 일 (day, 정수)
 * - 생성자
 *   1) 기본 생성자 : 1991년 1월 1일로 초기화
 *   2) 파라미터 생성자
 *      2-1. 연도 (year)를 전달받아 초기화하고, 1월 1일로 초기화
 *      2-2. 연도 (year), 월 (month)을 전달받아 초기화하고, 1일로 초기화
 *      2-3. 연도 (year), 월 (month), 일 (day)을 전달받아 초기화 
 *      
 *      생성자 자동 단축기 : Alt + Shift + S -> O
 */
class MyDate{
	int year; // 멤버 변수 선언
	int month;
	int day;
	
	public MyDate() { // 1) 기본 생성자 정의 : 1991년 1월 1일로 초기화
		System.out.println("MyDate() 생성자 호출됨!");
		year = 1991;
		month = 1;
		day = 1;
	}
	// 2-1) 파라미터 생성자 정의 : 연도 (year)를 전달받아 초기화하고, 1월 1일로 초기화
	public MyDate(int year) {
		System.out.println("MyDate(int) 생성자 호출됨!");
		this.year = year;
		month = 1;
		day = 1;
	}
	// 2-2) 파라미터 생성자 정의 : 연도 (year), 월(month)을 전달받아 초기화하고, 1일로 초기화
	public MyDate(int year, int month) { // 파라미터 생성자 정의
		System.out.println("MyDate(int, int) 생성자 호출됨!");
		this.year = year;
		this.month = month;
		day = 1;
	}
	// 2-3) 파라미터 생성자 정의 : 연도 (year), 월(month), 일(day)을 전달받아 초기화
	public MyDate(int year, int month, int day) { // 파라미터 생성자 정의
		System.out.println("MyDate(int, int, int) 생성자 호출됨!");
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void showMyDate() { // 메서드 정의
		System.out.println("날짜 : " + year + "년 " + month + "월 " + day + "일");
	}
}
