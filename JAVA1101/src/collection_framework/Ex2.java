package collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 반복문을 사용하여 컬렉션의 요소에 반복 접근하는 방법 (공통 방법)
		 * 1. 향상된 for문 (forEach문)을 사용하는 방법
		 * 2. Iterator (반복자)를 사용하는 방법
		 * 3. 일반 for문을 사용하는 방법 (List 계열)
		 * 
		 * < 향상된 for문 (forEach문) 기본 문법 >
		 * for(데이터를 꺼내서 저장할 변수 선언 : 데이터가 저장된 객체 [배열]){
		 * 		// 데이터가 저장된 변수를 사용하여 요소에 접근
		 */

		// 1. 향상된 for문 사용
		Set set = new HashSet(Arrays.asList(300, 30, 1, 200, 100, 1));
		
		// Set 계열은 인덱스가 없으므로 일반 for문은 사용 불가능 => 향상된 for문
		// 1) 제네릭 타입이 지정되지 않은 Set 객체는 Object 타입으로 저장되므로
		//    데이터를 저장할 변수도 Object 타입 선언 필요
		
		for(Object o : set) {
			System.out.println(o);
		}
		
		// 2) 제네릭 타입을 Integer 타입으로 지정한 Set 객체는
		//    모든 데이터가 Integer 타입으로 저장되므로 변수도 int (Integer)
		
		Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));
		for(int num : set2) { // Integer 타입 지정 가능
			System.out.println(num);
		}
		
		
		/*
		 * < Iterator (반복자) 사용 기본 문법 >
		 * 1. 컬렉션 객체 (Set 또는 List)의 iterator() 메서드를 호출하여
		 *    Iterator 인터페이스를 구현한 객체를 리턴 받음
		 * 2. while문을 통해 Iterator 객체의 hasNext() 메서드가 true일 동안 반복
		 * 3. 반복문 내에서 Iterator 객체의 next() 메서드를 통해 데이터 가져오기
		 */
		
		Iterator ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		// Iterator 객체도 제네릭 타입 지정 가능
		Iterator<Integer> ite2 = set2.iterator();
		while(ite2.hasNext()) {
			int num = ite2.next();
			System.out.println("set 객체에 " + num + "이 존재하는가? : " + set.contains(num));
		}
	}

}
