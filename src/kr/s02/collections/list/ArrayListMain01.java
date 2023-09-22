package kr.s02.collections.list;

import java.util.ArrayList; //객체의 주소만 저장가능

class A{
	@Override
	public String toString() {
		return "A"; //참조값 -> 재정의한 내용이 보여짐
	}
}
class B{}

public class ArrayListMain01 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		System.out.println("요소의 개수 : "+list.size()); //0
		
		//ArrayList에 객체 저장
		list.add(new A()); //A타입 -> Object
		list.add(new B()); //B타입 -> Object
		list.add("홍길동"); //String타입 -> Object
		list.add(100); //int ->Integer -> Object
		
		//저장된 객체의 명세 출력
		System.out.println(list);
		
		//요소의 개수
		System.out.println("요소의 개수 : "+list.size()); //4
		
		//요소의 개수가 0에서 4개로 늘어남(가변길이)
		//다양한 객체를 저장할 수 잇지만 실제로는 모두 같은 하나의 타입으로 만듬
	}
}
