package polymorphism;

public class Ex3 {

	public static void main(String[] args) {
		
		Employee emp = new Employee("홍길동", 3000);
		System.out.println("Employee 정보 : " + emp.getEmployee());
		emp.salaryCalculation();
		
		System.out.println("------------------------------------");
		Manager man = new Manager("이순신", 4000, "개발팀", 3);
		System.out.println("Manager 정보 : " + man.getManager());
		man.salaryCalculation();
		
		System.out.println("------------------------------------");
		Engineer eng = new Engineer("강감찬", 5000, 5);
		System.out.println("Engineer 정보 : " + eng.getEngineer());
		eng.salaryCalculation();
		
		System.out.println("====================================");
		// 각 인스턴스의 salaryCalculationAll() 메서드를 호출하여
		// 자신의 인스턴스를 파라미터로 전달
		emp.salaryCalculationAll(emp);
		man.salaryCalculationAll(man);
		eng.salaryCalculationAll(eng);
		
		System.out.println("------------------------------------");
		emp.salaryCalculationAll(emp);
		emp.salaryCalculationAll(man);
		emp.salaryCalculationAll(eng);
		
	} // main() 메서드 끝
} // Ex3 클래스 끝

// 직원 (Employee) 클래스 정의
class Employee{ // = class Employee extends Object
	String name; // 사원명
	int salary; // 급여
	
//	// 기본 생성자
//	public Employee() {
//		// TODO Auto-generated constructor stub
//	}
	
	// 파라미터 생성자
	public Employee(String name, int salary) {
		super(); // Object 클래스의 Object() 기본 생성자 호출
		this.name = name;
		this.salary = salary;
	}
	
	public String getEmployee() {
		return name + ", " + salary + "만원";
	}
	
	// 일반 직원의 연봉 계산 (기본 연봉을 그대로 적용)
	public void salaryCalculation() {
		System.out.println("연봉 : " + salary + "만원");
	}
	
	// =================================================
	// 전 직원의 연봉을 슈퍼클래스인 Employee 클래스에서 계산
	// => 다형성 필요 (Employee, Manager, Engineer 인스턴스 모두 처리)
	//    따라서, 메서드 파라미터로 다형성을 적용한 Employee 타입 필요
	public void salaryCalculationAll(Employee emp) { // 업 캐스팅이 됨
		int salaryResult = 0; // 연봉 계산 결과를 저장할 변수 선언
		
		// 참조 영역의 축소로 인해 각 서브클래스 타입 멤버 변수는 보이지 않음
		// => Employee를 제외한 Manager, Engineer의 경우
		//    다시 다운캐스팅을 통해 각 클래스에서 정의한 멤버에 접근해야 한다
		// => 단, 무작정 다운캐스팅을 수행할 경우 오류가 발생할 수 있으므로
		//    반드시 instanceof 연산자를 통해 타입 판별 후 다운캐스팅을 수행
		// => 주의! 반드시 하위타입부터 판별을 수행해야 한다
		
//		if(emp instanceof Employee) {
//			System.out.println("Employee 그대로 사용!");
//			salaryResult = salary;
//		}
//		// => Employee, Manager, Engineer 모두 Employee 타입으로 볼 수 있기 때문에
//		//    (상속으로 인한 is-a 관계이므로)
//		// => 모두 true가 되어 아래의 else if 조건으로 내려가지 않는다
//		//    (if ~ else if 문의 특징은 true 조건이 나오면 아래의 다른 조건식은 실행되지 않는다
//		
//		else 
		if(emp instanceof Manager) { // Manager 타입인가?
			// Employee -> Manager 타입으로 다운캐스팅
			System.out.println("Employee -> Manager로 다운캐스팅!");
			Manager man = (Manager) emp; // 자동 형변환이 불가 -> 강제 형변환 필수
			
			// 업캐스팅으로 축소됐던 참조영역이 다운캐스팅으로 확대되었으므로
			// 다운캐스팅 된 Manager 타입 인스턴스를 통해 모든 멤버변수 접근 가능
			// 기본 연봉과 관리 인원 수에 따른 인센티브를 더해서 계산
			salaryResult = man.salary + (man.manageEmployeeCount * 10);
		}else if(emp instanceof Engineer) { // Engineer 타입인가?
			// Employee -> Engineer 타입으로 다운캐스팅
			System.out.println("Employee -> Engineer로 다운캐스팅!");
			Engineer eng = (Engineer) emp; // 자동 형변환이 불가 -> 강제 형변환 필수
			
			// 업캐스팅으로 축소됐던 참조영역이 다운캐스팅으로 확대되었으므로
			// 다운캐스팅 된 Engineer 타입 인스턴스를 통해 모든 멤버변수에 접근 가능
			// 기본 연봉과 자격증 수에 따른 인센티브를 더해서 계산
			salaryResult = eng.salary + (eng.numOfCertificate * 20);
		}else if(emp instanceof Employee) {
			System.out.println("Employee 그대로 사용!");
			salaryResult = salary;
		}
		
		System.out.println("연봉은 " + salaryResult + "만원입니다.");
	}
}

// 관리자 (Manager) 클래스 정의 - Employee 상송
class Manager extends Employee{
	String depart; // 부서명
	int manageEmployeeCount; // 관리하는 직원 수
	
	// 슈퍼클래스 기본 생성자가 없으므로 파라미터 생성자를 호출하는 생성자 정의
	public Manager(String name, int salary, String depart, int manageEmployeeCount) {
		super(name, salary);
		this.depart = depart;
		this.manageEmployeeCount = manageEmployeeCount;
	}
	
	public String getManager() {
//		return name + ", " + salary + "만원 , " + depart + ", " + 
//	manageEmployeeCount + "명";
		return getEmployee() + " , " + depart + ", " + manageEmployeeCount + "명";
	}

	// Employee의 연봉 계산 메서드를 오버라이딩
	// => 매니저 연봉은 기본 연봉 + (관리직원수 * 10만원)
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + (manageEmployeeCount * 10);
		System.out.println("연봉 : " + salaryResult + "만원");
	}
}

// 엔지니어 (Engineer) 클래스 정의 - Employee 상속
class Engineer extends Employee{
	int numOfCertificate;

	public Engineer(String name, int salary, int numOfCertificate) {
		super(name, salary);
		this.numOfCertificate = numOfCertificate;
	}
	
	public String getEngineer() {
		return getEmployee() + ", " + numOfCertificate + "개";
	}

	// Employee의 연봉 계산 메서드를 오버라이딩
	// => 엔지니어의 연봉은 기본 연봉 + (자격증 수 * 20만원)
	@Override
	public void salaryCalculation() {
		int salaryResult = salary + (numOfCertificate * 20);
		System.out.println("연봉 : " + salaryResult + "만원");
	}
	
	
}