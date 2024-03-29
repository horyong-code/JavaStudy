package thread;

import javax.swing.JOptionPane;

public class Ex2_2 {

	public static void main(String[] args) {
		/*
		 * 싱글 쓰레드로 동작하는 프로그램의 경우 하나의 실행이 완료되어야
		 * 다음 동작으로 넘어간다.
		 * 아래는 입력창에 값을 넣어야만 출력문과 for문이 실행
		 */
		
//		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
//		System.out.println("입력하신 값은 " + input + "입니다.");
		
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//			
//			try {
//				Thread.sleep(1000L); // 1000밀리초 = 1초 -> Thread.sleep() : 시간마다 쓰레드 동작
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		// ===========================================================================================
		// 멀티쓰레드로 위의 내용을 구현하게 되면 입력창에 값을 넣지 않아도
		// 별도로 for문이 동작하게 된다.
		
		MultiThread mt = new MultiThread();
		mt.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력하신 값은 " + input + "입니다.");		
		
	}
}

class MultiThread extends Thread{

	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000L); // 1000밀리초 = 1초 -> Thread.sleep() : 시간마다 쓰레드 동작
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}