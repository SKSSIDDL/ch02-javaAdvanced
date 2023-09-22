package kr.s14.iostream.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			//파일 만들기
			fos = new FileOutputStream("bufferOut.txt");
			
			//파일정보를 bos에 보내기
			bos = new BufferedOutputStream(fos); //메모리 공간에 데이터를 넣어서 활용
			
			//파일에 저장할 문자열
			String str = "BufferedOutputStream Test입니다.";
			
			//변환        String->byte[]
			bos.write(str.getBytes()); //buffer에만 기록
			
			//버퍼를 비우고 버퍼에 있는 데이터를 파일에 출력
			//flush를 하지 않으면 버퍼에 담겨있는 데이터를 파일에 저장하지 않음
			bos.flush();
			
			System.out.println("파일을 생성하고 파일에 내용을 기술함");
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리(bos->fos)-서로 관계가 있다면 생성된 순서 역순으로 정리
			//BufferedOutputStream의 close메서드는 자원정리하기 전에 buffer체크
			//남아있는 데이터가 있으면 flush 처리함(line 26을 하지 않아도 출력가능)
			if(bos!=null)try {bos.close();}catch(IOException e) {}
			if(fos!=null)try {fos.close();}catch(IOException e) {}
		}
	}
}
