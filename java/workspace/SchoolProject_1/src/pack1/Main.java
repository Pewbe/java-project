package pack1;

public class Main {
	public static void main(String[] args) {
		String name = "배수민";
		int age = 17, grade = 1;
		String str = "안녕하세요";

		System.out.println("당신의 이름은 " + name + "입니다.");
		System.out.println("당신은 " + age + "세이며 " + grade + "학년입니다.");
		System.out.println( str );
		System.out.println( age + grade );//수식
		System.out.println( name + age );//문자열 붙힘
		System.out.println( str + " 제 이름은 " + name + "입니다.");
	}
}
