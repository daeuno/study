public class Report3_Array {

	public static void main(String[] args) {
		
	 int[] intArray = {87, 13, 5, 99, 133, 30, 27};
	 int count = 0;
	
	 for(int i= 0; i<7; i++) {		 
		 for(int a = 2; a<=intArray[i]; a++) { //2부터 시작하여 판별하는 수까지 나눠본다
			 if(intArray[i] % a==0) { 
				 count++;			
	  }//if 
		
		 
		 }//inner for
		 	if(count==1) {
	 			System.out.println(intArray[i] + "는 소수입니다");
	 		
		 } else {
			 System.out.println("소수가 아닙니다");
		 }//if-else
	 		
	 		}//outer for
	 
	 
	}//main
}//end class
