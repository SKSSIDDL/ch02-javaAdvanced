package kr.s10.inner.anony;

//내부클래스
class Inner6{
	public void disp() {
		System.out.println("부모 클래스 disp");
	}
}

public class AnonyMain {
	
	public void make() {
		//익명 내부클래스(부모 이름을 빌려다 씀)
		Inner6 i = new Inner6() { //생성자 뒤에 {}(중괄호)는 익명 내부클래스 100%
			@Override
			public void disp() {
				System.out.println("자식 클래스 disp");
			}
		}; //클래스가 없어서 바로 객체 생성({};-메서드를 명시할 수 있는 구간)
		
		//메서드 호출
		i.disp();
	}
	
	public static void main(String[] args) {
		AnonyMain an = new AnonyMain();
		an.make();
	}
}
