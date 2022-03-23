
public class Reference1 {
	
	public static void main(String[] args) {
		//객체를 생성하고 객체의 주소도 눈으로 보자
		//TTT ttt = new TTT(); //new는 객체생성 연산자
//		System.out.println(ttt); //TTT@372f7a8d = 객체의 주소가 나옴

//	    ================================================================
		
		//null: 아직 어떤 주소도 담고 있지 않다
//		String name = null;		
//		int age = null; //기본타입변수의 초기값으로는 사용불가
//		System.out.println(name);

//	    ================================================================
//		String name = null;
//		if(name == null) {
//			System.out.println("null이 들어있습니다.");
//		} else {
//			System.out.println("null이 아닙니다");
//		}//if else

//	    ================================================================
		
		//nullpointerexception 오류: 객체의 주소가 없는데 객체를 사용하려할 때 발생
		String name = new String("제니");
		System.out.println(name.length());
		
		String name1 = new String("신용권");
		String name2 = new String("신용권");
		
//		Integer number = new Integer(100);
		
		
		
		
	}//main

}//end class

