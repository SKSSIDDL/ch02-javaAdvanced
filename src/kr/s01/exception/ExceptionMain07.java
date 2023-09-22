package kr.s01.exception;

import java.util.Scanner;

//사용자 정의 예외 클래스
class NegativeNumberUseException extends Exception{ //모든 기능을 Exception에 가져다 씀
	public NegativeNumberUseException(String str) {
		super(str);
	}
}

public class ExceptionMain07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("0이상만 입력 :");
		try {
			int a = input.nextInt();
			if(a >=0) {
				System.out.println("입력한 숫자 : "+a);
			}else {
				throw new NegativeNumberUseException("음수를 사용할 수 없습니다.");
			}
		}catch(NegativeNumberUseException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			System.out.println("예외 발생");
		}finally {
			if(input != null) input.close(); //input(Scanner)가 null이 아닐 경우를 넣어주기
		}

	}
}
