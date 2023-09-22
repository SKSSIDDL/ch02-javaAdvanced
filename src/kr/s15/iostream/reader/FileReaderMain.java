package kr.s15.iostream.reader;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;


public class FileReaderMain {
	public static void main(String[] args) {
		FileReader fr = null;
		//저장공간
		int readChar;
		
		try {
			//문자 스트림
			fr = new FileReader("file.txt");
			
			//파일로부터 데이터를 한 문자씩 읽어들여 유니코드로 반환(한글오류X)
			//라인으로 읽고싶다면 BufferedReader의 readLine()이용
			while((readChar = fr.read())!=-1) { //읽을 데이터가 있으면
				System.out.print((char)readChar);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(fr!=null)try {fr.close();}catch(IOException e) {}
		}
	}
}
