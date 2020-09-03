package pack1;

import java.util.Scanner;

public class Main_4 {
	public static void main(String[] args) {
//		1
//		int n;
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("정수 입력: ");
//		n = sc.nextInt();
//
//		for (int i = 1; i <= n; i++)
//			if (i % 2 == 0)
//				System.out.print(i + " ");
//
//		System.out.println();

//		2
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++)
//				if (j <= i)
//					System.out.print("*");
//			System.out.println();
//		}
//
//		System.out.println();

//		3
//		for (int a = 1; a <= 20; a++)
//			for (int b = 1; b <= 20; b++)
//				for (int c = 1; c <= 20; c++)
//					if ((a * a) + (b * b) == (c * c))
//						System.out.println(a + " " + b + " " + c);

//		4
//		int v = (int)(Math.random()*7);
//		
//		System.out.println( v );

//		5
//		int total = 0;
//		
//		for(int i=0; i<20; i++)
//			if( i%2 != 0 || i%3 != 0 )
//				total += i;
//		
//		System.out.println("총합: " + total);

//		6
		int n = (int) (Math.random() * 101);
		int ans;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1~100 의 정수를 입력: ");
			ans = sc.nextInt();

			if (ans == n)
				break;
			else {
				if (ans > n)
					System.out.println(ans + "보다 작습니다.");
				else
					System.out.println(ans + "보다 큽니다.");
			}
		}
		System.out.println("정답입니다!");
	}
}