
public class Student {
	public static void main(String[] args) {
	Student s1 =  new Student();
	System.out.println("s1변수가 Student 객체를 참조합니다");
	System.out.println(s1);  //주소가 출력이 된다
 
	
	Student s2 = new Student();
	System.out.println("s2변수가 또 다른 Student 객체를 참조합니다");
	
	
	System.out.println(s1 == s2);
	
	}
}//end class
