package kr.co.farmstory.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.farmstory.service.BoardService;
import kr.co.farmstory.vo.BoardVo;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@GetMapping("/board/list")
	public String list(String group, String cate, Model model) {
		
		model.addAttribute("group", group);
		model.addAttribute("cate", cate);
		return "/board/list";
	}

	@GetMapping("/board/modify")
	public String modify() {
		return "/board/modify";
	}

	@GetMapping("/board/view")
	public String view() {
		return "/board/view";
	}

	@GetMapping("/board/write")
	public String write(String group, String cate, Model model) {
		
		model.addAttribute("group", group);
		model.addAttribute("cate", cate);
		
		return "/board/write";
	}
	
	@PostMapping("/board/write")
	public String write(String group, String cate, BoardVo vo, HttpServletRequest req) {
		
		String regip = req.getRemoteAddr();
		vo.setRegip(regip);
		
		service.insertArticle(vo);
		
		return "redirect:/board/list?group="+group+"&cate="+cate;
	}

}
