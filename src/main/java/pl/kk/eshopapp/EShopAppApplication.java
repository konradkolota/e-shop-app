package pl.kk.eshopapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import pl.kk.eshopapp.configuration.SpringSecurityConfig;


@ComponentScan("pl.kk")
@Import(SpringSecurityConfig.class)
@SpringBootApplication
public class EShopAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(EShopAppApplication.class, args);
    }
}
