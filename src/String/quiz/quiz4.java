package String.quiz;

public class quiz4 {

	public static void main(String[] args) {

        String str = "자바 프로그래밍 입문";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        str = str.replace(" ", "");
        System.out.println("공백이 제거된 후의 문자열 길이: " + str.length());  // 공백이 제거된 후의 문자열 길이 출력
        System.out.println(count);
    }
}
//
////TODO Auto-generated method stub
//		String str ="자바 프로그래밍 입문";
//		int count = 0;
//		for(int i = 0; i < str.length(); i++) {
//			 if(str.charAt(i) != ' ') {
//	                count++;
//	            }
//	        }
//	        
//	        System.out.println(count);
//
