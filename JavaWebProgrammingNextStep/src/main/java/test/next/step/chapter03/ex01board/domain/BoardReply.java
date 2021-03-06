package test.next.step.chapter03.ex01board.domain;

public class BoardReply {
	private long replyId;
	private long boardId;
	private long parentReplyId;
	private String replyLevel;
	private String userId;
	private String content;
	private String createdDate;
	
	public BoardReply() { }

	public BoardReply(long replyId, long boardId, long parentReplyId, String replyLevel, String userId, String content,
			String createdDate) {
		this.replyId = replyId;
		this.boardId = boardId;
		this.parentReplyId = parentReplyId;
		this.replyLevel = replyLevel;
		this.userId = userId;
		this.content = content;
		this.createdDate = createdDate;
	}

	public long getReplyId() {
		return replyId;
	}

	public void setReplyId(long replyId) {
		this.replyId = replyId;
	}

	public long getBoardId() {
		return boardId;
	}

	public void setBoardId(long boardId) {
		this.boardId = boardId;
	}

	public long getParentReplyId() {
		return parentReplyId;
	}

	public void setParentReplyId(long parentReplyId) {
		this.parentReplyId = parentReplyId;
	}

	public String getReplyLevel() {
		return replyLevel;
	}

	public void setReplyLevel(String replyLevel) {
		this.replyLevel = replyLevel;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	
	
}
