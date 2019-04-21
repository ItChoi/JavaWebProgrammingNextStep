package test.next.step.chapter03.ex01board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.next.step.chapter03.ex01board.domain.Board;
import test.next.step.chapter03.ex01board.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardMapper boardMapper;
	
	@Override
	public List<Board> getBoardList() {
		return boardMapper.getBoardList();
	}
	
	@Override
	public Board getBoardByBoardId(long boardId) {
		return boardMapper.getBoardByBoardId(boardId);
	}

}
