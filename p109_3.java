// 컵의 사이즈를 받아서 100ml미만은 small, 100ml이상 200ml미만은 medium, 200ml 이상은 large라고 출력하는 연속적인 if-else 문을 작성하시오

import java.util.Scanner;

public class p109_3 {
	public static void main(String args[]) {
		int size;
		
		Scanner input = new Scanner(System.in);
		System.out.print("컵의 사이즈는 몇 ml인가? ");
		size = input.nextInt();
		
		if (size < 100) {
			System.out.println("small");
		} else if ((100 <= size) && (size <200)) {
			System.out.println("medium");
		} else if (200 <= size) {
			System.out.println("large");
		}
	}
}