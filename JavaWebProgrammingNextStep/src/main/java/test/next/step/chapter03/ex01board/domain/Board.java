package test.next.step.chapter03.ex01board.domain;

public class Board {
	private int rownum;
	
	private Long boardId;
	private String userId;
	private String title;
	private String content;
	private String image;
	private int hitCount;
	private String createdDate;
	
	public Board() { }
	public Board(int rownum, Long boardId, String userId, String title, String image, int hitCount, String createdDate) {
		this.rownum = rownum;
		this.boardId = boardId;
		this.userId = userId;
		this.title = title;
		this.image = image;
		this.hitCount = hitCount;
		this.createdDate = createdDate;
	}

	public int getRownum() {
		return rownum;
	}
	public void setRownum(int rownum) {
		this.rownum = rownum;
	}
	public Long getBoardId() {
		return boardId;
	}
	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
