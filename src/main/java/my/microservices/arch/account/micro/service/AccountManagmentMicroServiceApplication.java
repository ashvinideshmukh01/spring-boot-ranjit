package my.microservices.arch.account.micro.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountManagmentMicroServiceApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new 
		
		SpringApplication.run(AccountManagmentMicroServiceApplication.class, args);
	}

}
