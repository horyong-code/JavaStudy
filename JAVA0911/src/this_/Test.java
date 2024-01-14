package this_;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account();
		acc.showAccountInfo();
		System.out.println("------------------------------");
		
		acc.setAccountNo("123-4567-890");
		acc.setOwnerName("이순신");
		acc.setBalance(10000);
		acc.showAccountInfo();		
		

	} // main() 메서드 끝

} // Ex 클래스 끝

/*
 * Account 클래스 생성
 * - 멤버변수 : accoutNo, ownerName, balance 선언 (private 접근제한자 사용)
 * - 파라미터 3개를 전달받아 초기화하는 파라미터 생성자 정의
 * - Getter/Setter 메서드 정의
 * - showAccountInfo() 메서드 정의 -> 계좌번호, 예금주명, 현재잔고 출력
 */

class Account{
	// 멤버 변수 선언
	private String accountNo;
	private String ownerName;
	private int balance;
	
	// 기본 생성자 정의
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	// 파라미터 생성자 정의
	public Account(String accountNo, String ownerName, int balance) {
		// 인스턴스 변수와 로컬 변수 이름이 동일하므로
		// 인스턴스 변수 앞에 레퍼런스 this를 붙여서 구별
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	// Getter / Setter 정의
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String account) {
		this.accountNo = account;
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
	
	// 메서드 정의
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");	
	}
}
