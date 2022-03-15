

public class Enum2 {
	
	public static void main(String[] args) {
		//name() 메소드
		Week today = Week.SUNDAY; //열거상수로 초기화하여 열거타입변수 정의
		
		//도트연산자(.): 객체의 멤버를 참조(사용)하는 연산자 -> 객체멤버참조연산자
		//객체: 1.고유한 성질(필드,fields) 과 2.기능(행위,메소드,method)
				
		String name = today.name();
		System.out.println(name);
		
//     --------------------------------
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
//     ----------------------------------
		//compareTo() 메소드 //두 요일간의 차이가 몇이 나는가 알려줌
 		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 =day1.compareTo(day2);	//기준<비교==>음수값반환
		int result2 =day2.compareTo(day1);	//기준>비교==>양수값반환
		int result3 =day1.compareTo(day1);	//기준==비교==>0 반환
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		//기준 == 비교 ==> return 0
		//기준 < 비교 ==> return 음수값(-1)
		//기준 > 비교 ==> return 음수값(+1)
		
// ----------------------------------------------		
		//value() 메소드
		Week[] days = Week.values();
		
		for(Week day : days) {
			System.out.println(day);
		}//for
		
	}//main

}
