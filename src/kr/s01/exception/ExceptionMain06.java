package kr.s01.exception;

public class ExceptionMain06 {
	
	public void methodA(String[] n) throws Exception{
		if(n.length>0) {
			for(String s: n) {
				System.out.println(s);
			}
		}else {
			//인위적으로 예외를 발생
			//인위적으로 예외를 발생시킬 때는 try~catch로 감싸거나 매서드에서 사용할 경우 throws 예약어를 사용해야 오류 발생하지 않음
			throw new Exception("배열의 요소가 없습니다.");
			//try~catch나 throws가 있을 때 사용 가능(의무는 아님)
		}
	}
	
	public static void main(String[] args) {
		ExceptionMain06 ex = new ExceptionMain06();
		//ex.methodA(args); //try~catch가 없어서 컴파일 에러
		try {
			ex.methodA(args);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			//"배열의 요소가 없습니다" 뽑아내기
		}
	}
}
