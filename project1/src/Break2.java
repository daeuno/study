
public class Break2 {
	
	public static void main(String[] args) {
		
		Outter: for(char upper='A'; upper<='Z'; upper++) {
					for(char lower='a'; lower<='z'; lower++) {
						System.out.println(upper + "-" + lower);
						
						if(lower=='g') {
							break Outter; //깨뜨릴범위->레이블을 함께 붙어줌
						}//if
						
					}//inner-for
					
			}//outer-for
		
		System.out.println("프로그램 실행 종료");
	}//main

}//end class
