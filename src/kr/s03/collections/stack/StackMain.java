package kr.s03.collections.stack;

import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		String[] array = {"진달래","백합","개나리","벚꽃","장미"};
		
		//Stack의 구조: 후입선출 LIFO(Last-In-First-Out) 방식
		Stack<String> stk = new Stack<String>();
		
		for(int i=0; i<array.length; i++) {
			stk.push(array[i]); //push로 데이터 넣기
		}
		//요소의 목록 출력
		System.out.println(stk);
		System.out.println("===========================");
		
		//반복문을 이용한 요소의 출력
		while(!stk.isEmpty()) {//비워져 있지 않다= 데이터가 있다 = true
			System.out.print(stk.pop()+"\t"); //pop= stack에 저장된 객체를 꺼냄->저장된 객체는 지워짐
		}
		System.out.println("\n===========================");
		System.out.println(stk); //다 빠지고 []
	}
}
