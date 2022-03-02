
public class Sample19 {
	
	public static void main(String[] args) {
		int score = 79;
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다."); //실행 문장이 하나면 중괄호 생략가능
		}//1
		else if(score>=80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		}//2
		else if(score>=70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		}//3
		else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}//4   //if-else if else
		
	}//main

}//end class