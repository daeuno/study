
public interface For2 {
	
	public static void main(String[] args) {
		
		//카운터 변수의 값으로 실수를 사용해선 안된다.
		//즉 정수로 사용해야한다.
		for(float x=0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);
		}//for
	}//main

}//end class
