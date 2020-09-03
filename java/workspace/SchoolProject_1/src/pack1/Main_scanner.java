package pack1;

import java.util.Scanner;//ctrl + shift + o

public class Main_scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;

		System.out.print("당신의 이름: ");
		name = sc.nextLine();

		System.out.print("당신의 나이: ");
		age = sc.nextInt();

		System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");

		// 입력받은 두 정수의 합 출력
		int a, b;

		System.out.println("첫 번째 정수 입력: ");
		a = sc.nextInt();

		System.out.println("두 번째 정수 입력: ");
		b = sc.nextInt();

		System.out.println("두 정수의 합: " + (a + b));
	}
}
