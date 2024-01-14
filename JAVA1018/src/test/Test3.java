package test;

public class Test3 {

	public static void main(String[] args) {
		
		/* 문항 3 */
		// 인스턴스 생성하여 deposit, withdraw 메서드 호출
		Account acc = new Account("123-45-6789", "홍길동", 10000); // 임의값으로 초기화
		acc.deposit(5000);
		System.out.println("============================================");
		acc.withdraw(5000);
		System.out.println("--------------------------------------------");
		acc.withdraw(15000);

	} // main() 메서드 끝
} // 클래스 끝

class Account {
	// 멤버 변수 선언
	String accountNo;
	String ownerName;
	int balance;
	
	// 파라미터 생성자 정의 : Alt + Shift + S -> O [기본 생성자 X]
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// 메서드 정의
	public void deposit(int amount) { // 입금 메서드
		balance += amount;
		System.out.println("입금 금액 : " + amount + "원, 현재잔고 : " + balance + "원");
	}
	
	public int withdraw(int amount) { // 출금 메서드
		if(balance >= amount) { // 출금 가능 : 잔고 >= 출금액
			System.out.println("현재잔고 : " + balance + "원, 출금할 금액 : " + amount + "원");
			balance -= amount;
			System.out.println(amount + "원이 출금되었습니다 (현재잔고 : " + balance + "원)");
			return amount;
		}else { // 출금 불가능 : 잔고 < 출금액
			System.out.println("현재잔고 : " + balance + "원, 출금할 금액 : " + amount + "원");
			System.out.println("잔고가 부족하여 출금할 수 없습니다.");
			return 0;
		}
	}	
}
