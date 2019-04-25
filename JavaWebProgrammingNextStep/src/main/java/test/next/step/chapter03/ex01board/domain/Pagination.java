package test.next.step.chapter03.ex01board.domain;

public class Pagination {
	private int startPage = 1;		// ���� ������
	private int endPage = 10;		// �� ������
	private boolean prev;			// ����
	private boolean next;			// ����
	
	private int totalItemCnt;		// �� �Խñ� ��
	
	private int perItem = 10;		// �������� ������ �Խñ� ��
	private int perPage = 10;		// �� �������� ������ ������ ��
	
	private int curPage = 1;		// ���� ������

	public Pagination() { }

	public Pagination(int startPage, int endPage, boolean prev, boolean next, int totalItemCnt, int perItem,
			int perPage, int curPage) {
		this.startPage = startPage;
		this.endPage = endPage;
		this.prev = prev;
		this.next = next;
		this.totalItemCnt = totalItemCnt;
		this.perItem = perItem;
		this.perPage = perPage;
		this.curPage = curPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTotalItemCnt() {
		return totalItemCnt;
	}

	public void setTotalItemCnt(int totalItemCnt) {
		this.totalItemCnt = totalItemCnt;
	}

	public int getPerItem() {
		return perItem;
	}

	public void setPerItem(int perItem) {
		this.perItem = perItem;
	}

	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public int getCurPage() {
		return curPage;
	}

	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}

	// ����, ���� Ŭ�� ���� ����
	public boolean hasPrev() {
		
		return prev;
	}
	
	public boolean hasNext() {
		
		return next;
	}
	
	
	
	// startPage / endPage / curPage 
	
	
	
}