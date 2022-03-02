
public class Sample16 {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println('A');
		}//if
		
		int value = 6;
		if ((value%2==0) | (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요");
		}// if
		
		if((value%2==0) || (value%3==0)) {
			System.out.println("2 또는 3의 배수이군요");
		}// if
	
	
	
	
	
//	//문자열 연결 연산자 : '+'
//	public static void main(String[] args) {
//		String str1="JDK" + 6.0;
//		String str2=str1 + " 특징";
//		
//		System.out.println(str1);
//		System.out.println(str2);
//		
////      ---
//		
	}//main

}//end class
