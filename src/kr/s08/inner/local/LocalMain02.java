package kr.s08.inner.local;

public class LocalMain02 {
	
	//멤버 메서드
	public void innerTest(int a) { //int 앞에 암묵적으로 final이 존재
		//a의 값 변경
		//a= 500; //a값이 자동으로 상수로 변해서 변경 불가능 => 내부클래스에서 호출 불가능
		
		int b= 200; //int 앞에 암묵적으로 final이 존재
		
		//b(지역변수)의 값 변경
		//b가 지역변수에서 자동으로 상수화되기 때문에 값을 변경할 수 없음
		//b = 10;
		
		//로컬 내부클래스
		//로컬 내부클래스가 포함된 메서드의 지역변수를 로컬내부클래스에서 가져다 쓰게 하기 위해 지역변수를 상수화함
		//따라서 상수화 된 값은 변경 불가능
		class Inner{
			public void getData() {
				System.out.println("a : "+a);
				System.out.println("b : "+b);
				
				//상수화되서 변경 불가능
//				a=100;
//				b=200;
			}
		}
		//로컬 내부클래스 객체 생성
		Inner i = new Inner();
		i.getData();
	}
	
	public static void main(String[] args) {
		LocalMain02 lo = new LocalMain02();
		lo.innerTest(70);
	}
}
