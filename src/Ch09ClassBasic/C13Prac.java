package Ch09ClassBasic;

import java.util.Scanner;

class Grade{
	int eng;
	int sci;
	int mat;
	double avg;
	Grade(int x, int y, int z){
		this.mat = x;
		this.sci = y;
		this.eng = z;
		this.avg = (this.mat+this.sci+this.eng)/3;
		
		}
	void main() {
		System.out.println("3과목의 평균은 : "+(double)(this.eng+this.mat+this.sci)/3+"입니다.");
		System.out.println("3과목의 평균은 : "+this.avg+"입니다.");}
	}
	
	

public class C13Prac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수학 과학 영어 점수 차례대로 입력 : ");
		int math = sc.nextInt();
		int sci = sc.nextInt();
		int eng = sc.nextInt();
		Grade a = new Grade(math,sci,eng);
		a.main();
		
	}

}
