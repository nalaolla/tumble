package kr.co.tumble.tumble;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = DataSourceAutoConfiguration.class)
public class TumbleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TumbleApplication.class, args);
	}

}
