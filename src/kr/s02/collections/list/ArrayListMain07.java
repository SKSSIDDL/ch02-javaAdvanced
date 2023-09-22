package kr.s02.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain07 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 로또 프로그램 제작
		 * 1~45까지 중복되지 않는 6개의 숫자를 구해서 ArrayList에 저장하고 출력하시오.
		 * 출력할 땐 오름차순으로 정렬하시오.
		 */
		
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			
			for(int j=0; j<i; j++) {
				if(lotto[j]==lotto[i]) {
					i--;
					break;
				}
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("로또 번호 : ");
		for(int i =0; i<lotto.length; i++) {
			list.add(lotto[i]);
		}
		Collections.sort(list);
		System.out.println(list);
	}
}
