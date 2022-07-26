package Ch14Inheritance;

class TV{
	private int size;
	public TV(int size) {	// 생성자
		this.size = size;
	}
	protected int getSize() {	// getter 함수	, protected : 상속받은 클래스에서만 쓰겠다
		return size;
	}

}

class ColorTV extends TV{
	int color;

	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	public void printProperty() {
		System.out.println(getSize()+"인치 "+color+"컬러");
	}
}

class IPTV extends ColorTV{
	String ip;

	public IPTV( String ip,int size, int color) {
		super(size, color);
		this.ip = ip;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 "+ip+" 주소의 "+getSize()+"인치 "+color+"컬러");
	}
}

public class C05상속Prac {

	public static void main(String[] args) {
		// 1번 TV 클래스를 상속받은 ColorTV 클래스를 작성
		ColorTV myTV = new ColorTV(32,1024);
		myTV.printProperty();
		// 출력결과 : 32인치 1024컬러
		
		// 2번 ColorTV를 상속받는 IPTV클래스 작성
		IPTV iptv = new IPTV("192.1.1.2",32,2048);
		iptv.printProperty();
		
		
	}

}
