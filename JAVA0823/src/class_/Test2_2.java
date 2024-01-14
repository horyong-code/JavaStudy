package class_;

public class Test2_2 {

	public static void main(String[] args) {
		Account2 acc = new Account2();
		
		acc.accountNo = "123-4567-890";
		acc.ownerName = "홍길동";
		acc.balance = 100000;
		
		acc.showAccountInfo();
		
		System.out.println("--------------------------------");
		
		acc.deposit(10000);
		
		System.out.println("--------------------------------");		
		
		acc.withdraw(50000);
		
		System.out.println("--------------------------------");		
		
		acc.withdraw(150000);

	} // main() 메서드 끝

} // class 끝

/*
 * 은행계좌(Account2) 클래스 정의
 * [ 멤버변수 선언 ]
 * - 계좌번호(accountNo, 문자열)
 *   예금주명(ownerName, 문자열)
 *   현재잔고(balance, 정수)
 *   
 * [ 메서드 정의 ]
 * - 계좌번호, 예금주명, 현재잔고를 출력하는 showAccountInof() 메서드
 *   ex) 계좌번호 : 111-1111-111
 *       예금주명 : 홍길동
 *       현재잔고 : 10000원
 *       
 * - 입금 기능을 수행하는 deposit() 메서드
 *   => 입금할 금액(amount, 정수)을 전달받아 현재잔고(balance)에 누적한 후
 *      입금된 금액과 입금 후 현재잔고를 출력
 *      ex) "입금하신 금액    : XXXXX원"
 *          "입금 후 현재잔고 : XXXXX원"
 *   => 단, 리턴값은 없음
 *   
 * - 출금 기능을 수행하는 withdarw() 메서드
 *   => 출금될 금액(amount, 정수)를 전달받아 현재잔고(balance)에서 차감 후
 *      출금될 금액과 출금 후 현재잔고를 출력
 *      ex) "출금할 금액      : XXXXX원"
 *          "출금 후 현재잔고 : XXXXX원"
 *   => 단, 출금 기능을 수행하기 전 현재잔고와 출금할 금액을 비교하여
 *      현재잔고가 출금할 금액보다 적을 경우 출금을 수행하지 않고 다음과 같이 출력
 *      ex) "잔고가 부족하여 출금이 불가능합니다."
 *          "출금할 금액 : XXXXX원, 현재잔고 : XXXXX원"
 *   => 리턴값 있음(출금할 금액에 해당하는 금액 리턴)           
 */

class Account2{ // public 키워드 사용 불가
	// 멤버 변수 (= 인스턴스 변수) 선언
	String accountNo;
	String ownerName;
	int balance;
	
	// 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재 잔고 : " + balance + "원");	
	}
	// 입금 기능
	public void deposit(int amount) {
		// 전달 받은 입금 금액 (amount)를 현재 잔고 (balnce)에 누적 후 출력
		balance += amount; // balance = balance + amount;
		System.out.println("입금하신 금액 : " + amount + "원");
		System.out.println("입금 후 현재 잔고 : " + balance + "원");
	}
	// 출금 기능
	public int withdraw(int amount) {
		// 입력 받은 출금 금액 (amount)을 현재 잔고 (balance)에 차감 후
		// 출금되는 금액 (amount)을 리턴
		// 단, 현재 잔고가 출금 금액보다 적은 경우 출금 불가
		if(amount > balance) { // 현재 잔고가 출금 금액보다 적은 지 판별 => 출금 불가
			System.out.println("잔고가 부족하여 출금이 불가능합니다.");
			System.out.println("출금할 금액 : " + amount + "원, 현재 잔고 : " + balance + "원");
//			return 0; // 출금 불가
			amount = 0;
		}else { // 출금이 가능한 경우 (현재 잔고 >= 출금 금액)
			balance -= amount; // balance = balance - amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금 후 현재 잔고 : " + balance + "원");
//			return amount; // 출금액
		}
		return amount;
//		if(balance < amount) {
//			System.out.println("잔고가 부족하여 출금이 불가능합니다.");
//			System.out.println("출금할 금액 : " + amount + "원, 현재 잔고 : " + balance + "원");
//			return 0;
//		}
//		balance -= amount;
//		System.out.println("출금할 금액 : " + amount + "원");
//		System.out.println("출금 후 현재 잔고 : " + balance + "원");
//		return amount;
//	}
}
}
	

	
	
	
	
	


