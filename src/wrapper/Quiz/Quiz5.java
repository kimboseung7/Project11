package wrapper.Quiz;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		// Scanner 클래스의 nextLine메소드를 사용하여 정수 두개를 입력받으세요

		// 그리고 두 정수를 더한 결과를 출력하세요 10, 5 => 15
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String str2 = scanner.nextLine();
		
		
		int num1 = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		System.out.println(num1 + num2);

	}

}
