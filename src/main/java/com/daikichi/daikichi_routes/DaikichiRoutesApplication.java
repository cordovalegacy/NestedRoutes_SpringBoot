package com.daikichi.daikichi_routes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("/daikichi")
public class DaikichiRoutesApplication {

	public static void main(String[] args) {

		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}

	@RequestMapping("")
	public String index(){
		return("This is the index Daikichi route...Welcome!!");
	}

	@RequestMapping("/today")
	public String nestedRouteOne(){
		return "Today, you will find luck in all your endeavors!";
	}

	@RequestMapping("/tomorrow")
	public String nestedRouteTwo(){
		return "Tomorrow, an opportunity will arise...so be sure to stay open to new ideas!";
	}

}
