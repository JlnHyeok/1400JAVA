package Ch12Array;

class C01Person{
	String name;
	int age;
	String addr;
	
	// toString 만들기
	@Override
	public String toString() {
		return "C01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
}

public class C01PersonMain {
	public static void main(String[] args) {
		
		// 클래스 자료형으로 배열을 만들게되면 배열의 각 요소는 객체위치값을 저장하는 참조변수가 된다.
		// 각 요소마다 객체를 생성하여 위치값을 저장해야지만 클래스 배열 사용가능
		C01Person[] list = new C01Person[3];
		// ↑ 이렇게 선언하면 배열의 공간만 할당하는것
		// 각각의 list[0] list[1] list[2]에 객체를 새로 생성해줘야한다. 
		list[0] = new C01Person();
		list[1] = new C01Person();
		list[2] = new C01Person();
		// 아래만 하면 오류 발생!!
		list[0].name="홍길동";
		list[0].age = 55;
		list[0].addr = "창원";
		
		System.out.println("list[0] = "+list[0].toString());
		
	}

}
