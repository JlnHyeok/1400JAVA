package Ch09ClassBasic;

class Calculator{
	int sum(int x, int y) {
		return x+y;
	}
	
	int sub(int x, int y) {
		return x-y;
	}
	
	void mul(int x, int y) {
		System.out.printf("%d x %d = %d\n",x,y,x*y);
	}
	
	void div(int x, int y) {
		System.out.printf("%d / %d = %.2f\n",x,y,(double)x/y);
	}
}

public class C07MethodTest {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		
		int r1 = cal.sum(10,20);
		System.out.println("r1 : "+r1);
		int r2 = cal.sub(50,30);
		System.out.println("r2 : "+r2);
		cal.mul(5, 6);
		cal.div(10, 2);
		
	
	}

}
