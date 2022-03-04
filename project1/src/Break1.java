
public class Break1 {
	
	public static void main(String[] args) throws Exception{
		
		//무한루프(반복)를 만들면 반드시 탈출조건을 생각해라!
		while(true) {  //무한루프,조건이 항상 참이기에 무한으로 반복수행
			
			int num =(int)(Math.random()*(6-1+1)) +1; //1~6 사이의 무작위 정수 생성
			
			System.out.println(num);
			
		    //탈출조건
			if (num == 6) { //만일 무작위 정수가 6이라면
				break;      //while 반복문을 깨뜨려라 break=반복종료
			}//if
		}//while
		
		System.out.println("프로그램 종료");
	}//main

}//end class
