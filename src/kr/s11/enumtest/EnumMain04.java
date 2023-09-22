package kr.s11.enumtest;

enum Gender{
	MALE, FEMALE;
	
	//Object의 toString 재정의
	@Override
	public String toString() {
		switch(this) {
		case MALE:
			return "남자";
		default : //FEMALE
			return "여자";
		}
	}
}

public class EnumMain04 {
	public static void main(String[] args) {
		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		
		System.out.println("==============");
		
		System.out.println(Gender.MALE.toString());
		System.out.println(Gender.FEMALE.toString());
	}
}
