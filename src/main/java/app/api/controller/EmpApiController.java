package app.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/emp")
public class EmpApiController {

	@GetMapping("/test")
	public String empApi() {
		return "emp api controller";
	}
}
