
public class Array1 {
	
	public static void main(String[] args) {
		
		//배열: 같은 타입의 데이터를 0개 이상 저장할 수 있는 자료구조(Data structure)이자 객체이다.
		
		int[] scores = {83, 90, 87}; //이게 배열이다!!
		
		System.out.println("scores[0] : " + scores[0]); //배열의 첫번째 원소 출력
		System.out.println("scores[1] : " + scores[1]); //배열의 두번째 원소 출력
		System.out.println("scores[2] : " + scores[2]); //배열의 세번째 원소 출력
//      ----------------------------------------------------------------------		
		int sum1 = 0;
		 
		for(int i=0; i< scores.length; i++) {      //배열이 저장하고 있는 모든 데이터의 합을 구하자!
			sum1 += scores[i];
			
		}// for
//      -----------------------------------------------------------------------		
//		
//		System.out.println("총합 : " + sum);
//		
//		double avg = (double) sum / 3;   // 배열 데이터의 총합과 원소의 개수로 평균을 구하자!
//		
//		System.out.println("평균 : " + avg);
//		
//      -----------------------------------------------------------------------
		
		System.out.println("총합 : " + sum1);
		int sum2 = add(new int[] {83,90,87});
		
		System.out.println("총합 : " + sum2);
		System.out.println();
	}//main
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
			
		}//for
		return sum;
	}//add

}//end class
