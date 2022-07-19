package Ch09ClassBasic;

class C04Person{
	// 이런식으로 클래스 추가 가능
	String name;
	public int age;
	public float height;
	public double weight;
	
	// 기능 추가(멤버 메서드, 멤버 함수)
	void talk() {	// void : 리턴(반환)값이 없다, () <- 매개변수(인자)가 없다.
		System.out.println(name+"님이 말합니다");
	}
	void walk() {
		System.out.println(name+"님이 걷습니다");
	}
	void showInfo() {
		System.out.printf("%s %d %.1f %.1f",name,age,height,weight);
	}
	
}

public class C04PersonMain {

	public static void main(String[] args) {
		C04Person hong = new C04Person();
		// 속성에 데이터 저장
		hong.name ="홍길동";
		hong.age = 55;
		hong.height = 177.6f;
		hong.weight = 66.6f;
		// 기능 사용
		hong.walk();
		hong.talk();
		hong.showInfo();
		
		
		
		
	}

}
