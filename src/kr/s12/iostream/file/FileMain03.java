package kr.s12.iostream.file;

import java.io.File;

public class FileMain03 {
	public static void main(String[] args) {
		//상대 경로
		String path = "sample.txt"; //원래 파일명
		String new_path = "example.txt"; //새 파일명
		
		File f1= new File(path);//원래 파일명 지정
		
		System.out.println("===파일명 변경===");
		
		File f2 = new File(new_path);//새 파일명 지정
		
		//파일명을 변경할 수 있으면 true 변경할 수 없으면 false 반환
		System.out.println(f1.renameTo(f2));
	}
}
