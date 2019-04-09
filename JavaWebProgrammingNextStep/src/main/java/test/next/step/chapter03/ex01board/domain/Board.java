package test.next.step.chapter03.ex01board.domain;

public class Board {
	private Long boardId;
	private Long memberId;
	private String title;
	private String image;
	private int hitCount;
	private String createdDate;
	
	public Board() { }
	public Board(Long boardId, Long memberId, String title, String image, int hitCount, String createdDate) {
		this.boardId = boardId;
		this.memberId = memberId;
		this.title = title;
		this.image = image;
		this.hitCount = hitCount;
		this.createdDate = createdDate;
	}


	public Long getBoardId() {
		return boardId;
	}
	public void setBoardId(Long boardId) {
		this.boardId = boardId;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
