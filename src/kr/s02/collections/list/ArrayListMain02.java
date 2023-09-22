package kr.s02.collections.list;

import java.util.ArrayList;

public class ArrayListMain02 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동"); //String->Object
		list.add("장영실"); //String->Object
		list.add("박문수"); //String->Object
		list.add("김유신"); //String->Object
		
		//저장된 요소의 명세
		System.out.println(list); //실제론 다 주소 저장
		System.out.println("===================");
		
		//반복문을 이용한 요소의 출력
		for(int i=0; i<list.size(); i++) {
			String name = (String)list.get(i); //Object -> String(다운캐스팅)
			//list에 다른 타입이 끼어들면 String으로 다운캐스팅 시 오류발생
			System.out.println(name);
		}
	}
}
