package object;

public class Ex5 {

	public static void main(String[] args) {

		String str1 = new String("test");

		System.out.println(str1.toString()); // 문자열 값
		System.out.println(str1);

		String str2 = new String("test");

		if (str1.equals(str2)) {
			System.out.println("sr1와 str2은 같은 문자열입니다");
		}
	}
}
