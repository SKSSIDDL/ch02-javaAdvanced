package kr.s15.iostream.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderMain01 {
	public static void main(String[] args) {
		BufferedReader br = null;
		try {                                            //표준입력
			br=new BufferedReader(new InputStreamReader(System.in));
		                            	//문자스트림<-------바이트스트림
			
			System.out.print("당신의 이름: ");
			String name = br.readLine();
			System.out.println(name);
			
			System.out.print("당신의 나이: ");
			           //String->int
			int age = Integer.parseInt(br.readLine());
			System.out.println(age);
			
		}catch(IOException e) {
			System.out.println("입력시 오류 발생!!");
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력하세요");
		}finally {//콘솔에서 입력받을 떄 자원정리를 생략하는 경우도 많음
			if(br!=null)try {br.close();}catch(IOException e) {}
		}
	}
}
