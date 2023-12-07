package wrapper;

import java.util.ArrayList;

public class Ex3 {

	public static void main(String[] args) {
		ArrayList<Boolean> list = new ArrayList<Boolean>();
	
	//new Boolean(true)로 변환됨. (오토언박싱)
	list.add(true);
	list.add(true);
	list.add(false);
	System.out.println(list);
	
	// list.get(0).booleanValue()으로 변환됨. (언박싱)
	boolean b = list.get(0);
	}

}
