package String;

public class Ex3 {

	public static void main(String[] args) {
		String str = "java";
		System.out.println("str 문자열 주소:" +System.identityHashCode(str));
		
		str = str + " and";
		str = str + " android"; //str에 저장
		System.out.println(str);
		System.out.println("str 문자열 주소:" +System.identityHashCode(str));
		
		StringBuilder buffer = new StringBuilder("java"); //StringBuilder String 이랑 같은기능
		buffer.append(" and"); //buffer에다가 append로 문자열을 더해줌
		buffer.append(" android ");
		System.out.println(buffer.toString());
	}

}
