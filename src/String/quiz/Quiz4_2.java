package String.quiz;

public class Quiz4_2 {

		public static void main(String[] args) {

			System.out.println(getCharCount("자바 프로그래밍 입문")); 

			System.out.println(getCharCount("equals 메소드는 두 객체가 같은지 비교한다")); 

		}
	

	public static int getCharCount(String str) {
		int length = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') { 
				length++;
			}
		}
		return length;
	}
}