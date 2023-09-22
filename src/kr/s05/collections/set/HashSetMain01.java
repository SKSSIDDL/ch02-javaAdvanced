package kr.s05.collections.set;

import java.util.HashSet;
import java.util.Iterator; //반복하다

public class HashSetMain01 {
	public static void main(String[] args) {
		//HashSet : 중복값을 불허
		String[] str = {"Java","JSP","Java","Oracle"};
		
		HashSet<String> hs = new HashSet<String>();
		
		//확장 for문을 이요한 배열의 요소 호출
		for(String n : str) {
			hs.add(n); //중복 불허
		}
		
		//저장된 요소의 목록 호출
		System.out.println(hs);
		System.out.println("====================");
		
		//저장된 요소 출력
		Iterator<String> ir = hs.iterator();
		while(ir.hasNext()) { //데이터가 잇는지 없는지 검증
			System.out.println(ir.next()); //검증 데이터 뽑아내기
		}
		System.out.println("====================");
		
		//확장 for문을 이용한 요소 출력
		for(String s : hs) {
			System.out.println(s);
		}
	}
}
