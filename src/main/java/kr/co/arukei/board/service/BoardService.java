package kr.co.arukei.board.service;

import java.util.List;

import kr.co.arukei.board.entity.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getBoardList() throws Exception;


}
