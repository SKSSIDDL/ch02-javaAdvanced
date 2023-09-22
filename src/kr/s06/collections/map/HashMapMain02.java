package kr.s06.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapMain02 {
	public static void main(String[] args) {
		String[] msg = {"Berlin","Paris","Seoul","New York","London"};
		       //key    value
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		//HashMap에 key와 value 저장
		for(int i=0; i<msg.length; i++) {
			map.put(i, msg[i]);
		}
		
		//저장된 key와 value 목록 출력
		System.out.println(map);
		System.out.println("==================================================");
		
		//HaspMap은 key만 구하기 불가능
//		Set<Integer> s = map.keySet();
//		Iterator<Integer> keys = s.iterator();
		Iterator<Integer> keys = map.keySet().iterator(); //line 23,24 하나로 합치기
		while(keys.hasNext()) {
			Integer key = keys.next();
			System.out.println(key+" : "+map.get(key));
			                  //key        value
		}
	}
}
