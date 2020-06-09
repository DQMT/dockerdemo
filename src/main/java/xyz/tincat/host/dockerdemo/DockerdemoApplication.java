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
    static {
       SimpleDateFormat sdf = new SimpleDateFormat();
       sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
       msg = sdf.format(new Date());
    }
    @RequestMapping(path = "/",method = RequestMethod.GET)
    public String test() {
        return "Hello world! This application start at： "+msg;
    }

	public static void main(String[] args) {

		SpringApplication.run(DockerdemoApplication.class, args);
	}

}
