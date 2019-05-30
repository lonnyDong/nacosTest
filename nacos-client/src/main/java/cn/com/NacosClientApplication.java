package cn.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class NacosClientApplication {
	public static void main(String[] args) {
		new SpringApplication(NacosClientApplication.class).run(args);
	}
}

