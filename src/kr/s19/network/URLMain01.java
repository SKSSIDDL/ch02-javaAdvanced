package kr.s19.network;

import java.net.MalformedURLException;
import java.net.URL;

public class URLMain01 {
	public static void main(String[] args) {
		try {
			URL url = new URL("http://java.sun.com/index.jsp?name=kim#content"); //주소가 실제 접속 가능하지 않아도 형식만 맞으면 됨
			
			System.out.println("프로토콜 : "+url.getProtocol());
			System.out.println("호스트 : "+url.getHost());
			System.out.println("포트 : "+url.getPort()); //알 수 없어 -1출력
			System.out.println("기본포트 : "+url.getDefaultPort());
			System.out.println("패스 : "+url.getPath());
			System.out.println("쿼리 : "+url.getQuery());
			System.out.println("ref : "+url.getRef());
			
		}catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
}
