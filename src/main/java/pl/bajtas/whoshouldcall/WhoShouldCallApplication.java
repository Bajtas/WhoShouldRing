package pl.bajtas.whoshouldcall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"pl.bajtas.squaremoose.api.config"})
@EnableAutoConfiguration
public class WhoShouldCallApplication {
    public static void main(String[] args) {
        SpringApplication.run(WhoShouldCallApplication.class, args);
    }
}