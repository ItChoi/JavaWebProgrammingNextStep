package test.next.step.chapter03.ex01board.domain;

public class BoardReply2 {
	private long reply2Id;
	private long boardId;
	private long replyId;
	private String replyLevel;
	private String userId;
	private String content;
	private String createdDate;
	
	public BoardReply2() { }
	public BoardReply2(long reply2Id, long boardId, long replyId, String replyLevel, String userId, String content, String createdDate) {
		this.reply2Id = reply2Id;
		this.boardId = boardId;
		this.replyId = replyId;
		this.replyLevel = replyLevel;
		this.userId = userId;
		this.content = content;
		this.createdDate = createdDate;
	}

	public long getReply2Id() {
		return reply2Id;
	}

	public void setReply2Id(long reply2Id) {
		this.reply2Id = reply2Id;
	}

	public long getBoardId() {
		return boardId;
	}

	public void setBoardId(long boardId) {
		this.boardId = boardId;
	}

	public long getReplyId() {
		return replyId;
	}

	public void setReplyId(long replyId) {
		this.replyId = replyId;
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