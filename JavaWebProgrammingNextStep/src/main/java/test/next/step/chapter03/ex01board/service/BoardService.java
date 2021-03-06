package test.next.step.chapter03.ex01board.service;

import java.util.List;

import test.next.step.chapter03.ex01board.domain.Board;
import test.next.step.chapter03.ex01board.domain.BoardReply;

public interface BoardService {
	List<Board> getBoardList();
	Board getBoardByBoardId(long boardId);
	List<BoardReply> getBoardReplyByBoardId(long boardId);
	int getBoardReplyCountByBoardId(long boardId);
}
