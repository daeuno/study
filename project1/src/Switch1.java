
public class Switch1 {
	
	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6) +1;
		System.out.println("num= " +num);
		
		switch(num) {
		
		default: //무조건 붙여주는게 아님
			System.out.println("5,6번이 나왔습니다.");
			break; //디폴트가 문미에 오는게 아니라면 붙여줘야함
		case 1: //case 끝은 ':' 으로 마감함
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
//		case 5:
//			System.out.println("5번이 나왔습니다.");
//			break;
//		case 6:
//			System.out.println("5번이 나왔습니다.");
//			break;
			}//switch
	}//main

}//end class
