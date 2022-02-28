
public class Sample14 {
	public static void main(String[] args) {
		
		//정수 연산식의 결과는 int타입이다
		//리터럴은 형변환을 하지 않는다
		char c1 = 'A' +1;
		char c2 = 'A';
		int c3 = c2 +1; //컴파일 에러
		
		//'a'는 리터럴(상수)이기에 형변환을 안따짐// c2는 변수. 변수는 형변환을 따진다
		
		System.out.println("c1:" + c1);
		System.out.println("c2:" + c2);
		System.out.println("c3:" + (char)c3);
	}//main

}//end class
