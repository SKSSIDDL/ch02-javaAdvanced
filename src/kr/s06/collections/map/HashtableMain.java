package kr.s06.collections.map;

import java.util.Hashtable;
import java.util.Enumeration; //열거법

public class HashtableMain {
	public static void main(String[] args) {
				//key     value
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("name", "홍길동");
		ht.put("age", "27");
		ht.put("tel", "010-1234-5678");
		ht.put("job", "경찰");
		ht.put("address", "서울시");
		//ht.put("hobby", null); //에러(HashMap은 가능하지만 Hashtable은 불가능)
		//ht.put(null, "300"); //에러
		ht.put("name", "박문수"); //key 중복시 value 덮어씌우기
		
		//저장된 key, value 목록 출력
		System.out.println(ht);
		System.out.println("=============================================================");
		
		String name = ht.get("name");
		System.out.println("이름 : "+name);
		System.out.println("=============================================================");

		//Enumeration을 이용해 key, value 구하기, Iterator의 부모
		Enumeration<String> en = ht.keys();
		while(en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println("key : "+key+", value : "+ht.get(key));
		}
		
	}
}
