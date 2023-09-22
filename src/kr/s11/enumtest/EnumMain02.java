package kr.s11.enumtest;

//열거형은 상수를 가지고 생성되는 객체
enum Lesson{
	JAVA,JSP,ORACLE //객체로 생성
}

public class EnumMain02 {
	public static void main(String[] args) { //toString 동작
		System.out.println(Lesson.JAVA);
		System.out.println(Lesson.JSP);
		System.out.println(Lesson.ORACLE);
		
		System.out.println("================");
		
		//열거객체의 문자열을 반환(name())
		System.out.println(Lesson.JAVA.name());
		System.out.println(Lesson.JSP.name());
		System.out.println(Lesson.ORACLE.name());
		
		System.out.println("================");
		
		//열거객체의 순번(0부터 시작)을 반환(ordinal())
		System.out.println(Lesson.JAVA.ordinal());
		System.out.println(Lesson.JSP.ordinal());
		System.out.println(Lesson.ORACLE.ordinal());
	}
}
