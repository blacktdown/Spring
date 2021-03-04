package kr.co.kmarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.kmarket.service.MainService;
import kr.co.kmarket.vo.CategoriesVo;
import kr.co.kmarket.vo.ProductsVo;

@Controller
public class MainController {
	
	@Autowired
	private MainService service;
	
	@GetMapping(value = {"/", "/index"})
	public String index(Model model) {
		
		List<CategoriesVo> categories = service.selectCategories();
		List<ProductsVo> hitProducts = service.selectHitProducts();
		List<ProductsVo> bestProducts = service.selectBestProducts();
		List<ProductsVo> recommendProducts = service.selectRecommendProducts();
		List<ProductsVo> newProducts = service.selectNewProducts();
		List<ProductsVo> discountProducts = service.selectDiscountProducts();
		
		model.addAttribute("categories", categories);
		model.addAttribute("hitProducts", hitProducts);
		model.addAttribute("bestProducts", bestProducts);
		model.addAttribute("recommendProducts", recommendProducts);
		model.addAttribute("newProducts", newProducts);
		model.addAttribute("discountProducts", discountProducts);
		
		return "/index";
	}

}
