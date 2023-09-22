package kr.s07.inner.member;

class Outer{
	//멤버 변수
	int x = 100;
	
	//멤버 내부클래스
	class Inner{
		int y = 200;
	}
}
public class MemberMain01 {
	public static void main(String[] args) {
		Outer ot = new Outer();
		Outer.Inner oi = ot.new Inner();
		  //자료형      //Outer 접근해서 Inner 생성
		System.out.println("x = "+ot.x);
		System.out.println("y = "+oi.y);
	}
}
