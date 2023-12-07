package String.quiz;

import java.util.Scanner;

public class quiz5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		for(int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		
		
	}

}
//StringBuilder 클래스 
//		StringBuilder builder = new StringBuilder(str);
//		builder.reverse();
//		System.out.println(builder.toString());