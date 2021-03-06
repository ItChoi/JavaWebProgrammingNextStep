package test.next.step.chapter03.ex01board.mapper;

import java.util.List;

import test.next.step.chapter03.ex01board.domain.Board;
import test.next.step.chapter03.ex01board.domain.BoardReply;

public interface BoardMapper {
	List<Board> getBoardList();
	Board getBoardByBoardId(long boardId);
	List<BoardReply> getBoardReplyByBoardId(long boardId);
	int getBoardReplyCountByBoardId(long boardId);
}
