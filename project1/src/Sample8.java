
public class Sample8 {
	
	public static void main(String[] args) {
		byte byteValue1=10;
		byte byteValue2=20;
		
		//byte byteValue3= byteValue1 +byteValue2; //컴파일에러
		byte byteValue3= (byte) (byteValue1 + byteValue2);
		int intValue1 = byteValue1 + byteValue2;
		
		System.out.println(intValue1);
		System.out.println(byteValue3);
	}

}
