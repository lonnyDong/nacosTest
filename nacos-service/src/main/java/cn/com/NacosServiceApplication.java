package cn.com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description
 * @author yulong
 */
@SpringBootApplication
@EnableSwagger2
public class NacosServiceApplication {
	public static void main(String[] args) {
		new SpringApplication(NacosServiceApplication.class).run(args);
	}
}
