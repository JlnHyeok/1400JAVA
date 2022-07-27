package Ch15UpdownCasting;

class Person{
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
}
class Employee  extends Person{
	String dept;

	public Employee(String name, String dept) {
		super(name);
		this.dept = dept;
	}
}
class PartTimer extends Employee{
	String hourlyPay;

	public PartTimer(String name, String dept, String hourlyPay) {
		super(name, dept);
		this.hourlyPay = hourlyPay;
	}

	@Override
	public String toString() {
		return "PartTimer [name=" + name + ", dept=" + dept + ", hourlyPay=" + hourlyPay + "]";
	}
}
class Regular extends Employee{
	String salary;

	public Regular(String name, String dept, String salary) {
		super(name, dept);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Regular [name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
}


public class C02UpDowncastingMain {
	
	public static void ShowInfo(Person person) {	// 상속관계의 상위 클래스, 하위객체를 연결할 수 있는 매개변수
													// Person person = ob1; --> 업캐스팅
		System.out.println(person.name); 			// Person클래스의 멤버변수라서 접근 가능
//		System.out.println(person.dept);			// Employee클래스에서 물려준 멤버변수 --> 접근x
		
		if(person instanceof PartTimer) {
			PartTimer p1 = (PartTimer)person;
			System.out.println(p1);
		}
		else if(person instanceof Regular) {
			Regular p1 = (Regular)person;
			System.out.println(p1);
		}
		
	}
	
	public static void main(String[] args) {
		
		PartTimer ob1 = new PartTimer("홍길동", "인사부", "20000원");
		ShowInfo(ob1);
		Regular ob2 = new Regular("김첨지", "영업부", "3500만");
		ShowInfo(ob2);
		
		
	}

}
