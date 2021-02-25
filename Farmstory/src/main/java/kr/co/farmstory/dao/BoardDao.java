package kr.co.farmstory.dao;

import org.springframework.stereotype.Repository;

import kr.co.farmstory.vo.BoardVo;

@Repository
public interface BoardDao {
	
	public void insertArticle(BoardVo vo);
	public void selectArticle();
	public void selectArticles();
	public void updateArticle();
	public void deleteArticle();

}
