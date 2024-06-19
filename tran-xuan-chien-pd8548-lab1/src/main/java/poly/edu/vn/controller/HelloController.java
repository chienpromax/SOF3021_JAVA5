package poly.edu.vn.controller;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import poly.edu.vn.domain.User;

@Controller
@RequestMapping("/user")
public class HelloController {
	
	@Autowired
     HttpServletRequest request;

    @Autowired
     HttpSession session;

    @Autowired
     ServletContext context;

	@RequestMapping("/home")
	public String load(Model model) {
		model.addAttribute("mes", "my name is chien");
		return "index";
	}
	
	@GetMapping("create")
	public String create(HttpServletRequest request) {
		return "index";
	}
	@PostMapping("/create")
	public String createPost(HttpServletRequest request) {
		String name = request.getParameter("name");
		System.out.println("==>" + name);
		
		String pass = request.getParameter("pass");
		System.out.println("==>" + pass);
		
		User us = new User(name,pass);
		
		request.setAttribute("us", us);
		return "display";
	}
}
