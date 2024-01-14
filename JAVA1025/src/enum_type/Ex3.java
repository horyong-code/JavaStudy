package enum_type;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Month now = Month.FEBRUARY;
		System.out.println(now + ", " + now.getMonthKor());

	}

}

enum Month{
	// 생성자를 사용하여 상수에 다른 값을 결합
	JANUARY("1월"), FEBRUARY("2월");
	// => The constructor Month() is undefined
	
	private String monthKor;
	
	private Month(String monthKor) { // 파라미터 생성자 [기본 생성자로 상수 생성]
		// TODO Auto-generated constructor stub
		this.monthKor = monthKor;
	}
	
	// enum : 기본 생성자로 상수 생성 [heap / 객체] -> 파라미터 생성자로 상수에 다른 값 결합

	public String getMonthKor() {
		return monthKor;
	}

	public void setMonthKor(String monthKor) {
		this.monthKor = monthKor;
	}
	
	
}
