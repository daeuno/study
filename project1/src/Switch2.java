
public class Switch2 {
	
	public static void main(String[] args) {
		char grade = 'B'; //66
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수회원입니다.");
			break;
		case 'B':
//			System.out.println("일반회원입니다.");  =>중복된 코드
//			break;
		case 'b':
			System.out.println("일반회원입니다.");
			break;
		default:
			System.out.println("손님입니다.");
		}//switch
	}//main

}//end class
