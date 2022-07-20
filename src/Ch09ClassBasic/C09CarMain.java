package Ch09ClassBasic;

class C09Car{
	// 속성(멤버변수)
	String owner;
	int speed;
	int fuel;
	C09Car(){	// 디폴트 생성자
		owner = "소유자 없음";
		speed = 10;
		fuel = 10;
	}
	
	
}

// 생성자
// 생성자는 클래스명과 동일하며 반환자료형은 생략한다.
// 객체생성에 필요한 초기값을 지정하는데 사용되는 메서드
// 객체생성시 한번만 호출되며 객체생성이후에는 사용이 불가능하다.
// 클래스 내에서 생성자메서드를 명시하지 않았을때 기본적으로 주입되는 생성자가 있다
// 이를 디폴트 생성자라 한다.
// 디폴트 생성자는 클래스명과 동일하며, 매개변수를 가지지않는다

public class C09CarMain {

	public static void main(String[] args) {
		 C09Car mycar = new C09Car();	// C09Car() : 생성자
		 System.out.println(mycar.owner);
		 System.out.println(mycar.speed);
		 System.out.println(mycar.fuel);
		
		
	}

}
