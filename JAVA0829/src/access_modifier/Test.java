package access_modifier;

public class Test {

	public static void main(String[] args) {
		// 은행계좌 (Account) 클래스의 인스턴스 (acc) 생성
		// Setter() 메서드로 111-1111-111, 홍길동, 10000 입력
		// Getter() 메서드를 활용하여, 계좌번호, 예금주명, 현재잔고를 출력
		
		Account acc = new Account();
		
		acc.setAccount("111-1111-111");
		acc.setOwnerName("홍길동");
		acc.setBalance(10000);
		
		System.out.println("계좌번호 : " + acc.getAccount());
		System.out.println("예금주명 : " + acc.getOwnerName());
		System.out.println("현재잔고 : " + acc.getBalance());

	}

}


/*
* Account 클래스 정의
* - 멤버변수 (private 접근제한자로 선언)
*   accountNo (문자열), ownerName(문자열), balance (정수)
* - Getter/Setter 메서드 정의 (단축키 사용 가능)
*/


class Account{
	private String account;
	private String ownerName;
	private int balance;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
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
	
	
}