package restfulwebservices.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import restfulwebservices.demo.helloworld.pojo.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloworld()
	{
		return "helloworld";
		
	}
	
	@GetMapping("/helloworld-bean")
	public HelloWorldBean helloworldbean()
	{
		return new HelloWorldBean("helloworld");
		
	}
	@GetMapping("/helloworld/{name}")
	public HelloWorldBean helloworldwithPathVariable(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("HelloWorld %s", name));
		
	}

} 
