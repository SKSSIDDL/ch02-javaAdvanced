package kr.s13.iostream.input;

import java.io.FileInputStream; //InputStream 상속되어 있음
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamMain {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int readbyte;//아스키코드 저장
		byte[] readbyte2;//byte배열 생성
		
		try {
			fis = new FileInputStream("file.txt"); //프로젝트에서 찾음
			//파일의 정보를 한 문자씩 읽어들여 아스키 코드로 반환
			//영문 이외의 문자는 깨짐
			/*
			while((readbyte = fis.read())!=-1){
				System.out.print((char)readbyte);
			}
			*/
			
			//영문 이외의 문자도 처리 가능
			readbyte2 = new byte[fis.available()];
			                   //file의 내용을 byte로 환산
			//파일로부터 읽어들인 데이터를 byte[] 에 저장
			fis.read(readbyte2);
			                   //byte[]->String 변환
			System.out.println(new String(readbyte2));
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(fis != null)try {fis.close();}catch(IOException e) {}
		}
	}
}
