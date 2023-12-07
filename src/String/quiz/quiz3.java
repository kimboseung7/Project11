package String.quiz;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "881120-1068234";
//		System.out.println(str.substring(7,8));
//		if(str.substring(7,8).equals("3") || str.substring(7,8).equals("1")) {
//			System.out.println("성별은 남자입니다");
//		}else if(str.substring(7,8).equals("2") || str.substring(7,8).equals("4")) {
//			System.out.println("성별은 여자입니다");
//		}
		
		
		System.out.println(str.indexOf("-")+1); //성별을
		char gender = str.charAt(7);
		if(gender == '1' || gender == '2') {
			System.out.println("성별은 남자입니다");
		}else {
			System.out.println("성별은 여자입니다");
		}
	}

}
