package kr.s06.collections.map;

import java.util.HashMap;

public class HashMapMain01 {
	public static void main(String[] args) {
		/*
		 * Map : key와 value의 쌍으로 데이터를 저장
		 */
		       //key    value
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		//key와 value 쌍으로 저장
		       //key  value
		map.put("김신", 95);
		map.put("지은탁", 100);
		map.put("저승사자", 85);
		map.put("써니", 93);
		map.put("유덕화", 70);
		
		//key와 value의 null 인정
		map.put("홍길동", null); 
		map.put(null, 100); 
		map.put("지은탁", 0); //key 중복->value값 덮어씌움(100->0)
		
		//저장된 key, value 목록 출력
		System.out.println(map); //입력한 순서대로 출력되지 않음(정렬이 보장되지 않음)
		System.out.println("=================================================================");
		
		//성적구하기
		                      //key
		Integer num = map.get("지은탁");
		System.out.println("지은탁의 성적은 " +num+"점");
	}
}
