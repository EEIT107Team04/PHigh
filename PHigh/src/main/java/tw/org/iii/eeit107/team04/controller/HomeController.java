package tw.org.iii.eeit107.team04.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tw.org.iii.eeit107.team04.entity.MemberBean;
import tw.org.iii.eeit107.team04.service.impl.MemberServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	MemberServiceImpl service;
	
	@RequestMapping("/")
	public String home() {
		return "GoogleFitnessTest";
	}
	
	@RequestMapping("/home")
	public String homePage() {
		return "index";
	}
	
	@RequestMapping("/addMember")
	public String addMember(MemberBean mb,Model model) {
		service.createMember(mb);
		model.addAttribute("Member",mb);
		return "showMember";
	}

}
