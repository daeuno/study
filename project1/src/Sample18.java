
public class Sample18 {
	
//복합대입연산자 예제
	public static void main(String[] args) {
		int result = 0;
		result += 10;
		//result = result + 10 위와 같음
		System.out.println("result=" + result);
		
		result -= 5;
//		result = result -5;
		System.out.println("result=" + result);
		
		result *= 3;
//      result = result * 3;
		System.out.println("result=" + result);
		
		result /= 5;
//      result = result / 5;
		System.out.println("result=" + result);
		
		result %= 3;
//      result = result % 3;
		System.out.println("result=" + result);
		
		//문제: 복합대입연산자로, result값을 1 증가 시키는 코드를 만들어라
		
		result = 100;
		result +=1;
		System.out.println("result=" + result);


	}//main

}//end class
