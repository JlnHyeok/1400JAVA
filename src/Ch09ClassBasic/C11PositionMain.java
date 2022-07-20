package Ch09ClassBasic;

class Position{
	int xpos;
	int ypos;
	Position(){
		xpos = 100;
		ypos = 100;
	}
	
	void setpos(int x){
		this.xpos=x;	// this : 만들어진 이 객체의
		this.ypos=0;
	}
	void setpos(int x, int y){
		this.xpos=x;
		this.ypos=y;
	}
	void showInfo() {
		System.out.println(this.xpos +","+ this.ypos);
	}
}

public class C11PositionMain {

	public static void main(String[] args) {
		Position obj = new Position();
		obj.showInfo();
		obj.setpos(10);	// 멤버 xpos에 값이 저장, ypos는 0저장
		obj.showInfo();
		obj.setpos(10,20);	// 멤버 xpos,ypos에 각각 저장
		obj.showInfo();
	
		
	}

}
