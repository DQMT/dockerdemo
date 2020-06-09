package xyz.tincat.host.dockerdemo;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        //此处的DockerdemoApplication.class为带有@SpringBootApplication注解的启动类
        return builder.sources(DockerdemoApplication.class);
    }

}
