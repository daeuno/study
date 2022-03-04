
public class While2 {
	
	public static void main(String[] args) {
		int sum = 0;  //값을 0으로 초기화
		int i = 1;
		
		while(i<=100) {
			sum += i;            //복합대입연산자
			//sum = sum + i;
			
			i++;
			
		}//while
		
		System.out.println("1~" + (i-1) + " 합 : " +sum); 
		//빠져나오는 값은 101 이니까 -1해줌
		
	}//main

}//end class
