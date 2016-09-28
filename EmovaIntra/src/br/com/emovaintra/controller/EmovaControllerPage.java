package br.com.emovaintra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.emovaintra.bean.Users;
import br.com.emovaintra.dao.DaoUsers;

@Controller
public class EmovaControllerPage {

	// Index da p�gina
	@RequestMapping("")
	public String home() {
		System.out.println("Foi para a p�gina");
		return "home";
	}
	
	// Index da p�gina
	@RequestMapping("index")
	public String index() {
		return "home";
	}
	
	// Index da p�gina
	@RequestMapping("home")
	public String home1() {
		return "home";
	}
	
	@RequestMapping("add")
	public String add( Users user){
		
		DaoUsers dao = new DaoUsers();
		dao.adiciona(user);
		return "OK";
	}

	@RequestMapping("ok")
	public String ok(){
		return "OK";
	}
}
