package com.selfstudy.proxystart;

import com.selfstudy.proxystart.config.AppV1Config;
import com.selfstudy.proxystart.config.AppV2Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@Import(AppV1Config.class)
@Import(AppV2Config.class)
@SpringBootApplication(scanBasePackages = "com.selfstudy.proxystart")
public class ProxyStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyStartApplication.class, args);
	}

}
