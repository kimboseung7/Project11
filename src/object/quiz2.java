package object;

public class quiz2 {

	public static void main(String[] args) {
		// Object는 모든 클래스의 부모이기 때문에 형변환 가능
		Object obj = new Student(1001, "둘리");

		if (obj instanceof Student) { // 타입 체크
			Student student = (Student) obj; // 다운캐스팅
			System.out.println("학번:" + student.id);
			System.out.println("이름:" + student.name);
		}
	}

}
