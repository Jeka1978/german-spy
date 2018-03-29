package troubleshooting.by.sherlock.germanspy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
//@ImportResource(locations = "c:\\tmp\\conf.groovy")
public class GermanSpyApplication {

	public static void main(String[] args) {
		SpringApplication.run(GermanSpyApplication.class, args);
	}
}
