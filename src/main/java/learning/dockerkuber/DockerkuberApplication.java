package learning.dockerkuber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DockerkuberApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerkuberApplication.class, args);
	}

}
