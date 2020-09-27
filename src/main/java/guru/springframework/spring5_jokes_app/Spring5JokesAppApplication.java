package guru.springframework.spring5_jokes_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:chuck-config")
public class Spring5JokesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5JokesAppApplication.class, args);
	}

}
