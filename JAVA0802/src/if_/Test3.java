package if_;

public class Test3 {

	public static void main(String[] args) {
		// 문자 ch에 대해 대문자, 소문자, 숫자 판별
		// => 위의 모든 조건이 false일 때 "기타 문자" 출력
		
		// => 소문자 : 'a' (97) 이상이고 'z' (122) 이하인 문자
		// => 대문자 : 'A' (65) 이상이고 'Z' ( 90) 이하인 문자
		// 차이는 32만큼 난다
		
		char ch = '8';
		if(ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " : 소문자");
		}else if(ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " : 대문자");
		}else if(ch >= '0' && ch <= '9') { 
			System.out.println(ch + " : 숫자");
		}else {System.out.println(ch + " : 기타 문자");
		
		};
		
		System.out.println("========================================");

		// 문자 ch2가 대문자일 때 소문자로 변환하고, 소문자일 때 대문자로 변환
		// => 대문자, 소문자가 아닐 경우 "변환 불가!" 출력
		
		char ch2 = 'A';
		if(ch2 >= 'a' && ch2 <= 'z') {
			System.out.println(ch2 + " : 소문자");
			ch2 -= 32;
			System.out.println("변환 결과 : " + ch2);
		}else if(ch2 >= 'A' && ch2 <= 'Z') {
			System.out.println(ch2 + " : 대문자");
			ch2 += 32;
			System.out.println("변환 결과 : " + ch2);
        }else {
        	System.out.println(ch2 + " : 기타 문자");
        	System.out.println("변환 불가!");
        };
		System.out.println("========================================");
        /*
         * 학생의 점수를 입력받아 학점 계산 후 출력
         * - 점수 (정수형)를 저장할 변수 score를 선언하고 임의의 점수 저장
         * - 학점 (문자열)을 저장할 변수 grade를 선언하고 "" (널 스트링) 저장
         * 
         * if문을 사용하여 다음 조건에 맞는 학점을 계산하고
         * 계산 결과에 따른 학점을 문자열로 grade 변수에 저장
         * 
         * 학점 "A" : 점수가 90 이상 ~ 100 이하
         * 학점 "B" : 점수가 80 이상 ~ 90 미만
         * 학점 "C" : 점수가 70 이상 ~ 80 미만
         * 학점 "D" : 점수가 60 이상 ~ 70 미만
         * 학점 "F" : 점수가  0 이상 ~ 60 미만
         * 
         * <출력 예시>
         * 85점의 학점 : B
         * 
         */
        
        int score = 153;
        String grade = "";
        
        if(score >=0 && score <=100) {
        if(score >= 90 && score <= 100) {
        	grade = "A";
        }else if(score >=80) {
        	grade = "B";
        }else if(score >=70) {
        	grade = "C";
        }else if(score >=60) {
        	grade = "D";
        }else if(score >=0) {
        	grade = "F";
        };
        // 모든 조건에서 출력문이 동일하므로 코드 중복 발생함
        // => 동일한 문장을 실행하는 경우에는 if문 바깥에서 실행할 경우
        //    코드 중복을 제거할 수 있다.
        System.out.println(score + "점의 학점 : " + grade);}
        else {System.out.println("올바른 점수가 아닙니다.");};

	}

}
