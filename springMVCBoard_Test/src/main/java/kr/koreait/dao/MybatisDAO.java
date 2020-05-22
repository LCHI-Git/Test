package kr.koreait.dao;

import java.util.ArrayList;
import java.util.HashMap;

import kr.koreait.vo.MvcBoardVO;

//	xml 파일의 sql 명령을 실행하는 인터페이스
public interface MybatisDAO {

	int selectCount();
	ArrayList<MvcBoardVO> selectList(HashMap<String, Integer> hmap);
	void insert(String name, String subject, String content);
	void insert(MvcBoardVO mvcBoardVO);
	void increment(int idx);
	MvcBoardVO selectByIdx(int idx);
	void delete(int idx);
	void update(MvcBoardVO mvcBoardVO);
	void replyIncrement(HashMap<String, Integer> hmap);
	void replyInsert(MvcBoardVO mvcBoardVO);
	
}






















