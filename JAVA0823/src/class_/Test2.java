package class_;

public class Test2 {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.accountNo = "123-4567-890";
		acc.ownerName = "강호룡";
		acc.balance = 100000000;
		
		acc.showAccountInfo();

	}

}

/*
 * 은행 계좌 (Account) 클래스 정의
 * 멤버 변수
 * - 계좌번호 (accountNo, 문자열)
 * - 예금주명 (ownerName, 문자열)
 * - 현재잔고 (balance, 정수)
 * 
 * 메서드
 * - showAccountInfo() => 매개변수 없음, 리턴값 없음
 *   => 계좌번호, 예금주명, 현재잔고를 출력하는 메서드 정의
 *   ex) 계좌번호 : 111-1111-111
 *       예금주명 : 홍길동
 *       현재잔고 : 10000원
 * 
 */


class Account{
	// 멤버 변수 선언
	String accountNo;
	String ownerName;
	int balance;
	
	// 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재 잔고 : " + balance + "원");
		
	};
	
}
