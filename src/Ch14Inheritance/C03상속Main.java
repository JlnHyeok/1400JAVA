package Ch14Inheritance;

class Employee{
	String name;
	int age;
	int time;
	public Employee(String name, int age, int time) {
		this.name = name;
		this.age = age;
		this.time = time;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", time=" + time + "]";
	}
	
}
class PartTimer extends Employee{
	int pay_time;
	int contract_day;
	public PartTimer(String name, int age, int time, int pay_time, int contract_day) {
		super(name, age, time);
		this.pay_time = pay_time;
		this.contract_day = contract_day;
	}
	@Override
	public String toString() {
		return "PartTimer [name=" + name + ", age=" + age + ", time=" + time + ", pay_time=" + pay_time
				+ ", contract_day=" + contract_day + "]";
	}


	
}
class Regular extends Employee{
	int pay_year;
	String pos;
	public Regular(String name, int age, int time, int pay_year, String pos) {
		super(name, age, time);
		this.pay_year = pay_year;
		this.pos = pos;
	}
	@Override
	public String toString() {
		return "Regular [name=" + name + ", age=" + age + ", time=" + time + ", pay_year=" + pay_year + ", pos=" + pos
				+ "]";
	}

}

public class C03상속Main {

	public static void main(String[] args) {
		PartTimer hong = new PartTimer("홍길동",55,4,20000,90);
							// 이름, 나이, 근무시간, 시급, 계약일수
		Regular kim = new Regular("김상중",44,8,3800,"대리");
							// 이름, 나이, 근무시간, 연봉, 직책		
		
		System.out.println(hong.toString());
		System.out.println(kim.toString());
	}

}
