package test;

public class Test1 {
	
	public static void main(String[] args) {
		
		/* 문항 1 */
		// 나이에 따른 입장료 계산
		int pee = 50000; // 입장료
		int age = 19; // 나이
		
		if(age < 5 || age >= 65) { // 5세 미만이거나 65세 이상 [OR : ||]
			pee *= 0.5; // 50% 할인 -> * 0.5 [타입 맞출 필요 X]
			System.out.println("나이가 " + age + "세이므로 입장료는 " + pee + "원입니다.");
		}else if(age >= 5 && age <= 19) { // 5세 이상이고 19세 이하 [AND : &&]
			pee *= 0.7; // 30% 할인 -> * 0.7 [타입 맞출 필요 X]
			System.out.println("나이가 " + age + "세이므로 입장료는 " + pee + "원입니다.");
		}else { // 기타
			System.out.println("나이가 " + age + "세이므로 입장료는 " + pee + "원입니다.");
		}
		
	} // main() 메서드 끝
} // 클래스 끝


// 실기정답_강호룡.zip