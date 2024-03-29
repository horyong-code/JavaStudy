package access_modifier_p1;

public class SamePackageSomeClass {
	public void useMember() {
		// 같은 패키지 내의 다른 클래스 (ParentClass)의 멤버에 접근
		// 인스턴스 생성 후 참조변수를 통해 접근해야 함
		// => 같은 패키지이므로 import문이 불필요! [같은 패키지에서는 패키지명 생략 가능]
		
		ParentClass p = new ParentClass();
		p.publicVar = 10;    // public (O)
		p.protectedVar = 20; // protectec (O)
		p.defaultVar = 30;   // default (O)
//		p.privateVar = 40;   // private (X) - 다른 클래스에서 접근 불가
	}
}
