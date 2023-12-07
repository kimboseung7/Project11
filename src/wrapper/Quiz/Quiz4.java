package wrapper.Quiz;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {
//		문자를 저장하는 리스트를 생성하고 'a','b','c','d' 를 저장하세요
//		그리고 리스트 안에 저장된 모든 문자를 꺼내서 출력하세요
		
		ArrayList<Character>  list = new ArrayList<Character>();
		list.add('a'); //new Character('a') 오토박싱
		list.add('b');
		list.add('c');
		list.add('d');
		
		for(int i = 0; i <list.size(); i++) {
			Character ch = list.get(i); //list.get(i).characterValue()으로 언박싱
			System.out.println(ch);
		}
				

	}

}
