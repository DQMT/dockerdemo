package xyz.tincat.host.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerdemoApplication {

    @RequestMapping(path = "hello",method = RequestMethod.GET)
    public String test() {
        return "hello world!";
    }

	public static void main(String[] args) {
		SpringApplication.run(DockerdemoApplication.class, args);
	}

}
