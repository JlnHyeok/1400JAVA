package Ch15UpdownCasting;
/*-------------------------
멤버 메서드 동작 방식
---------------------------
-멤버 메서드는 최초 객체 생성시 정의 부분이 클래스영역(공유메모리)에 저장된다.
-클래스 영역에 저장 : static 변수 , static 메서드, 인스턴스 메서드(1회 이상 호출), 생성자 메서드
-일반 멤버 메서드는 객체 1회이상 생성시 클래스 영역에 저장된다.(재사용성을 위함)

---------------------------

Upcasting
---------------------------
-상위클래스의 참조변수로 하위객체를 연결하는 형태
-상속관계에 있는 모든 하위객체를 연결할 수 있는 형태
-확장된 하위 객체의 멤버에는 접근이 불가능하다 -> Downcasting 작업 -> 접근
---------------------------

Downcasting
---------------------------
-하위클래스의 참조변수 = 상위클래스의 참조변수(상위클래스 객체)
-일반적으로 업캐스팅 된 상태에서, 확장된 멤버에 접근하기위하여
-해당 자료형으로 강제형변환하는 작업

---------------------------*/

class Animal{
	String kind;
	public void Sound() {
		System.out.println("소리낸다.");
	}
}

class Dog extends Animal{
	String name;
	public void Move() {
		System.out.println("이동합니다.");
	}
}

class Cat extends Animal{
	String Catname;
	public void CatMove() {
		System.out.println("고양이가 이동합니다.");
	}
}


public class C01MethodInfo {

	public static void main(String[] args) {
		System.out.println("-------------------");
		Animal a1 = new Animal();	// Nocasting
		Animal a2 = new Animal();	// Nocasting
		System.out.println("-------------------");
		Dog d1 = new Dog();		// Nocasting
		Dog d2 = new Dog();		// Nocasting
		System.out.println("-------------------");
		Animal a3 = new Dog();	// Upcasting (상위클래스 참조변수 = 하위객체) 상위클래스 자료형으로 형변환
								// 상속관계에 있는 수많은 하위 객체들을 하나로 묶어주기위해서 업캐스팅사용
		a3.kind = "포메라니안";
		a3.Sound();
//		a3.name = "뽀삐"	// 업캐스팅된 상태에서는 하위객체의 확장된 멤버에 접근이 불가능하다
//		a3.Move()		// 업캐스팅된 상태에서는 하위객체의 확장된 멤버에 접근이 불가능하다
		
//		Dog down = a3;			// Downcasting, 컴파일 에러 발생(자료형 불일치, 문제의 소지가 있다.)
		Dog down = (Dog)a3;		// --> 강제 형변환 해야함
		down.name="뽀삐";
		down.Move();			// --> 다시 하위객체의 멤버를 사용할 수 있다.
		
		
		//상위클래스 instanceof 하위클래스 = 상속관계여부를 true/false로 확인
		Animal a4 = new Cat(); 	// Upcasting
		if(a4 instanceof Cat) {
			Cat down2 = (Cat)a4;
		}
		else {
			System.out.println("잘못된 다운캐스팅..");
		}
//		Cat down2 = (Cat)a4;			// 정상 Downcasting
		
		if(a4 instanceof Dog) {
			Dog down3 = (Dog)a4;		// 비정상 Downcasting --> 에러발생
		}
		else {
			System.out.println("잘못된 다운캐스팅..");	
		}
		
		
		
	}

}
