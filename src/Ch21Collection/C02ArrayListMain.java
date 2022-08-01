package Ch21Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BoardDTO{
	private int no;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	
	public BoardDTO(int no, String title, String content, String writer, String regdate) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "BoardDTO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BoardDTO) {
			BoardDTO down = (BoardDTO)obj;
			return this.no==down.no;
		}
		return false;
	}
	
}

public class C02ArrayListMain {
	
	public static void addDTO(List<BoardDTO> list, BoardDTO dto) {
		list.add(dto);
	}
	public static void ShowDTO(List<BoardDTO> list) {
		for(BoardDTO dto : list) {
			System.out.println(dto.toString());
		}
	}

	public static void main(String[] args) {
		
		List<BoardDTO> list = new ArrayList<>();		// BoardDTO 자료형이 list의 원소로 와야한다.
		// 키보드로 BoardDTO 단위의 값을 하나이상 받아서 list에 저장
		// list에 저장된 BoardDTO를 모두 확인해 보아라.

		addDTO(list,new BoardDTO(1,"제목1","내용1","작성자1","2022-08-01"));
		addDTO(list,new BoardDTO(2,"제목2","내용2","작성자2","2022-08-01"));
		addDTO(list,new BoardDTO(3,"제목3","내용3","작성자3","2022-08-01"));
		addDTO(list,new BoardDTO(4,"제목4","내용4","작성자4","2022-08-01"));
		list.add(new BoardDTO(5,"","","",""));
		ShowDTO(list);
		
		BoardDTO search = new BoardDTO(7,"제목2","내용2","작성자2","2022-08-01");
		
		if(list.contains(search)) {
			System.out.println("존재합니다");
		}
		else {
			System.out.println("존재하지않습니다");
		}
		
//		List<Integer> list2 = new ArrayList<>();
//		list2.add(3);
//		list2.add("3");
		
		
		
		
	}

}
