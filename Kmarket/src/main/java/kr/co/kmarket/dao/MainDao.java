package kr.co.kmarket.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.co.kmarket.vo.CategoriesVo;
import kr.co.kmarket.vo.ProductsVo;

@Repository
public interface MainDao {
	
	public List<CategoriesVo> selectCategories();
	
	public List<ProductsVo> selectHitProducts();
	public List<ProductsVo> selectBestProducts();
	public List<ProductsVo> selectRecommendProducts();
	public List<ProductsVo> selectNewProducts();
	public List<ProductsVo> selectDiscountProducts();
	
}
