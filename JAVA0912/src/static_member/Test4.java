package static_member;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성된 인스턴스 주소를 리턴
//		Account acc = new Account();
		Account acc = Account.getInstance();
		
		// Setter 호출하여 111-1111-111, 홍길동, 10000 입력
		acc.setAccountNo("111-1111-111");
		acc.setOwnerName("홍길동");
		acc.setBalance(10000);
		
		// showAccountInfo() 메서드로 계좌 정보 출력!
		acc.showAccountInfo();
	}
}

/*
 * Account 클래스를 싱글톤 디자인 패턴을 적용하여 설계
 * - 멤버변수 : accoutNo, ownerName, balance 모두 private 설정
 * - 메서드 : showAccountInfo(); 멤버변수에 대한 Getter/Setter 정의
 */

class Account{
	// ===== Account 클래스에 대한 싱글톤 패턴 구현 =====
	
	// 멤버 변수 선언
	private String accountNo;
	private String ownerName;
	private int balance;
	
	// Getter / Setter 메서드 정의
			public String getAccountNo() {
				return accountNo;
			}

			public void setAccountNo(String accountNo) {
				this.accountNo = accountNo;
			}

			public String getOwnerName() {
				return ownerName;
			}

			public void setOwnerName(String ownerName) {
				this.ownerName = ownerName;
			}

			public int getBalance() {
				return balance;
			}

			public void setBalance(int balance) {
				this.balance = balance;
			}
			
	// 생성자 정의
	private Account() {}		
	
	// 인스턴스 생성
	private static Account instance = new Account();
	
	// Getter 메서드 정의
	public static Account getInstance() {
		return instance;
	}
	
	// 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	

}
