package Ch20Generic;

class Simple<T,S>{
	T x;
	S y;
	
}

public class C02Generic {

	public static void main(String[] args) {
		
		Simple<String,String> ob1 = new Simple();	// 자료형이 일치한다면 제너릭 생략가능
		ob1.x = "문자열1"; ob1.y = "문자열2";
		
		Simple<Integer,Double> ob2 = new Simple<>();
		ob2.x = 10; ob2.y=10.5;	
		
	}

}
