package constructor;

public class Test {

	public static void main(String[] args) {
		// Account 인스턴스 생성
		Account acc = new Account();
		
//		System.out.println("계좌번호 : " + acc.accountNo);
//		System.out.println("예금주명 : " + acc.ownerName);
//		System.out.println("현재잔액 : " + acc.balance);
		
		acc.showAccountInfo();
		
		

	} // main() 메서드 끝

} // 클래스 끝
/*
 * Account 클래스
 * - accountNo, ownerName, balance
 * - showAccountInfo() 메서드 정의
 * - 인스턴스 생성 시
 *   "Account() 생성자 호출됨!" 출력
 *   accountNo에 "111-1111-111", ownerName에 "홍길동", balance에 10000
 *   초기값으로 설정 
 */

class Account{
	String accountNo; // 멤버 변수 선언
	String ownerName;
	int balance;
	
	public Account() { // 생성자 정의 (멤버 변수 초기화)
		System.out.println("Account() 생성자 호출됨!");
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 10000;
	}
	
	public void showAccountInfo() { // 메서드 정의
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔액 : " + balance + "원");
	}
	
}