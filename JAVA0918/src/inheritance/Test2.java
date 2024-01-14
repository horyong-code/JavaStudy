package inheritance;

public class Test2 {

	public static void main(String[] args) {
		
		Manager m = new Manager("강감찬", 2000000, "개발자");
		
		String ge = m.getEmployee();
		System.out.println(ge);
		System.out.println("==============================");
		
		String gm = m.getManager();
		System.out.println(gm);
		
	} // main() 메서드 끝
} // Ex 클래스 끝

/*
 * 직원 (Employee) 클래스
 * 멤버변수
 * - 직원이름 (name, 문자열)
 * - 연봉 (salary, 정수)
 * 
 * 메서드
 * - 직원 정보를 문자열로 결합하여 리턴하는 getEmployee() 메서드 정의
 *   (파라미터 없음, 리턴값 있음)
 *   => 직원이름과 연봉을 문자열로 결합하여 리턴
 *   ex) 홍길동, 4000
 */

/*
 * Employee 클래스를 상속받는 Manager 클래스 정의
 * - 이름, 연봉, 부서명 (depart, 문자열) 멤버변수
 * - 이름, 연봉, 부서명을 문자열로 결합하여 리턴하는 getManager() 메서드
 *   ex) 홍길동, 4000, 개발팀
 */

class Employee{
	String name; // 이름
	int salary; // 연봉
	
	public String getEmployee() {
		return name + ", " + salary;
	}
}

class Manager extends Employee{
	String depart; // 부서명
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String name, int salary, String depart) {
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	
	public String getManager() {
		return getEmployee() + ", " + depart;
	}
}