
public class For1 {
	
	// 1+2+...10 =???
	public static void main(String[] args) {
		
	//1.초기식: 변수를 정의(단 한 번만 수행)
	//2.조건식: for block을 반복수행할지 말지 결정
	//3.증감식: 1에서 정의한 변수의 값을 변경
				
		
		int i=1; //카운터 변수(루프제어변수):for안이 아닌 main에 변수를 선언해준것
		
		for(   ;   ;   ) { //무한루프***	
						
			if(i <= 10) { //무한루프 탈출조건***
				System.out.println(i);
				
			} else { //for문을 끝내버려라
				break;
				
			}// if else
			
			++i;//위치가 옮겨져도 괜찮음
			
		}//for
		    System.out.println(i); //for안에서 빠져나온 11 출력됨
	}//main

}//end class
