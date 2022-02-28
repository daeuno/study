public class Sample4 {
	
	public static void main(String[] args) {
		long var1 =10; //l이 없으면 int로 들어감
		long var2 =20L;
		
	  //long var3 = 1000000000000; //l이 없어 int로 가정. int가 보관가능 범위를 초과
		long var4 = 1000000000000l;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
	}//main

}//end class