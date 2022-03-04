
public class X99 {
	
	public static void main(String[] args) {
		
		int dansu =2; //구구단의 단수를 저장
		
		TonnyStark: for(   ; dansu <= 9 ; dansu++) { //단수를 반복하는 반복문(2~9단까지)
//			System.out.println(dansu);
			System.out.println(dansu+" 단");
			
			
			for(int i=1; i<=9; i++ ) {
//				System.out.println("\t"+i);  //\t:들여쓰기
				
				System.out.println("\t" + dansu + " x " + i + " = " + (i*dansu) );
				
				if(i*dansu == 63 & dansu == 9 ) {
					break TonnyStark;
				} //if
				
			}//inner-for
		}//Outer-for
		
	}//main

}//end class
