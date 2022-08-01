package Ch21Collection;

import java.util.ArrayList;
import java.util.List;

public class C01ArrayListMain {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();	// UpCasting , 자료형이 동일하다면 <> 생략가능
		
		list.add("JAVA");
		list.add("JSP");
		list.add("Servlet");
		list.add("Spring framework");
		list.add("Spring boot");
		list.add(1,"TEST");		// 인덱스 1번에 삽입
		
		list.remove(4);			// 인덱스 4번을 삭제
		
		System.out.println("저장 개수 : "+ list.size());
		System.out.println("------------------------");
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("------------------------");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
