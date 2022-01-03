package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.boot.entity.Theme;
import com.spring.boot.repository.ThemeRepository;


@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	ThemeRepository trepo;
	
	@GetMapping("/adminpage")
	public String adminpage(Theme theme, Model model) {
		
		
		System.out.println("관리자페이지 이동하기");
		
		List<Theme> themeListAll = trepo.findAll();
		model.addAttribute("themeListAll", themeListAll);
		
		
		return "admin/adminpage";
	}
	
	@PostMapping("/themeInsert")
	public void themeInsert(Theme theme) {
		
		System.out.println("테마 insert 전");
		trepo.save(theme);
		
		System.out.println("테마 insert 완료");
		
	}
	
}
