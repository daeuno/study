import java.util.Scanner;

public class Dowhile1 {
	
	public static void main(String[] args) {
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		String inputString; //변수의 목적: 사용자의 입력 문자열을 저장하는 용도
		
		//키보드로부터 입력데이터를 받고자할 때 Scanner를 사용한다
		Scanner scanner = new Scanner(System.in); //***
		
		do {
			System.out.println(">"); //'>': 입력위치를 알려주는기호. 'prompt'라고 함.
			
			//사용자가 입력한 문자열을 마치 스캐너가 스캐닝해서 이미지를 만들어 주듯이
			//문자열로 만들어 되돌려주는 문장
			inputString = scanner.nextLine(); //변수의 초기화가 일어남 //***
			
			System.out.println(inputString); //사용자가 입력한 문자열 출력
			
		} while( ! inputString.equals("q")); //변수의 값이 문자열"q"이면 true
		
		System.out.println();
		System.out.println("프로그램종료");
	}//main

}//end class
