package kr.co.arukei.board.dao;

import java.util.List;
import kr.co.arukei.board.entity.BoardVO;

public interface BoardDAO {

	// 프로젝트 생성 -> 동작확인 -> 디비연동(JDBC or JAVA) -> mybatis ok -> ERROR! -> 코드이행
	
	public List<BoardVO> getBoardList() throws Exception;

	public BoardVO getBoardContent(int bid) throws Exception;

	public int insertBoard(BoardVO boardVO) throws Exception;

	public int updateBoard(BoardVO boardVO) throws Exception;

	public int deleteBoard(int bid) throws Exception;

	public int updateViewCnt(int bid) throws Exception;

}



