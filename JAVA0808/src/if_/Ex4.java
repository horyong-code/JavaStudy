package if_;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 중첩 if문
		 * - if문 (else if 또는 else 포함) 블록 내에서
		 *   또 다른 if 문을 사용하여 조건식을 판별하는 것
		 *   
		 * <기본 문법>
		 * if(조건식1){  
		 *   if(조건식2){
		 *         // 조건식1이 true이고 조건식2도 true일 때 실행
		 *   } else {
		 *         // 조건식1이 true이고 조건식2는 false일 때 실행
		 *   } else { 
		 *         // 조건식1이 false일 때 실행
		 * }  
		 *   
		 */
		
        int score = 53;
        String grade = "";
        
        if(score >=0 && score <=100) {
        	// 이미 0 ~ 100 사이의 점수만 입력 가능하므로
        	System.out.println("점수 입력 완료!");
        
        	if(score >= 90) { // 90 이상일 때 자동으로 100 이하가 적용
        		grade = "A";
        	} else if(score >=80) { 
        	  // 위의 조건이 거짓이면 자동으로 89 이하
        		grade = "B";
        	} else if(score >=70) { 
        	  // 위의 조건이 거짓이면 자동으로 79 이하
        		grade = "C";
        	} else if(score >=60) {
          	  // 위의 조건이 거짓이면 자동으로 69 이하
        		grade = "D";
        	} else {
          	  // 위의 조건이 모두 거짓이면 자동으로 59 이하
        	  // 이미 첫 번째 if문의 조건식에서 0 ~ 100 사이 점수만
        	  // 입력 가능하므로 0 이상 59 이하의 범위는 모두 else에 포함
        		grade = "F";
        	};
        	System.out.println(score + "점의 학점 : " + grade);
        	}else {
        		System.out.println(score + "점 : 점수 입력 오류!");};
        
        
        
        
        
        
        
	}
}


