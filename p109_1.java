/** 변수 n의 값이 100보다 크거나 같으면 "large", 100보다 작으면 "small"을 출력하는 if-else 문을 작성하라  */

import java.util.Scanner;

public class p109_1 {
	public static void main(String args[]) {
		int n;
		
		Scanner input = new Scanner(System.in);
		System.out.print("변수 n의 값을 입력하시오 ");
		n = input.nextInt();
		
		if (n >= 100) {
			System.out.println("large");
		} else {
			System.out.println("small");
		}
	}
}