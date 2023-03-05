package pl.sages.jdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "pl.sages")
//@ComponentScan("pl.sages")
//@ComponentScan()
public class JdpApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdpApplication.class, args);
	}

}
