package object.quiz;

public class quiz1 {

	public static void main(String[] args) {
		MyDate date1 = new MyDate(2022, 10, 26);
		MyDate date2 = new MyDate(2022, 10, 26);

		if (date1 == date2) {
			System.out.println("date1과 date2의 주소는 같습니다");
		} else {
			System.out.println("date1과 date2의 주소는 같습니다");
		}
		if (date1.equals(date2)) {
			System.out.println("date1와 date2의 주소는 같습니다");
		} else {
			System.out.println("date1와 date2의 주소는 다릅니다");
		}
	}	

}

class MyDate {
	int year;
	int month;
	int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate myDate = (MyDate) obj;
			if (this.year == myDate.year && this.month == myDate.month && this.day == myDate.day) {
				return true;
			}
		}
		return false;
	}

}