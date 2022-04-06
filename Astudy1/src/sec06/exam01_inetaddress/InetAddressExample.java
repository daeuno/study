package sec06.exam01_inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			//InetAddress 클래스의 정적메소드인 getLocalHost() 메소드를 호출해,
			//내 PC의 IP주소를 가지고 있는 InetAddress 객체를 얻어냄
			InetAddress local = InetAddress.getLocalHost();
//			System.out.println("내 컴퓨터 IP 주소: " + local.getHostAddress());
//			System.out.println(local); 
//			---			
			
			//DNS서버에 질의한 도메인명에 매핑돼있는 모든 IP주소를 달라 요청			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
					
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소" + remote.getHostAddress());
			} // enhanced for
		} catch(UnknownHostException e) {
			e.printStackTrace();
		} // try-catch
	} // main
} // end class

