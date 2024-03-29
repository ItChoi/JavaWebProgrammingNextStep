package test.next.step.chapter03.ex01board.domain;

public class Board {
	private int rnum;
	
	private Long boardId;
	private String userId;
	private String title;
	private String content;
	private String image;
	private int hitCount;
	private String createdDate;
	
	public Board() { }

	public Board(int rnum, Long boardId, String userId, String title, 
			String content, String image, int hitCount, String createdDate) {
		this.rnum = rnum;
		this.boardId = boardId;
		this.userId = userId;
		this.title = title;
		this.content = content;
		this.image = image;
		this.hitCount = hitCount;
		this.createdDate = createdDate;
	}

	public int getRnum() {
		return rnum;
	}

	public void setRnum(int rnum) {
		this.rnum = rnum;
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
	
	
	public String getImageSrc() {
		String imageSrc = "";
		String uploadBaseFolder = "/upload";
		
		if (image != null && image != "") {
			imageSrc = uploadBaseFolder + "/" + userId
					 + "/profile/" + image; 
		} else {
			// imageSrc = uploadRoot + uploadBaseFolder + "/" + "기본이미지";
		}
		
		return imageSrc;
	}
	
	
}
