
public class Switch5 {
	
	//switch expressions#2
	public static void main(String[] args) {
		
		int number=7;
		
		int result = switch(number) {
		
					case 1 -> 100;
					case 2 -> 1+2+3;
					case 3 -> number;
//					case 4 -> true; //type miss match
					case 5 -> 400;
					default ->  0;
					}; //switch expression
					
					System.out.println(result);
	}//main

}//end class
