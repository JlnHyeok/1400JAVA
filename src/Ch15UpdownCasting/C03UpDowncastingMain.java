package Ch15UpdownCasting;

class Computer{
	private String SN;
	private String CPUSpec;
	private String RAMSpec;
	private String DISKSpec;
	
	public Computer(String sN, String cPUSpec, String rAMSpec, String dISKSpec) {
		super();
		SN = sN;
		CPUSpec = cPUSpec;
		RAMSpec = rAMSpec;
		DISKSpec = dISKSpec;
	}

	public String getSN() {
		return SN;
	}
	public void setSN(String sN) {
		SN = sN;
	}
	public String getCPUSpec() {
		return CPUSpec;
	}
	public void setCPUSpec(String cPUSpec) {
		CPUSpec = cPUSpec;
	}
	public String getRAMSpec() {
		return RAMSpec;
	}
	public void setRAMSpec(String rAMSpec) {
		RAMSpec = rAMSpec;
	}
	public String getDISKSpec() {
		return DISKSpec;
	}
	public void setDISKSpec(String dISKSpec) {
		DISKSpec = dISKSpec;
	}
	public void PowerOn() {
		System.out.println("전원을 켭니다");
	}
	public void PowerOff() {
		System.out.println("전원을 끕니다");
	}
	
}
class Notebook extends Computer{
	public int battery;
	
	public Notebook(String sN, String cPUSpec, String rAMSpec, String dISKSpec, int battery) {
		super(sN, cPUSpec, rAMSpec, dISKSpec);
		this.battery = battery;
	}

	public void move() {
		System.out.println(this.getSN()+" 노트북이 이동합니다");
		battery-=5;
	}

	@Override
	public String toString() {
		return "Notebook [battery=" + battery + ", getSN()=" + getSN() + ", getCPUSpec()=" + getCPUSpec()
				+ ", getRAMSpec()=" + getRAMSpec() + ", getDISKSpec()=" + getDISKSpec() + "]";
	}


}

class Tablet extends Computer{
	public String PencilNo;
	public void WritePen() {
		System.out.println(PencilNo+"펜으로 씁니다");
	}
	public Tablet(String sN, String cPUSpec, String rAMSpec, String dISKSpec, String pencilNo) {
		super(sN, cPUSpec, rAMSpec, dISKSpec);
		PencilNo = pencilNo;
	}
	@Override
	public String toString() {
		return "Tablet [PencilNo=" + PencilNo + ", getSN()=" + getSN() + ", getCPUSpec()=" + getCPUSpec()
				+ ", getRAMSpec()=" + getRAMSpec() + ", getDISKSpec()=" + getDISKSpec() + "]";
	}
	
}

public class C03UpDowncastingMain {

	public static void ShowInfo(Computer ref) {
		if(ref instanceof Notebook) {
			Notebook down = (Notebook)ref;
			down.move();
			down.move();	
			System.out.println(down);
		}
		else if(ref instanceof Tablet) {
			Tablet down = (Tablet)ref;
			down.WritePen();
			System.out.println(down);
		}
	}
	public static void main(String[] args) {
		
		Notebook Mycom = new Notebook("1-2-3-4", "I7", "16G", "1T", 100);
		
		
		Tablet mytab = new Tablet("9-8-7-6","I3","8G","128G","Pen-123");
		
		ShowInfo(Mycom);
		ShowInfo(mytab);
		
	}

}
