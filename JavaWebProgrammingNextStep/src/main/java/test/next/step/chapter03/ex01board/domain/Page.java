package test.next.step.chapter03.ex01board.domain;

public class Page {
	private int startPage = 1;	// ���� ������
	private int endPage = 10;	// �� ������
	private boolean prev;		// ����
	private boolean next;		// ����
	private Criteria cri;		// ������ ����
	
	public Page() { }
	
	public Page(Criteria cri) {
		this.cri = cri;
		
	}
	
	
}
