
public class ComputerExample {
	
	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		int result1 = myCom.sum1(values1);		// 메소드호출: 매개변수는 배열
		
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		System.out.println("result2: " + result2);
		
		myCom.sum2(); 							//호출메소드가 리턴해주는 값을 사용할 곳이 없어 Lvalue 구성안함
		
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("result4: " + result4);
		
	}
}
