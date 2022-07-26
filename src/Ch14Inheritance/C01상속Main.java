package Ch14Inheritance;

// 상속을 쓰는 이유 : 가독성, 유지보수, 확장성 

class Test{
	Test(){
		System.out.println("TEST 생성자 호출");
	}
}

class Point2D extends Test{	// 상위클래스(부모,수퍼)
	public int x;
	public int y;
	
	public Point2D() {
		System.out.println("Point2D 생성자 호출");
	}

	public void ShowXY() {
		System.out.println("X : "+x+" Y : "+y);
	}
	
}

class Point3D extends Point2D{	// Point2D를 상위클래스로 하는 Point3D클래스(하위/서브/자식)
	public int z;
	public void ShowXYZ() {
		ShowXY();
		System.out.println("Z : "+z);
	}
	public Point3D() {
		System.out.println("Point3D 생성자 호출");
	}
}

public class C01상속Main {

	public static void main(String[] args) {
		
		Point3D ob = new Point3D();
		ob.x = 10;
		ob.y = 20;
		ob.ShowXY();
		ob.z=20;		// 하위클래스 확장된 멤버
		ob.ShowXYZ();	// 하위 클래스 확장된 멤버
		
	}

}
