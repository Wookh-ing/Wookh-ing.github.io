package kr.co.greenart;

import java.sql.SQLException;
import java.util.List;

public class BoardService {
	private BoardDAO dao;

	public BoardService(BoardDAO dao) {
		this.dao = dao;
	}

//	public 목록<게시글> 게시글 목록보기서비스() {	
//	}
	public List<BoardArticle> 게시글목록보기서비스() {
		//필요한 로직을 포함하는 문장들 ~~(트랜잭션 제어 등)
		try {
			return dao.게시글목록가져오기(); // 결과반환
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("데이터를 읽을 수 없습니다.");
		}
	}
	
	
//	게시글적시서비스
//	
//	게시글수정서비스
//	
//	게시글하나내용보기서비스
}
