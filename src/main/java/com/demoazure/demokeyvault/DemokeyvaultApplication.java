package com.demoazure.demokeyvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class DemokeyvaultApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemokeyvaultApplication.class, args);
	}

	@GetMapping()
	public String myHeart(){
		return "index";
	}


}
