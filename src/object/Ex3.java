package object;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1001, "둘리");
		
		String string ="aa";
		
		if (student1 == student2) {
			System.out.println("student1와 student2의 주소는 같습니다");
		}else {
			System.out.println("student1와 student2의 주소는 다릅니다");
		}
		
		if (student1.equals(string)) {
			System.out.println("student1와 student2의 주소는 같습니다");
		}else {
			System.out.println("student1와 student2의 주소는 다릅니다");
		}
	}

}

class Student {

	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		// 학생의 학번이 같으면 참, 그렇지 않으면 거짓 변환

		// 나의 학번 == obj의 학번 비교

		// obj의 실제 타입이 Student인지 확인
		if (obj instanceof Student) { //재정의를 해서 equals 사용
			Student student = (Student) obj;
			if (this.id == student.id) {
				return true;
			}
		}
		return false;
	}

}
