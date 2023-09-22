package kr.s02.collections.list;

import java.util.ArrayList;

public class ArrayListMain03 {
	/*
	 * 제네릭 표현: 객체를 생성할 때 객체에 저장할 수 있는 요소의 타입을 지정 (필수적으로 명시)
	 */
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동"); //String
		list.add("김유신"); //String
		//list.add(1000); 
		//ArrayList 객체 생성시 제네릭 표현으로 저장할 요소의 타입을 String으로 지정했기 때문에 Integer타입의 데이터를 저장 불가능
		list.add("박문수"); //String
		
		
		//반복문을 이용한 요쇼의 출력
		for(int i=0; i<list.size(); i++) {
			String name = list.get(i); //<String>사용으로 (String)으로 다운캐스팅 할 필요가 없음
			System.out.println(name);
		}
		System.out.println("=====================");
		//확장 for문을 이용한 요소의 출력
		for(String name : list) {
			System.out.println(name);
		}

	}
}
