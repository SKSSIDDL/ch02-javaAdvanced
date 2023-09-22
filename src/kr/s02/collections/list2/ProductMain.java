package kr.s02.collections.list2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class ProductMain {
		BufferedReader br;
		ArrayList<Product> list;
		
		public ProductMain() {
			list = new ArrayList<Product>(); //밖으로 뺄 수 있음
			try {
				br = new BufferedReader(new InputStreamReader(System.in)); 
				//빼면 try~catch문을 사용할 수 없어서 빼면 안됨, finally에서 자원정리해서 뺄 수 없음
				callMenu();
			}catch(Exception e) {
				e.printStackTrace(); //에러 문구 출력
			}finally {
				if(br != null)try{br.close();}catch(IOException e) {} //한줄로 명시
			}
		}
		
		//메뉴 호출
		public void callMenu() throws IOException{
			while(true) {
				System.out.print("1. 상품입력, 2. 상품목록보기, 3. 종료> ");
				try {
					int num = Integer.parseInt(br.readLine()); //line 17 오류
					if(num ==1) {//상품입력
						input();
					}else if(num ==2){//상품목록보기
						output();
					}else if(num ==3) {//종료
						System.out.println("프로그램 종료");
						break;
					}else {
						System.out.println("잘못 입력했습니다.");
					}
				}catch(NumberFormatException e) { //line 29 오류
					System.out.println("숫자만 허용!!");
				}
				
			}
		}
		
		//상품 정보 입력
		public void input() throws IOException {
			Product p = new Product();
			System.out.print("상품명 : ");
			p.setName(br.readLine());
			System.out.print("상품번호 : ");
			p.setNum(br.readLine());
			System.out.print("가격 : ");
			p.setPrice(Integer.parseInt(br.readLine())); //숫자로 변환
			System.out.print("제조사 : ");
			p.setMaker(br.readLine());
			System.out.print("재고 수: ");
			p.setStock(Integer.parseInt(br.readLine())); //숫자로 변환
			
			//Product를 ArrayList에 저장
			list.add(p);
			System.out.println("상품이 입력되었습니다.");
		}
		
		//상품 정보 출력
		public void output() {
			System.out.println("상품리스트 : 총 상품수("+ list.size() +")");
			System.out.println("상품명\t상품번호\t가격\t제조사\t재고수");
			System.out.println("===========================================");

			//확장  for문
			for(Product pt : list) {
				System.out.printf("%s\t", pt.getName());
				System.out.printf("%s\t", pt.getNum());
				System.out.printf("%,d원\t", pt.getPrice());
				System.out.printf("%s\t", pt.getMaker());
				System.out.printf("%,d%n", pt.getStock());
			}
			System.out.println("===========================================");
		}
		
		public static void main(String[] args) {
			new ProductMain();
			
		}
}
