package Ch09ClassBasic;
class Calc{
	
	int sum(int x, int y) {
		System.out.println("SUM(x,y) 호출!");
		return x+y;
	}
	int sum(int x, int y, int z) {	// 오버로딩
		System.out.println("SUM(x,y,z) 호출");
		return x+y+z;
	}
	int sum(String str1, String str2) {
		System.out.println(str1+str2);
		return 0;
	}
	
} 

// MethodOverloading : 함수의 이름을 동일하게 두고 매개변수를 다양해게 들 수있도록 허용, 리턴자료형이 같은것
public class C10MethodOverloading {

	public static void main(String[] args) {
		Calc obj = new Calc();
		obj.sum(10,20);
		obj.sum(10,20,30);
		obj.sum("홍길동", " 입니다");
		
		
	}

}
