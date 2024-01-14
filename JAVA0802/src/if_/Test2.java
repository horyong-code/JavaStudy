package if_;

public class Test2 {

	public static void main(String[] args) {
		// "아이티윌로 걸어서 출발" 출력
		// money 변수 선언, 초기값 2000(원)
		// 윤지씨가 돈이 5천원 이상 있다면 "택시타고 가기!" 출력
		// 만약, 돈이 5천원 미만이라면 "버스타고 가기!" 출력
		// "아이티윌에 도착" 출력
		
		System.out.println("아이티윌로 걸어서 출발");
		int money = 2000;
		if(money >= 5000) {
			System.out.println("택시타고 가기!");
		}else {
			System.out.println("버스타고 가기!");
		};
		System.out.println("아이티윌에 도착");
		System.out.println("===============================");
		
		// if문 조건식에 비교 연산자, 논리 연산자 등을 조합하여 활용 가능
		// 1. 나이 (age)를 입력 받아 (변수 초기화) 20대인지 판별
		// => 20대란? 나이가 20 이상이고 29 이하
				
		// if문을 사용하여 나이가 20대일 경우 "당신은 20대입니다!" 출력
		int age = 20;
		if(age >= 20 && age <= 29) {
			System.out.println("당신은 20대입니다!");
		}else {
			System.out.println("당신은 20대가 아닙니다!");
		}
		
		// 2. 나이(age2)를 입력받아 놀이동산 무료 입장 여부 판멸
		// => 무료 입장 대상 : 나이가 5세 미만이거나 나이가 65세 이상
		
		int age2 = 70;
		
		if(age2 < 5 || age2 >=65) {
			System.out.println("놀이동산 무료 입장 대상입니다!");
		}else {
			System.out.println("놀이동산 무료 입장 대상이 아닙니다!");
		}
		

	}

}
