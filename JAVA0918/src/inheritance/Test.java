package inheritance;

public class Test {

	public static void main(String[] args) {
		ItwillBank ib = new ItwillBank();
		
		ib.accountNo = "111-1111-111";
		ib.ownerName = "김철수";
		ib.balance = 50000;
		
		ib.deposit(10000);
		ib.withdraw(30000);
		ib.withdraw(100000);
		System.out.println("---------------------");
		
		ib.showAccountInfo();
		System.out.println("---------------------");
		
		// ItwillBank의 고유 기능 (추가된 기능)
		ib.contract("어린이 보험");
		System.out.println("현재보험 : " + ib.insureName);
				
	} // main() 메서드 끝
} // Ex 클래스 끝

/*
 * Account 클래스를 상속받는 ItwillBank 클래스 정의
 * - Account의 기본 기능 (계좌의 기본 기능)은 그대로 유지
 * => 계좌번호 (accountNo), 예금주명 (ownerName), 현재잔고 (balance) 멤버변수
 * => 입금하기 (deposit), 출금하기 (withdraw), 정보보기 (showAccountInfo) 메서드
 * - 멤버변수 추가 : 보험명 (insureName, 문자열)
 * - 메서드 추가 : 보험계약 (contract())
 * 	 => 파라미터 : 보험명
 *      리턴값 : 없음
 *   => 전달받은 보험명을 멤버변수에 저장 후 "XXX 보험 계약 완료!" 출력
 */

class Account{ // = class Account extends Object
	String accountNo;
	String ownerName;
	int balance;
	
	// 입금기능
	public void deposit(int dpMoney) {
		balance += dpMoney;
		System.out.println("입금 금액 : " + dpMoney + "원");
		System.out.println("입금 후 현재잔고 : " + balance + "원");
	}
	
	// 출금기능
	public int withdraw(int wdMoney) {
		if(balance >= wdMoney) { // 현재 잔고가 출금 금액보다 적은지 판별 (출금 가능)
		balance -= wdMoney;
		System.out.println("출금 금액 : " + wdMoney + "원");
		System.out.println("출금 후 현재잔고 : " + balance + "원");
		return wdMoney;
		}else { // 출금 불가
			System.out.println("출금 금액 : " + wdMoney + "원, 현재 잔고 : " + balance + "원");
			System.out.println("출금이 불가능합니다!");
			return 0;
		}
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
}

class ItwillBank extends Account{
	String insureName;
	
	public void contract(String insureName) {
		this.insureName = insureName;
		System.out.println("'" + this.insureName + "'" + " 계약 완료!");
	}
}

