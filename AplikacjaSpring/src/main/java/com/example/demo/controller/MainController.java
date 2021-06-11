package com.example.demo.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Entity.Moder;
import com.example.repository.IModerRepository;

@Controller
public class MainController {
	//@Autowired
	IModerRepository iModerRepository;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="") String name, Model model) {
		model.addAttribute("name", name);
		List<Moder> list = (List<Moder>) iModerRepository.findAll();
		int size = list.size();
		int a = new Random().nextInt(size);
		
		model.addAttribute("Moder",list.get(a));
		return "greeting";

}
	@GetMapping("/list/podzepsol")
	public String podzespol(Model model) {
		//List<>
		//model.addAttribute("name", name);
		return "greeting";

}
}
