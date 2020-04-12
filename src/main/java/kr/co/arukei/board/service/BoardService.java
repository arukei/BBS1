package kr.co.arukei.board.service;

import java.util.List;
import java.util.Map;

import kr.co.arukei.board.entity.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getBoardList() throws Exception;
	
	public void insertBoard(BoardVO boardVO) throws Exception;



}
