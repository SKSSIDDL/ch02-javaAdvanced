package kr.s12.iostream.file;

import java.io.File;

public class FileMain06 {
	public static void main(String[] args) {
		//디렉토리 삭제
		
		String path = "C:"+File.separator+"javaSample";
		
		System.out.println("===디렉토리 삭제===");
		File f1 = new File(path); //디렉토리 인식
		
		//디렉토리는 하위 디렉토리 또는 파일이 존재하면 디렉토리를 삭제할 수 없다.
		if(f1.delete()) {       //디렉토리명
			System.out.println(f1.getName()+" 디렉토리 삭제");
		}else {
			System.out.println("디렉토리를 삭제할 수 없습니다."); //디렉토리 이하에 디렉토리/파일이 존재하면 삭제할 수 없다.
		}
	}
}
