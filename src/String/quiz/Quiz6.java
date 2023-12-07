package String.quiz;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		
		while (true) {
			Scanner scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			System.out.println("문자입력:" + str);
			
			if (str.equalsIgnoreCase("end"))
				break;
		}
		
	}

}
