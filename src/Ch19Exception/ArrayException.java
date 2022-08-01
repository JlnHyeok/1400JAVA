package Ch19Exception;

public class ArrayException {

	public static void main(String[] args) {
		try {
		int [] arr = new int[3];
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("실행코드 1");
		System.out.println("실행코드 2");
		
		
		
	}

}
