
public class Enum4 {
	
	public static void main(String[] args) {
		
		Week today = Week.FRIDAY;
		
// -----
		
		//A.이전 Switch 문 예
		String typeOfDay = null;
		
		switch(today) {
		case MONDAY		:
		case TUESDAY	:
		case WEDNESDAY	:
		case THURSDAY	:
		case FRIDAY		:	typeOfDay = "Working Day"; break;
		case SATURDAY	:
		case SUNDAY		:	typeOfDay = "Day Off"; break;
		}//switch
		
		System.out.println("1. typeOfDay: " + typeOfDay);
// -----
		
		//B. New switch expression
		typeOfDay = switch(today) {
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "working Day";
		case SATURDAY, SUNDAY -> "Day Off";
		}; //switch expression
		
		System.out.println("2. typeOfDay: " + typeOfDay);
// -----		
		
		//Example2- 값을 반환하지 않고 스위치 표현식에서 코드를 실행할 수도 있다
		
		switch(today) {
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("working Day");
		case SATURDAY, SUNDAY -> System.out.println("Day Off");
		} //switch expression
		
// -----		
		
		//Example3- 더 복잡한 논리는 중괄호로 감싸야한다
		
		switch(today) {
		//typeOfDay = switch(today) 
		case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
			System.out.println("1st.case");
			System.out.println("\t+ Working Day");  // \t: 들여쓰기, \n:줄바꾸기
			
			//yield "Working day";
		}
		
		case SATURDAY, SUNDAY -> {
			System.out.println("2nd.case");
			System.out.println("\t+ Day Off");
			
			//yield "Day Off";
		}
		
		}//switch expression
		
	}//main	
}//end class
