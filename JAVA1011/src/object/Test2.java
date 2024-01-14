package object;

import java.util.Objects;

public class Test2 {

	public static void main(String[] args) {
		// ac1과 ac2의 생성 후 두 계좌의 정보 비교 및
		// 참조변수 출력 시 toString() 메서드 활용하여 결과 보기
		Account ac1 = new Account("111-1111-111", "홍길동", 50000);
		System.out.println("ac1의 계좌 정보 : " + ac1.toString());

		Account ac2 = new Account("222-2222-222", "강감찬", 100000);
		System.out.println("ac2의 계좌 정보 : " + ac2.toString());
		
		if(ac1.equals(ac2)) {
			System.out.println("두 계좌의 정보가 같습니다 (equals())");
		}else {
			System.out.println("두 계좌의 정보가 다릅니다 (equals())");
		}
		

	} // main() 메서드 끝
} // Test2 클래스 끝


/*
 * Account 클래스 정의
 * - 멤버변수
 *   계좌번호 (accountNo, 문자열), 예금주명 (ownerName, 문자열), 현재잔고 (balance, 정수)
 * - 생성자 : 계좌번호, 예금주명, 현재잔고를 전달받아 초기화
 * - equals() 메서드 오버라이딩하여 계좌 정보를 비교하도록 정의
 * - toString() 메서드 오버라이딩하여 계좌 정보를 문자열로 리턴하도록 정의
 */

class Account{
	// 멤버 변수 선언
	String accountNo;
	String ownerName;
	int balance;
	
	// 파라미터 생성자 정의 : Alt + Shift + S -> O
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// equals() 오버라이딩 : Alt + Shift + S -> H
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNo, other.accountNo) && balance == other.balance
				&& Objects.equals(ownerName, other.ownerName);
	}

	// toString() 오버라이딩 : Alt + Shift + S -> S
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
}
