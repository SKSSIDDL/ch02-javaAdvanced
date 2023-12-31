package kr.s02.collections.list4;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ScoreMain {
	/*
	 * [실습]
	 * 1. 멤버변수: ArrayList, BufferedReader 객체를 저장할 수 잇는 변수
	 * 2. 생성자 : ArrayList, BufferedReader 객체를 생성하ㅏ고 callMenu 호출
	 * 3. 메서드 : callMenu, inputScore(성적입력), printScore(성적출력)
	 *           성적 입력 조건 체크(int parseInputData(String course))
	 */
	
	ArrayList<Score> list;
	BufferedReader br;
	
	public ScoreMain() {
		list = new ArrayList<Score>();
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			callMenu();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(br != null) try {br.close();} catch(IOException e){}
		}
	}
	
	public void callMenu() throws IOException{
		while(true) {
			System.out.print("1.성적입력 | 2.성적출력 | 3.종료 : ");
			try {
				int num = Integer.parseInt(br.readLine());
				if(num==1) {
					inputScore();
				}else if(num==2) {
					printScore();
				}else if(num==3) {
					System.out.println("프로그램 종료");
					break;
				}else {
					System.out.println("잘못 입력했습니다.");
				}
			}catch(NumberFormatException e) {
				System.out.println("숫자만 허용");
			}
		}
	}
	
	public void inputScore() throws IOException{
		Score s = new Score();
		System.out.print("이름 : ");
		s.setName(br.readLine());
		
		s.setKorean(parseInputData("국어 : "));
		s.setEnglish(parseInputData("영어 : "));
		s.setMath(parseInputData("수학 : "));
		
		list.add(s);
		System.out.println("성적이 입력되었습니다.");
	}
		
	public void printScore() {
		System.out.println("====================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("====================================================");
		
		for(Score n : list) {
			System.out.printf("%s\t", n.getName());
			System.out.printf("%d\t", n.getKorean());
			System.out.printf("%d\t", n.getEnglish());
			System.out.printf("%d\t", n.getMath());
			System.out.printf("%d\t", n.makeSum());
			System.out.printf("%.2f\t", n.makeAvg());
			System.out.printf("%s%n", n.makeGrade());
		}
	}
	
	//성적조건 체크
	public int parseInputData(String course) throws IOException{
		while(true) {
			System.out.print(course); //과목표시
			try {
				int num = Integer.parseInt(br.readLine());
				if(num<=0 || num>100) {
					throw new ScoreValueException("0부터 100까지의 값만 인정");
				}
				return num; //정상적인 점수(0~100)반환
			}catch(NumberFormatException e) {
				System.out.println("숫자만 입력 가능합니다.");
			}catch(ScoreValueException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void main(String[] args) {
		new ScoreMain();
	}
}
