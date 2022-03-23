
public class Reference0 {
	
	public static void main(String[] args) {
		
		//String 타입의 2개의 문자열 객체가 있을때
		//이 두개의 문자열 객체의 주소를 저장하고 있는 참조변수 2개가 
		//같은 주소를 가지고 있는지 아닌지 확인 예제
		
		String strVar1 = "신민철";
		String strVar2 = "신민철"; 
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} //if else
		
//     ===========================
		
		if(strVar1.equals(strVar2)) { //equals는 문자열안의 각각의 문자가 동일한지 판단
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}//if
	}//main

}//end class
