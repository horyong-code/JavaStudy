package constructor_overlading;

public class Test_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate2 md = new MyDate2(2024, 2, 29);
		System.out.println("날짜 : " + md.getYear() + "년 " + md.getMonth() + "월 " + md.getDay() + "일");
		

	} // main() 메서드 끝

} // 클래스 끝

/*
 * 날짜를 관리하는 MyDate2 클래스 정의
 * - 멤버변수 : 연도 (year, 정수), 월 (month, 정수), 일 (day, 정수)
 * => 접근제한자 : private
 * 
 * - 파라미터 생성자
 *   => 연도 (year), 월 (month), 일 (day)을 전달받아 초기화 
 *   => 유효한 연도, 월, 일 파라미터값을 전달할 수 있도록 설정
 *      
 *   생성자 자동 단축기 : Alt + Shift + S -> O
 *   
 *   
 * Hint)
 * 1. 멤버 변수 private 접근제한자 있으므로 Getter / Setter 필요
 * 2. 파라미터 생성자에 데이터를 전달 시 멤버변수의 초기화는
 *    Setter() 메서드를 활용
 * <조건식으로 판별>
 * year의 경우 : 1900 ~ 2100 사이의 연도일 경우 year에 초기화
 * month의 경우 : 1 ~ 12월의 경우에만 month에 초기화
 * day의 경우 : switch문을 사용해서 1, 3, 5, 7, 8, 10, 12월의 경우 1 ~ 31일 허용
 * 				4, 6, 9, 11월의 경우 1 ~ 30일 허용
 * 				2월의 경우 1 ~ 28일 허용
 * 윤달의 경우 : 4로 나눠지는 해는 윤년이지만, 그 중 100으로 나눠지는 해는 윤년이 아님
 * 				 그러나 400으로 나눠지는 해는 윤년이다
 * 
 * 1. 4로 나눠지지만 100으로 안 나눠지는 해 : 윤년
 * 2. 400으로 나눠지는 해 : 윤년
 */

class MyDate2{
	private int year; // 연
	private int month; // 월
	private int day; // 일
	
	public MyDate2(int year, int month, int day) {
		System.out.println("MyDate2(int, int, int) 생성자 호출됨!");
		if(year >= 1900 && year <= 2100) {
		setYear(year);}
		
		if(month >= 1 && month <= 12) {
		setMonth(month);}
		
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : 
		case 12 : if(day >= 1 && day <= 31) {
			setDay(day);} break;
		case 4 : case 6 : case 9 :
		case 11 : if(day >= 1 && day <= 30) {
			setDay(day);} break;	
		case 2 :
			if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { // 윤년
				if(day >= 1 && day <= 29) {
					setDay(day);} break;	
			}else { // 윤년이 아님
				if(day >= 1 && day <= 28) {
					setDay(day);} break;
			}
		}
	}		
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
}