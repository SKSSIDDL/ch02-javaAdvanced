package kr.s02.collections.list;

import java.util.ArrayList;

public class ArrayListMain04 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동"); //0
		list.add("박문수"); //1
		list.add("김유신"); //2
		list.add("이순신"); //3
		list.add("홍길동"); //4
		
		//반복문을 이용한 요소의 출력
		for(int i=0; i<list.size(); i++) {
			String name = list.get(i);
			System.out.println(i+" : " + name);
		}
		System.out.println("==============");
		
		//요소의 삭제(요소 or 인덱스)
//1		list.remove(2); //인덱스
//2		list.remove("홍길동"); //요소(중복된 데이터가 있으면 동시에 삭제하는 것이 아니라 앞에서부터 삭제됨)
		for(int i=0; i<list.size(); i++) {
			String name = list.get(i);
			System.out.println(i+" : " + name); //맨위 홍길동 삭제, 인덱스 변동
		}
		System.out.println("==============");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(40);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(40);
		
		for(int i=0;i<list2.size(); i++) {
			Integer num = list2.get(i);
			System.out.println(i+" : "+ num);
		}
		System.out.println("==============");
		
		//요소의 삭제
//1		list2.remove(2); //인덱스
//2		list2.remove(Integer.valueOf(40)); //요소(Integer.valueOf(), int -> Integer
		//list2.remove(40); //인덱스 40이 없기 때문에 오류
		for(int i=0;i<list2.size(); i++) {
			Integer num = list2.get(i);
			System.out.println(i+" : "+ num);
		}
		System.out.println("==============");
		
		//요소의 변경
		      //인덱스 요소
		list2.set(1, 30); //인덱스 1번요소를 30으로 바꾼다
		for(int i=0;i<list2.size(); i++) {
			Integer num = list2.get(i);
			System.out.println(i+" : "+ num);
		}
	}
}
