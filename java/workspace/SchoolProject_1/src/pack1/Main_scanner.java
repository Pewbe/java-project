package pack1;

import java.util.Scanner;//ctrl + shift + o

public class Main_scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;

		System.out.print("����� �̸�: ");
		name = sc.nextLine();

		System.out.print("����� ����: ");
		age = sc.nextInt();

		System.out.println("����� �̸��� " + name + "�̰�, ���̴� " + age + "�� �Դϴ�.");

		// �Է¹��� �� ������ �� ���
		int a, b;

		System.out.println("ù ��° ���� �Է�: ");
		a = sc.nextInt();

		System.out.println("�� ��° ���� �Է�: ");
		b = sc.nextInt();

		System.out.println("�� ������ ��: " + (a + b));
	}
}
