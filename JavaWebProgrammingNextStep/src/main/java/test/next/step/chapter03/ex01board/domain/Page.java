package test.next.step.chapter03.ex01board.domain;

public class Page {
	private int startPage = 1;	// 시작 페이지
	private int endPage = 10;	// 끝 페이지
	private boolean prev;		// 이전
	private boolean next;		// 다음
	private Criteria cri;		// 페이지 정보
	
	public Page() { }
	
	public Page(Criteria cri) {
		this.cri = cri;
		
	}
	
	
}
