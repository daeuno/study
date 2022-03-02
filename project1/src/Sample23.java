
public class Sample23 {
	
	public static void main(String[] args) {
		int from = 1;
		int to = 45;
		
		int num1 = (int)(Math.random()*(to - from +1)) + from;
		int num2 = (int)(Math.random()*(to - from +1)) + from;
		int num3 = (int)(Math.random()*(to - from +1)) + from;
		int num4 = (int)(Math.random()*(to - from +1)) + from;
		int num5 = (int)(Math.random()*(to - from +1)) + from;
		int num6 = (int)(Math.random()*(to - from +1)) + from;
		
		if((num1!=(num2&num3&num4&num5&num6)) &
		  (num2!=(num3&num4&num5&num6)) &
		  (num3!=(num4&num5&num6)) &
		  (num4!=(num5&num6)) &
	      (num5!=num6)) {
			System.out.println("나의 번호: " + num1 + ", " + num2 + ", " + num3 + ", " + num4 + ", " + num5 + ", " + num6);
			
		} if((num1==12 | num1==3 | num1==7 | num1==17 | num1==23 | num1==44) &
			  (num2==12 | num2==3 | num2==7 | num2==17 | num2==23 | num2==44) &
			  (num3==12 | num3==3 | num3==7 | num3==17 | num3==23 | num3==44) &
			  (num4==12 | num4==3 | num4==7 | num4==17 | num4==23 | num4==44) &
			  (num5==12 | num5==3 | num5==7 | num5==17 | num5==23 | num5==44) &
	     	  (num6==12 | num6==3 | num6==7 | num6==17 | num6==23 | num6==44)) {
			 	System.out.println("1등 입니다.");  
			 	
		} else {
	    System.out.println("꽝입니다.");
		} 
		
	}//main

}//end class
