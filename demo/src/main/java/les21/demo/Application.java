package les21.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan({"les21.demo"})
@EnableJpaRepositories(basePackages = "les21.demo.dao")

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	

}
