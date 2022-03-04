//길을 가다 동굴에 빠짐
//동굴은 100미터, 하루에 20미터 올라갈 수 있음, 자는동안 5미터 감소
//100초과여야 탈출로 인정
public class Report1 {
	
	public static void main(String[] args) {
	 
	int meter = 20;				
	int day = 1;
	
	while(meter<=100) {
		
		meter += (20-5);
		
		day++;
		
	}//while
		System.out.println(day +"일");
		
	}//main
}//end class
