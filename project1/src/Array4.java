
public class Array4 {
	
	public static void main(String[] args) {
//전통적인방법***	
//	int[][] mathScores = new int[2][3];
	
//	for(int i=0; i<mathScores.length; i++) {
//		for(int k=0; k<mathScores[i].length; k++) {
//			System.out.println("mathScores["+i+"]["+k+"]=" + mathScores[i][k]);

//아래는 enhanced for 사용***
			int[][] mathScores = { {1,2} , {3,4}, {5,6,7},{} };
			for( int [] arr1 : mathScores ) {
				for( int number : arr1) {
					System.out.println(number);
					
			
		}//inner-enhanced for
	}//outer-enhanced for
	
	System.out.println(mathScores.length);
	System.out.println(mathScores[0].length);
	System.out.println(mathScores[1].length);
	System.out.println(mathScores[2].length);
//===============================
	
//	int[][] englishScores = new int[2][]
	}

}
