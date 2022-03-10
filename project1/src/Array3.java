
public class Array3 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		
//		for(int i=0; i<3; i++) {
//			System.out.println("arr1[" + i + "] : " + arr1[i]);  //값을 주지않고 공간만 확보
//		}// for
		
		for( int number : arr1 ) {
			System.out.println(number);
		}//enhanced for *** 가 사용될 수 있는게 배열, iterable(반복가능한)객체만 올 수 있다
//==============

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}//classical for
		
		
//==============
		
		double[] arr2 = new double[3];
		
//		for(int i=0; i<arr2.length; i++) {
//			System.out.println("arr2[" + i + "] : " + arr2[i]);
//		}//classical for	
		
		for(double number : arr2 ) {
			System.out.println(number);
		}//enhanced for
		

//==============
		
		arr2[0] = 0.1;
		arr2[1] =  .2;
		arr2[2] = 0.3;
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}	
//==============
			
		String[] arr3 = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		
// -------------
		arr3[0] = "1월";	
		arr3[1] = "2월";	
		arr3[2] = "3월";	}
		
		for(int i=0; i<3; i++ ) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}//for
		
	}//main

}//end class
