
public class Sample21 {
	
	//무작위 난수 생성: 1(offset), 6개(length) 정수 추출
	public static void main(String[] args) {
		//int num = (int)(Math.random()*6) + 1;
		
		// 로또번호: 1(from) ~ 45(to)
		int from =1;
		int to =45;
		
		int num = (int)(Math.random()*(to-from +1)) + from;
		System.out.println(num);
		
//		if(num==1) {
//			System.out.println("1번이 나왔습니다.");
//		} else if(num==2) {
//			System.out.println("2번이 나왔습니다.");
//		} else if(num==3) {
//			System.out.println("3번이 나왔습니다.");
//		} else if(num==4) {
//			System.out.println("4번이 나왔습니다.");
//		} else if(num==5) {
//			System.out.println("5번이 나왔습니다.");
//		} else if(num==6) {
//			System.out.println("6번이 나왔습니다.");
//		}
	}
		

}
