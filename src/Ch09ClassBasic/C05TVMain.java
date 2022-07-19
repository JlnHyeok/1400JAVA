package Ch09ClassBasic;
class TV{
	String coporation;
	int year;
	int inch;
	public void showInfo() {
		System.out.printf("회사 : %s / 년도 : %d / 인치 : %d 입니다",coporation,year,inch);
	}
}
public class C05TVMain {

	public static void main(String[] args) {
		TV myTV = new TV();
		myTV.coporation = "LG";
		myTV.year=2022;
		myTV.inch=32;
		myTV.showInfo();
		
		
	}

}
