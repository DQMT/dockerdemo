package xyz.tincat.host.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
@RestController
public class DockerdemoApplication {
    private static String msg;
    @RequestMapping(path = "hello",method = RequestMethod.GET)
    public String test() {
        return "Hello world! This app start at： "+msg;
    }

	public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
                msg = sdf.format(new Date());
		SpringApplication.run(DockerdemoApplication.class, args);
	}

}
