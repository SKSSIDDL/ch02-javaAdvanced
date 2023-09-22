package kr.s15.iostream.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class BufferedReaderMain02 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		//입력받은 데이터 저장
		String msg;
		
		try {
			//파일 읽기
			fr = new FileReader("file.txt");
			//br에 보내기
			br = new BufferedReader(fr);
			
			//한 라인의 데이터를 읽어들여 변수에 저장하고 출력
			while((msg = br.readLine())!=null) { //읽을 데이터가 있다면
				System.out.println(msg);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(br!=null)try {br.close();}catch(IOException e) {}
			if(fr!=null)try {fr.close();}catch(IOException e) {}
		}
	}
}
