
public class Sample13 {
	
	public static void main(String[] args) {
		int v1 = 5;
		int v2 = 2;
		
		
		//나눗셈의 결과 = 몫 + 나머지, 이때 %(나머지)연산자는 결과 중 나머지를 반환함.
		int result5 = v1 % v2;
		System.out.println("result=" + result5);
	
//8이 짝수인지 판단하는 연산		
int n = 8;
boolean isEven = n%2==0;
System.out.println(isEven);

//7이 홀수인지 판단하는 연산
int n2= 7;
int result = n2 % 2;
System.out.println(result);
		
	}//main

}// end class
