package Ch09ClassBasic;

public class C02Car {
	// 속성
	// +owner : String
	// +speed : int
	// +fuel  : int
	public String owner;
	public int speed;
	public int fuel;
	
	//기능
	public void Accel() {
		System.out.println(owner+"님의 차의 속도를 증가합니다");
	}
	public void Break() {
		System.out.println(owner+"님의 차의 속도가 감소합니다");
	}
	public void ShowInfo() {
		System.out.printf("%s %d %d",owner,speed,fuel);
	}
	
	
}
