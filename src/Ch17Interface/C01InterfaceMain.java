package Ch17Interface;

interface Controller{
	void ON();
	void OFF();
}
interface Searchable{
	void SearchURL(String url);
}
class TV implements Controller{

	@Override
	public void ON() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void OFF() {
		System.out.println("TV를 끕니다.");
		
	}
	
}

class SmartTV extends TV implements Searchable{

	@Override
	public void SearchURL(String url) {
		System.out.println(url + "로 검색합니다.");
	}
	
}

class Radio implements Controller{

	@Override
	public void ON() {
		System.out.println("라디오를 켭니다.");
		
	}

	@Override
	public void OFF() {
		System.out.println("라디오를 끕니다.");
		
	}
	
}

public class C01InterfaceMain {
	
	public static void TurnOn(Controller remocon) {
		remocon.ON();
	}
	public static void TurnOff(Controller remocon) {
		remocon.OFF();
	}

	public static void main(String[] args) {
		TV tv = new	TV();
		Radio radio = new Radio();
		
		Controller remocon = null;
		
//		remocon = tv;	// Upcasting
//		remocon.ON();
//		remocon.OFF();
//		remocon = radio;	// Upcasting
//		remocon.ON();
//		remocon.OFF();
		
//		TurnOn(tv);
//		TurnOn(radio);
//		TurnOff(tv);
//		TurnOff(radio);
		
		SmartTV stv = new SmartTV();
		stv.ON();
		stv.OFF();
		stv.SearchURL("www.naver.com");
		
		
		
		
	}

}
