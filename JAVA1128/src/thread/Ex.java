package thread;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 프로그램 (Program)
		 * - 디스크에 설치되어있는 실행되기 전 상태의 소프트웨어
		 * 
		 * 프로세스 (Process)
		 * - 설치된 프로그램을 실행하여 메모리에 로딩된 상태 (= 실행 중인 프로그램)
		 * - 자원 (resources)와 쓰레드로 구성됨
		 * 
		 * 멀티태스킹 (Multi-Tasking)
		 * - 프로세스가 여러 개일 때 해당 프로세스들이 동시에 수행되는 것
		 *   (정확히는 CPU가 빠른 속도로 프로세스들을 번갈아가면서 수행)
		 * - 예를 들어 동영상을 재생하면서 웹페이지를 표시, 음악을 재생하는 것
		 * 
		 * 쓰레드 (Thread)
		 * - 프로세스 내에서 작업의 최소 단위
		 * - 프로세스 내에서 실제 작업의 수
		 * - 하나의 프로세스 내에는 최소 한 개의 쓰레드가 동작함 (= Single Thread)
		 *   => 동시에 수행 가능한 작업은 단 한 개뿐이다.
		 * - 하나의 프로세스 내에서 동시에 수행가능한 작업을 늘리려면
		 *   멀티 쓰레드 (Multi Thread)로 구현해야 한다
		 *   ex) 메신저 내에서 파일 전송과 동시에 메세지 송/수신하는 것
		 * - 하나의 새로운 프로세스를 실행하는 것보다 하나의 새로운 쓰레드를 생성하는 것이
		 *   더 적은 비용이 듦
		 */
		
		NoThread nt1 = new NoThread("★ A작업 ★", 1000000);
		NoThread nt2 = new NoThread("○ B작업 ○", 500000);
		NoThread nt3 = new NoThread("→ C작업 ←", 1000000);
		
		nt1.run(); // A 작업이 100만번 실행이 끝나면
		nt2.run(); // B 작업이 실행되고 B 작업이 50만번 실행이 끝나면
		nt3.run(); // C 작업 실행됨
		// => 일반적인 프로그램은 싱글 쓰레드 (Single Thread)이며
		//    앞의 코드가 실행이 끝나야만 다음 코드가 실행된다.

	}
}

class NoThread{
	// 멤버 변수 선언
	String name;
	int count;
	
	// 파라미터 생성자 정의 (Alt + Shift + S -> O)
	public NoThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	
	// 메서드 정의
	public void run() {
		for(int i = 1; i <= count; i++) {
			System.out.println(name + " : " + i);
		}
	}
	
}
