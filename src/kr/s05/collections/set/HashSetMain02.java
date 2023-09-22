package kr.s05.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;

public class HashSetMain02 {
	public static void main(String[] args) {
		//HashSet으로 로또 만들기
		HashSet<Integer> hs = new HashSet<Integer>();
		while(hs.size() < 6) {
			int ir = (int)(Math.random()*45)+1; //1부터 45까지 난수 발생
			hs.add(ir); // 중복값을 허용하지 않음
		}
		System.out.print(hs);
		System.out.println(); //단순 줄바꿈
		
		//HashSet -> Set -> Collection
		List<Integer> list = new ArrayList<Integer>(hs); //데이터 복사
		
		//오름차순 정렬
		Collections.sort(list); //list타입으로 받기 때문에 HashSet을 list타입으로 바꿔야함
		
		//확장 for문을 이용하여 출력
		for(int num : list) {
			System.out.print(num +" ");
		}
	}
}
