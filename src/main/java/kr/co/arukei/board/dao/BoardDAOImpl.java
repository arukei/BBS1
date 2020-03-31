package kr.co.arukei.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;


import kr.co.arukei.board.entity.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<BoardVO> getBoardList() throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return sqlSession.selectList("kr.co.arukei.board.boardMapper.getBoardList");

	}

	@Override
	public BoardVO getBoardContent(int bid) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return sqlSession.selectOne("kr.co.arukei.board.boardMapper.getBoardContent", bid);

	}

	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return sqlSession.insert("kr.co.arukei.board.boardMapper.insertBoard", boardVO);

	}

	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return sqlSession.update("kr.co.arukei.board.boardMapper.updateBoard", boardVO);

	}

	@Override
	public int deleteBoard(int bid) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return sqlSession.insert("kr.co.arukei.board.boardMapper.deleteBoard", bid);


	}

	@Override
	public int updateViewCnt(int bid) throws Exception {
		// TODO 自動生成されたメソッド・スタブ
		return sqlSession.update("kr.co.arukei.board.boardMapper.updateViewCnt", bid);

	}

}
