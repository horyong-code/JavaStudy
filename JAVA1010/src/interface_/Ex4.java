package interface_;

public class Ex4 {

	public static void main(String[] args) {
		// 3. 서로 상속 관계가 없는 클래스 간에 인터페이스를 통한 상속 관계 부여
	
		Ex4 ex = new Ex4();
		ex.noRelationship();
		ex.hasRelationship();
		
	} // main() 메서드 끝
	
	public void noRelationship() {
//		NoteBookPc notebook = new NoteBookPc();
//		notebook.charge();
//		
//		SmartPhone smartphone = new SmartPhone();
//		smartphone.charge();
		
		// 두 개의 인스턴스를 하나의 배열로 관리해야 할 경우
		// NoteBookPc와 SmartPhone의 공통 타입은 Object 타입밖에 없음
		Object[] objArr = {new NoteBookPc(), new SmartPhone()}; // 업캐스팅
		
		// 반복문을 사용하여 배열 크기만큼 반복
		for(int i = 0; i < objArr.length; i++) {
			// objArr[i].charge();
			// The method charge() is undefined for the type Object
			// => 참조 영역 축소로 인해 Object 타입으로 charge() 메서드 호출 불가
			
			// instaneof 연산자 사용 - NoteBookPc와 SmartPhone 타입 판별
			// => 다운캐스팅을 통해 각 인스턴스를 따로 접근해야 함
			//    접근하고자 하는 charge() 메서드는 각 클래스에서 직접 정의한
			//    인스턴스 멤버 메서드이기 때문
			if(objArr[i] instanceof NoteBookPc) {
				// Object -> NoteBookPc 타입으로 다운캐스팅 후 charge() 호출 
				NoteBookPc notebook = (NoteBookPc)objArr[i];
				notebook.charge(); // 노트북의 충전기를 통해 충전
			}else if(objArr[i] instanceof SmartPhone) {
				// Object -> SmartPhone 타입으로 다운캐스팅 후 charge() 호출
				SmartPhone smartphone = (SmartPhone)objArr[i];
				smartphone.charge(); // 스마트폰의 충전기를 통해 충전
			}
		}
	}

	public void hasRelationship() {
		// 인터페이스를 사용하여 공통된 멤버를 갖는 상속 관계를 부여할 경우
		// 해당 인터페이스 타입으로 다운캐스팅할 필요없이
		// 업캐스팅된 상태 그대로 멤버에 접근 가능!
		// => 다형성으로 인한 코드 절약
		
		Chargeable c = new NoteBookPc2(); // NoteBookPc2 -> Chargeable 업캐스팅
		Chargeable c2 = new SmartPhone2(); // SmartPhone2 -> Chargeable 업캐스팅
		
		// Chargeable 타입 배열로 두 클래스 인스턴스 모두 관리 가능
		Chargeable[] chargeableArr = {new NoteBookPc2(), new SmartPhone2()}; // 업캐스팅
		
		// 업캐스팅 후에도 공통 메서드 (charge())를 호출 가능하므로
		// 별도의 다운캐스팅 없이 바로 charge() 메서드 접근 가능
		for(int i = 0; i < chargeableArr.length; i++) {
			chargeableArr[i].charge();
		}
		
		
	}

} // Ex4 클래스 끝

// Object 클래스 외의 슈퍼클래스가 없는 NoteBookPc와 SmartPhone의
// 공통 인터페이스 Chargeable 인터페이스 정의

interface Chargeable{
	// 두 클래스에서 공통으로 사용할 충전 (charge()) 기능을 추상 메서드로 정의
	public abstract void charge();
}

// 기존 Pc 클래스를 상속받고 있는 상태에서
// 추가로 인터페이스를 구현해야 하는 경우 상속 코드 뒤에 구현 코드를 기술
// => implements Chargeable 추가
// => 아무 관계도 없던 두 클래스에 동일한 부모 인터페이스가 추가되어
//    서로 상속 관계로 묶이게 됨
class NoteBookPc2 extends Pc implements Chargeable{

	@Override
	public void charge() {
		System.out.println("노트북 충전 중...");
	}
}

class SmartPhone2 extends HandPhone implements Chargeable{

	@Override
	public void charge() {
		System.out.println("스마트폰 충전 중...");
	}
}

// ========================================================================

class Pc{ // Pc 클래스 정의 = class Pc extends Object
	
}

class NoteBookPc extends Pc{ // Pc 클래스를 상속받는 NoteBookPc 클래스 정의
	public void charge() {
		System.out.println("노트북 충전 중...");
	}
}

class HandPhone{ // HandPhone 클래스 정의
	
}

class SmartPhone extends HandPhone{
	public void charge() {
		System.out.println("스마트폰 충전 중...");
	}
}
